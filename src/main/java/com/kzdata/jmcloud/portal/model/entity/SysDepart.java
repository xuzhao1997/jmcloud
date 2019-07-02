package com.kzdata.jmcloud.portal.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.kzdata.jmcloud.portal.enums.EnableIdentity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

/**
 * 系统部门表
 * @author zhouqi
 * @date 2019-06-26 09:53
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-26 09:53     zhouqi          v1.0.0           Created
 *
 */
@Getter
@Setter
@ToString
@TableName("sys_depart")
public class SysDepart {


    /**
     * 系统部门id
     */
    @TableId(value = "sys_depart_id",type = IdType.ID_WORKER)
    private Long sysDepartId;

    /**
     * 系统部门编号
     */
    @TableField(value = "sys_depart_code",strategy = FieldStrategy.NOT_EMPTY)
    private String sysDepartCode;

    /**
     * 系统部门名称
     */
    @TableField(value = "sys_depart_name",strategy = FieldStrategy.NOT_EMPTY)
    private String sysDepartName;

    /**
     * 上级部门Id
     */
    @TableField(value = "par_depart_id")
    private Long parDepartId;

    /**
     * 部门级别
     */
    @TableField(value = "sys_depart_level")
    private Integer sysDepartLevel;

    /**
     * 启用标识 0-冻结 1-启用
     */
    @TableField(value = "status",strategy = FieldStrategy.NOT_EMPTY)
    private EnableIdentity status;

    /**
     * 创建时间
     */
    @TableField(value = "create_date")
    private Instant createDate;

    /**
     * 更新时间戳
     */
    @TableField(value = "update_date")
    private Instant updateDate;


}
