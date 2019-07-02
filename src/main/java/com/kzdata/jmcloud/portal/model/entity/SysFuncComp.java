package com.kzdata.jmcloud.portal.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

/**
 * 功能节点表
 * @author zhouqi
 * @date 2019-06-26 11:00
 * @version v1.0.0
 * @Description 
 * 
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-26 11:00     zhouqi          v1.0.0           Created
 *
 */
@Getter
@Setter
@ToString
@TableName("sys_func_comp")
public class SysFuncComp {


    /**
     * 组件id
     */
    @TableId(value = "sys_comp_id",type = IdType.ID_WORKER)
    private Long sys_comp_id;

    /**
     * 组件编码
     */
    @TableField(value = "sys_comp_code",strategy = FieldStrategy.NOT_EMPTY)
    private String sys_comp_code;

    /**
     * 组件名称
     */
    @TableField(value = "sys_comp_name",strategy = FieldStrategy.NOT_EMPTY)
    private String sys_comp_name;

    /**
     * 组件类型  未定
     */
    @TableField(value = "comp_type",strategy = FieldStrategy.NOT_EMPTY)
    private Integer comp_type;

    /**
     * 组件描述
     */
    @TableField(value = "comp_desc",strategy = FieldStrategy.NOT_EMPTY)
    private String comp_desc;

    /**
     * url地址
     */
    @TableField(value = "url")
    private String url;

    /**
     * 创建时间
     */
    @TableField(value = "create_date")
    private Instant create_date;

    /**
     * 更新时间戳
     */
    @TableField(value = "update_date")
    private Instant update_date;


}
