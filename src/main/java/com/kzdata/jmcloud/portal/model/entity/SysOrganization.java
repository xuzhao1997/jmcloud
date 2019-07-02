package com.kzdata.jmcloud.portal.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.kzdata.jmcloud.portal.enums.EnableIdentity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

/**
 * 组织机构表
 * @author zhouqi
 * @date 2019-06-26 09:47
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-26 09:47     zhouqi          v1.0.0           Created
 *
 */
@Getter
@Setter
@ToString
@TableName("sys_organization")
public class SysOrganization {


    /**
     * 组织机构id
     */
    @TableId(value = "sys_org_id",type = IdType.ID_WORKER)
    private Long sysOrgId;

    /**
     * 组织编码
     */
    @TableField(value = "sys_org_code",strategy = FieldStrategy.NOT_EMPTY)
    private String sysOrgCode;

    /**
     * 组织机构名称
     */
    @TableField(value = "sys_org_name",strategy = FieldStrategy.NOT_EMPTY)
    private String sysOrgName;

    /**
     * 组织启用状态  0-冻结 1-启用
     */
    @TableField(value = "status",strategy = FieldStrategy.NOT_EMPTY)
    private EnableIdentity status;

    /**
     * 组织机构创建时间
     */
    @TableField(value = "create_date")
    private Instant createDate;

    /**
     * 组织信息更新时间戳
     */
    @TableField(value = "update_date")
    private Instant updateDate;
}
