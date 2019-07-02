package com.kzdata.jmcloud.common.enums;

/**
 * 全局异常代码
 * @author zhouqi
 * @date 2019-06-02 18:19
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-02 18:19     zhouqi          v1.0.0           Created
 *
 */
public enum GlobalExceptionCode {


    ///以下为示例，后期需要删除

    NOT_FOUND_EXCEPTION_CODE(3,"资源未找到"),

    METHOD_ARGUMENT_EXCEPTION_CODE(4,"方法参数异常"),

    FALLBACK_EXCEPTION_CODE(5,"服务降级");

    /**
     * 异常代码
     */
    private Integer code;

    /**
     * 异常信息
     */
    private String msg;


    GlobalExceptionCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
