package com.kzdata.jmcloud.portal.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.kzdata.jmcloud.portal.enums.EnableIdentity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

/**
 * 系统角色表
 * @author zhouqi
 * @date 2019-06-26 10:12
 * @version v1.0.0
 * @Description 
 * 
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-26 10:12     zhouqi          v1.0.0           Created
 *
 */
@Getter
@Setter
@ToString
@TableName("sys_role")
public class SysRole {


    /**
     * 系统角色Id
     */
    @TableId(value = "sys_role_id",type = IdType.ID_WORKER)
    private Long sysRoleId;

    /**
     * 系统角色编码
     */
    @TableField(value = "sys_role_code",strategy = FieldStrategy.NOT_EMPTY)
    private String sysRoleCode;

    /**
     * 角色名
     */
    @TableField(value = "sys_role_name",strategy = FieldStrategy.NOT_EMPTY)
    private String sysRoleName;

    /**
     * 角色启用状态 0-冻结 1-启用
     */
    @TableField(value = "status",strategy = FieldStrategy.NOT_EMPTY)
    private EnableIdentity status;

    /**
     * 系统角色创建时间
     */
    @TableField(value = "sys_depart_level")
    private Instant createDate;

    /**
     * 更新时间戳
     */
    @TableField(value = "sys_depart_level")
    private Instant updateDate;

}
