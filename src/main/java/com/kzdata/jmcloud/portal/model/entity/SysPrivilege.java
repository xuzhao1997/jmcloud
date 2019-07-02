package com.kzdata.jmcloud.portal.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.kzdata.jmcloud.portal.enums.EnableIdentity;
import com.kzdata.jmcloud.portal.enums.PrivilegeType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

/**
 * 系统权限表
 * @author zhouqi
 * @date 2019-06-26 10:23
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-26 10:23     zhouqi          v1.0.0           Created
 *
 */
@Getter
@Setter
@ToString
@TableName("sys_privilege")
public class SysPrivilege {


    /**
     * 权限主键id
     */
    @TableId(value = "sys_priv_id",type = IdType.ID_WORKER)
    private Long sysPrivId;

    /**
     * 权限编码
     */
    @TableField(value = "sys_priv_code",strategy = FieldStrategy.NOT_EMPTY)
    private String sysPrivCode;

    /**
     * 权限名称
     */
    @TableField(value = "sys_priv_name",strategy = FieldStrategy.NOT_EMPTY)
    private String sysPrivName;

    /**
     * 系统权限类型  1000-功能权限  2000-数据权限
     */
    @TableField(value = "priv_type",strategy = FieldStrategy.NOT_EMPTY)
    private PrivilegeType privType;

    /**
     * 权限状态 1-启用 0-冻结
     */
    @TableField(value = "status",strategy = FieldStrategy.NOT_EMPTY)
    private EnableIdentity status;

    /**
     * 权限信息描述
     */
    @TableField(value = "sys_priv_desc")
    private String sysPrivDesc;

    /**
     * 权限所归属子系统Id  为空时 归属于所有系统
     */
    @TableField(value = "sys_info_id")
    private Long sysInfoId;

    /**
     * 权限创建时间
     */
    @TableField(value = "create_date")
    private Instant createDate;

    /**
     * 更新时间戳
     */
    @TableField(value = "update_date")
    private Instant updateDate;


}
