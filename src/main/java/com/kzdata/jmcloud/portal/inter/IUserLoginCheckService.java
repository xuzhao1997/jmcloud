package com.kzdata.jmcloud.portal.inter;

/**
 * 用户状态检查
 * 可用于检查当前在线状态等
 * @author zhouqi
 * @date 2019-06-25 10:38
 * @version v1.0.0
 * @Description
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-25 10:38     zhouqi          v1.0.0           Created
 *
 */
public interface IUserLoginCheckService {


    /**
     * 检查用户是否已经在线
     * @param uid   要检查的用户ID
     * @return
     *  true    用户已登陆
     *  false   用户未登陆
     */
    boolean check(Long uid);





}
