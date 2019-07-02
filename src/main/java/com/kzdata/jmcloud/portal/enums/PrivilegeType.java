package com.kzdata.jmcloud.portal.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 系统权限类型  1000-功能权限  2000-数据权限
 * @author zhouqi
 * @date 2019-06-26 10:30
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-26 10:30     zhouqi          v1.0.0           Created
 *
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum PrivilegeType {


    DEPART(1000,"功能权限"),
    ROLE(2000, "数据权限")
    ;

    @EnumValue
    private final int code;

    private final String msg;


    PrivilegeType(int code, String msg) {
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
