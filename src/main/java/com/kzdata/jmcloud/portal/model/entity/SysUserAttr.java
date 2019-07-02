package com.kzdata.jmcloud.portal.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

/**
 * 系统用户扩展属性表
 * @author zhouqi
 * @date 2019-06-26 09:46
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-26 09:46     zhouqi          v1.0.0           Created
 *
 */
@Getter
@Setter
@ToString
@TableName("sys_user_attr")
public class SysUserAttr {


    /**
     * 系统用户扩展属性id
     */
    @TableId(value = "sys_user_attr",type = IdType.ID_WORKER)
    private Long sys_user_attr;

    /**
     * 系统用户Id
     */
    @TableField(value = "sys_user_id",strategy = FieldStrategy.NOT_EMPTY)
    private Long sys_user_id;

    /**
     * 属性标识
     */
    @TableField(value = "attr_id",strategy = FieldStrategy.NOT_EMPTY)
    private Long attr_id;

    /**
     * 属性值标识
     */
    @TableField(value = "attr_value_id")
    private Long attrValueId;

    /**
     * 属性值
     */
    @TableField(value = "attr_value")
    private String attrValue;

    /**
     * 扩展属性创建时间
     */
    @TableField(value = "create_date")
    private Instant createDate;

    /**
     * 更新时间戳
     */
    @TableField(value = "update_date")
    private Instant updateDate;

}
