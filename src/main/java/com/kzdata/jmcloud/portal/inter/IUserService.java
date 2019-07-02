package com.kzdata.jmcloud.portal.inter;

import com.kzdata.jmcloud.common.model.dto.ReturnValueLoader;

/**
 * 用户Service
 * @author zhouqi
 * @date 2019-06-25 09:13
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-25 09:13     zhouqi          v1.0.0           Created
 *
 */
public interface IUserService {


    /**
     * 用户登陆
     * @param username  用户名
     * @param password  密码，使用非对称加密后的字符串
     * @return
     *
     */
    ReturnValueLoader login(String username, String password);



}
