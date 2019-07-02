package com.kzdata.jmcloud.portal.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

/**
 * 数据类型表
 * @author zhouqi
 * @date 2019-06-26 10:36
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-26 10:36     zhouqi          v1.0.0           Created
 *
 */
@Getter
@Setter
@ToString
@TableName("sys_data_type")
public class SysDataType {


    /**
     * 数据类型主键id
     */
    @TableId(value = "sys_data_type_id",type = IdType.ID_WORKER)
    private Long sysDataTypeId;

    /**
     * 数据类型编码
     */
    @TableField(value = "sys_data_type_code",strategy = FieldStrategy.NOT_EMPTY)
    private String sysDataTypeCode;

    /**
     * 数据类型名称
     */
    @TableField(value = "sys_data_type_name",strategy = FieldStrategy.NOT_EMPTY)
    private String sysDataTypeName;

    /**
     * 数据类型描述
     */
    @TableField(value = "sys_data_type_desc")
    private String sysDataTypeDesc;

    /**
     * 数据类型创建时间
     */
    @TableField(value = "create_date")
    private Instant createDate;

    /**
     * 更新时间戳
     */
    @TableField(value = "update_date")
    private Instant updateDate;




}
