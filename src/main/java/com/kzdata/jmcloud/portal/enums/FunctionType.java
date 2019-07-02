package com.kzdata.jmcloud.portal.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 功能节点类型
 * @author zhouqi
 * @date 2019-06-26 10:51
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-26 10:51     zhouqi          v1.0.0           Created
 *
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum  FunctionType {



    MENU(1000,"菜单权限"),
    FEATURE(2000, "功能节点权限")
    ;

    @EnumValue
    private final int code;

    private final String msg;


    FunctionType(int code, String msg) {
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
