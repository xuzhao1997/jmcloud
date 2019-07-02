package com.kzdata.jmcloud.portal.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.kzdata.jmcloud.portal.enums.OrganizationType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

/**
 * 系统工号关联关系表
 * @author zhouqi
 * @date 2019-06-26 10:04
 * @version v1.0.0
 * @Description 
 * 
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-26 10:04     zhouqi          v1.0.0           Created
 *
 */
@Getter
@Setter
@ToString
@TableName("sys_user_interrelated")
public class SysUserInterrelated {


    /**
     * 工号关联表主键
     */
    @TableId(value = "sys_interrelate_id",type = IdType.ID_WORKER)
    private Long sysInterrelateId;

    /**
     * 系统工号id
     */
    @TableField(value = "sys_user_id",strategy = FieldStrategy.NOT_EMPTY)
    private Long sysUserId;

    /**
     * 关联类型  1000-工号关联部门  2000-工号关联角色
     */
    @TableField(value = "type",strategy = FieldStrategy.NOT_EMPTY)
    private OrganizationType type;

    /**
     * 关联的部门或角色Id
     */
    @TableField(value = "relative_id",strategy = FieldStrategy.NOT_EMPTY)
    private Long relativeId;

    /**
     * 关联信息创建时间
     */
    @TableField(value = "create_date")
    private Instant createDate;

    /**
     * 关联信息更新时间戳
     */
    @TableField(value = "update_date")
    private Instant updateDate;

}
