package com.kzdata.jmcloud.portal.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

/**
 * 数据权限关联表
 * @author zhouqi
 * @date 2019-06-26 10:32
 * @version v1.0.0
 * @Description 
 * 
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-26 10:32     zhouqi          v1.0.0           Created
 *
 */
@Getter
@Setter
@ToString
@TableName("sys_priv_data_rel")
public class SysPrivDataRel {


    /**
     * 权限数据关联id
     */
    @TableId(value = "sys_priv_data_rel_id",type = IdType.ID_WORKER)
    private Long sys_priv_data_rel_id;

    /**
     * 用户权限id
     */
    @TableField(value = "sys_priv_id",strategy = FieldStrategy.NOT_EMPTY)
    private Long sys_priv_id;

    /**
     * 数据id
     */
    @TableField(value = "sys_data_type_id",strategy = FieldStrategy.NOT_EMPTY)
    private Long sys_data_type_id;

    /**
     * 数据权限关系创建时间
     */
    @TableField(value = "create_date")
    private Instant create_date;

    /**
     * 更新时间戳
     */
    @TableField(value = "update_date")
    private Instant update_date;



}
