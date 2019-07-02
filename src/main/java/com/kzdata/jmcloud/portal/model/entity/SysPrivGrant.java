package com.kzdata.jmcloud.portal.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.kzdata.jmcloud.portal.enums.OrganizationType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

/**
 * 系统授权表
 * @author zhouqi
 * @date 2019-06-26 10:17
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-26 10:17     zhouqi          v1.0.0           Created
 *
 */
@Getter
@Setter
@ToString
@TableName("sys_priv_grant")
public class SysPrivGrant {


    /**
     * 授权表Id
     */
    @TableId(value = "sys_priv_grant_id",type = IdType.ID_WORKER)
    private Long sysPrivGrantId;

    /**
     * 授权类型 1000-授权给工号 2000-授权给角色
     */
    @TableField(value = "grant_type",strategy = FieldStrategy.NOT_EMPTY)
    private OrganizationType grantType;

    /**
     * 权限id
     */
    @TableField(value = "sys_priv_id",strategy = FieldStrategy.NOT_EMPTY)
    private Long sysPrivId;

    /**
     * 被授权主体id
     */
    @TableField(value = "grant_obj_id",strategy = FieldStrategy.NOT_EMPTY)
    private Long grantObjId;

    /**
     * 授权关系创建时间
     */
    @TableField(value = "create_date")
    private Instant createDate;

    /**
     * 更新时间戳
     */
    @TableField(value = "update_date")
    private Instant updateDate;



}
