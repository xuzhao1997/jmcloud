package com.kzdata.jmcloud.portal.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 启用标识
 * 仅提供启用禁用两种状态
 * @author zhouqi
 * @date 2019-06-26 10:02
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-26 10:02     zhouqi          v1.0.0           Created
 *
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum EnableIdentity {


    DISABLE(0,"禁用"),
    ENABLE(1, "启用")
    ;

    @EnumValue
    private final int code;

    private final String msg;


    EnableIdentity(int code, String msg) {
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
