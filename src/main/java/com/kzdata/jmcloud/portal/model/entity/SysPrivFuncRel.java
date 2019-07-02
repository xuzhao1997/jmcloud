package com.kzdata.jmcloud.portal.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.kzdata.jmcloud.portal.enums.FunctionType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

/**
 * 功能节点权限关联表
 * @author zhouqi
 * @date 2019-06-26 10:44
 * @version v1.0.0
 * @Description 
 * 
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-26 10:44     zhouqi          v1.0.0           Created
 *
 */
@Getter
@Setter
@ToString
@TableName("sys_priv_func_rel")
public class SysPrivFuncRel {

    /**
     * 功能节点关联权限主键id
     */
    @TableId(value = "sys_priv_func_rel_id",type = IdType.ID_WORKER)
    private Long sysPrivFuncRelId;

    /**
     * 关联权限id
     */
    @TableField(value = "sys_priv_id",strategy = FieldStrategy.NOT_EMPTY)
    private Long sysPrivId;

    /**
     * 关联功能节点类型 1000-菜单权限  2000-功能节点
     */
    @TableField(value = "func_type",strategy = FieldStrategy.NOT_EMPTY)
    private FunctionType funcType;

    /**
     * 关联功能节点id
     */
    @TableField(value = "func_obj_id",strategy = FieldStrategy.NOT_EMPTY)
    private Long funcObjId;

    /**
     * 功能节点关系创建时间
     */
    @TableField(value = "create_date")
    private Instant createDate;

    /**
     * 更新时间戳
     */
    @TableField(value = "update_date")
    private Instant updateDate;


}
