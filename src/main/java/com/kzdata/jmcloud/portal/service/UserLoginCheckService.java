package com.kzdata.jmcloud.portal.service;

import com.kzdata.jmcloud.portal.inter.IUserLoginCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * 用户状态检查
 * 可用于检查当前在线状态等
 * @author zhouqi
 * @date 2019-06-25 10:38
 * @version v1.0.0
 * @Description
 *  TODO 需要根据后期需求修改此接口
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-25 10:38     zhouqi          v1.0.0           Created
 *
 */
@Service
public class UserLoginCheckService implements IUserLoginCheckService {


    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    /**
     * 用户登陆检查
     * @param uid   要检查的用户ID
     * @return
     *  true    用户允许登陆
     *  false   用户不允许登陆，可反馈登陆异常错误
     */
    @Override
    public boolean check(Long uid) {


        //boolean isOnline = this.stringRedisTemplate.hasKey(String.valueOf(uid));

        //BoundHashOperations ops = this.stringRedisTemplate.boundHashOps(String.valueOf(uid));

        //return isOnline;


        return true;
    }
}
