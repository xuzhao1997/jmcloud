package com.kzdata.jmcloud.portal.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 系统工号关联关系表类型
 * @author zhouqi
 * @date 2019-06-26 10:09
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-26 10:09     zhouqi          v1.0.0           Created
 *
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum OrganizationType {


    DEPART(1000,"部门"),
    ROLE(2000, "角色")
    ;

    @EnumValue
    private final int code;

    private final String msg;


    OrganizationType(int code, String msg) {
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
