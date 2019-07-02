package com.kzdata.jmcloud.portal.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kzdata.jmcloud.common.enums.ResultCode;
import com.kzdata.jmcloud.common.model.dto.ReturnValueLoader;
import com.kzdata.jmcloud.common.util.security.JWTUtil;
import com.kzdata.jmcloud.common.util.security.RSAUtil;
import com.kzdata.jmcloud.portal.dao.UserDao;
import com.kzdata.jmcloud.portal.enums.EnableIdentity;
import com.kzdata.jmcloud.portal.inter.IUserLoginCheckService;
import com.kzdata.jmcloud.portal.inter.IUserService;
import com.kzdata.jmcloud.portal.model.entity.SystemUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;

/**
 * 用户Service
 * @author zhouqi
 * @date 2019-06-25 09:12
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-25 09:12     zhouqi          v1.0.0           Created
 *
 */
@Service
public class UserService implements IUserService {


    @Autowired
    private UserDao userDao;

    /**
     * 用户状态检查业务
     *
     */
    @Autowired(required = false)
    private IUserLoginCheckService userStatusCheckService;


    /**
     * 密码解密私钥
     */
    @Value("${portal.user.login.password.rsa.privatekey}")
    private String PASSWORD_DECRYPT_PRIVATE_KEY;

    /**
     * 是否登陆进行检查
     */
    @Value("${portal.user.login.check}")
    private boolean loginCheck;

    /**
     * JWT TOKEN使用密钥
     */
    @Value("${portal.user.login.jwt.secret}")
    private String jwtSecret;

    /**
     * JWT TOKEN过期时间
     * 单位：分钟
     */
    @Value("${portal.user.login.jwt.tokenExp}")
    private int tokenExp;


    /**
     * 多线程异步加载用户权限列表
     * 将其缓存至Redis中
     * 前端页面收到登陆成功响应信息之后跳转至门户页面需要使用TOKEN请求该用户的权限信息
     * 若本方法加载信息过慢，需要前台页面添加加载动画让用户进行等待
     * 只有一个线程，不需要使用线程池，若加载内容过多，本方法需要使用线程池拆分成多个任务同时加载
     * TODO 未实现
     * @param uid
     */
    public void loadPrivilege(Long uid) {


        new Thread(() -> {




        }).start();

    }

    /**
     * 用户登陆
     * @param username  用户名
     * @param password  密码，使用非对称加密后的字符串
     * @return
     *      若用户名密码正确，则返回JWT TOKEN
     *      若用户名密码不正确，则返回null
     */
    @Override
    @Transactional
    public ReturnValueLoader login(String username, String password) {

        //根据用户名查询用户对象
        SystemUser user = this.userDao.selectOne(new QueryWrapper<SystemUser>().eq("username",username));

        /*
        查询不到用户直接返回用户名密码错误
         */
        if (user == null)
            return new ReturnValueLoader(ResultCode.USERNAME_OR_PASSWORD_ERROR);

        /*
        若该用户名下用户已经5次输入密码错误则不允许用户登陆
         */
        if (user.getErrCount() >= 5)
            return new ReturnValueLoader(ResultCode.PASSWORD_ERROR_MORE);


        // 对密码使用私钥进行解密得到经过MD5加密后的密码字符串
        String md5EncryptedPassword = RSAUtil.decryptDataOnJava(password, PASSWORD_DECRYPT_PRIVATE_KEY);

        /*
        若密码输入错误，增加错误次数，记录最后修改时间
         */
        if (!user.getPassword().equals(md5EncryptedPassword)) {

            user.setErrCount(user.getErrCount() + 1);
            user.setUpdateDate(Instant.now());
            this.userDao.updateById(user);


            return new ReturnValueLoader(ResultCode.USERNAME_OR_PASSWORD_ERROR);
        }

        /*
        检查用户状态是否被禁用
         */
        if (user.getStatus() == EnableIdentity.DISABLE)
            return new ReturnValueLoader(ResultCode.ACCOUNT_HAS_BEEN_DISABLED);


        /*
        用户登陆检查
         */
        if (this.loginCheck) {

            boolean checkResult = this.userStatusCheckService.check(user.getSysUserId());

            if (!checkResult)
                return new ReturnValueLoader(ResultCode.USERNAME_OR_PASSWORD_ERROR);

        }


        /*
        每次登陆成功则将登陆错误次数归零并修改最后修改时间
         */
        user.setErrCount(0);
        user.setUpdateDate(Instant.now());
        this.userDao.updateById(user);

        //以上检查全部完成则生成jwtToken
        String jwtToken = JWTUtil.getInstance().generateToken(String.valueOf(user.getSysUserId()), this.tokenExp, this.jwtSecret);

        this.loadPrivilege(user.getSysUserId());

        return new ReturnValueLoader(jwtToken);
    }
}
