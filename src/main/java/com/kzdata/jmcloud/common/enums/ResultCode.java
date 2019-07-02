package com.kzdata.jmcloud.common.enums;

/**
 * 全局返回状态码
 * @author zhouqi
 * @date 2019-06-24 18:05
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-24 18:05     zhouqi          v1.0.0           Created
 *
 */
public enum ResultCode {

    /**
     * 请求成功
     */
    SUCCESS(0, "SUCCESS"),

    /**
     * 登陆时使用
     */
    USERNAME_OR_PASSWORD_ERROR(1001,"用户名或密码错误"),

    /**
     * 密码输入错误次数过多
     */
    PASSWORD_ERROR_MORE(1002, "密码错误次数过多"),

    /**
     * 账号被禁用提示
     */
    ACCOUNT_HAS_BEEN_DISABLED(1003, "账号已被禁用"),

    /**
     * 请求接口鉴权时使用
     */
    TOKEN_TIME_OUT(2001,"TOKEN过期"),

    /**
     * 请求接口鉴权时使用
     */
    NO_AUTH_CODE(2002,"TOKEN异常");


    private final int code;

    private final String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return msg;
    }



}
