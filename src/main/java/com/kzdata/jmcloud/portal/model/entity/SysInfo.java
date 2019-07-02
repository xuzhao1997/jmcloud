package com.kzdata.jmcloud.portal.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.kzdata.jmcloud.portal.enums.EnableIdentity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

/**
 * 平台子系统信息表
 * @author zhouqi
 * @date 2019-06-26 10:41
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-26 10:41     zhouqi          v1.0.0           Created
 *
 */
@Getter
@Setter
@ToString
@TableName("sys_info")
public class SysInfo {


    /**
     * 系统信息id
     */
    @TableId(value = "sys_info_id",type = IdType.ID_WORKER)
    private Long sys_info_id;

    /**
     * 系统编码
     */
    @TableField(value = "sys_code",strategy = FieldStrategy.NOT_EMPTY)
    private String sys_code;

    /**
     * 系统名称
     */
    @TableField(value = "sys_name",strategy = FieldStrategy.NOT_EMPTY)
    private String sys_name;

    /**
     * 系统信息描述
     */
    @TableField(value = "sys_desc")
    private String sys_desc;

    /**
     * 系统启用状态  0-冻结  1-启用
     */
    @TableField(value = "status",strategy = FieldStrategy.NOT_EMPTY)
    private EnableIdentity status;

    /**
     * 系统信息创建时间
     */
    @TableField(value = "create_date")
    private Instant create_date;

    /**
     * 更新时间戳
     */
    @TableField(value = "update_date")
    private Instant update_date;



}
