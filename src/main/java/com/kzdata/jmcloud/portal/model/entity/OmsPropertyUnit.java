package com.kzdata.jmcloud.portal.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

/**
 * @ClassName: OmsPropertyUnit
 * @Description: 货权单位信息表
 * @Author: XuZhao
 * @CreateDate: 19/07/05$ 下午 03:46$
 */
@Getter
@Setter
@ToString
@TableName("oms_property_unit")
public class OmsPropertyUnit {

    //主键
    @TableId(value = "id",type = IdType.ID_WORKER)
    private Long Id;

    //货权单位名称
    @TableField(value = "name",strategy = FieldStrategy.NOT_EMPTY)
    private String name;

    //编码
    @TableField(value = "property_unit_no",strategy = FieldStrategy.NOT_EMPTY)
    private String propertyUnitNo;

    //货权代码
    @TableField(value = "property_code",strategy = FieldStrategy.NOT_EMPTY)
    private String propertyCode;

    //社会统一代码
    @TableField(value = "organization_code",strategy = FieldStrategy.NOT_EMPTY)
    private String organizationCode;

    //海关编码
    @TableField(value = "hs_code",strategy = FieldStrategy.NOT_EMPTY)
    private String hsCode;

    //联系人
    @TableField(value = "contact_name",strategy = FieldStrategy.NOT_EMPTY)
    private String contactName;

    //联系电话
    @TableField(value = "contact_mobile",strategy = FieldStrategy.NOT_EMPTY)
    private String contactMobile;

    //添加单位
    @TableField(value = "unit_id",strategy = FieldStrategy.NOT_EMPTY)
    private Long unitId;

    //添加人
    @TableField(value = "user_id",strategy = FieldStrategy.NOT_EMPTY)
    private Long userId;

    //附件（代理协议）
    @TableField(value = "attachment",strategy = FieldStrategy.NOT_EMPTY)
    private String attachment;

    //更新时间
    @TableField(value = "update_date",strategy = FieldStrategy.NOT_EMPTY)
    private Instant updateDate;

    //添加时间
    @TableField(value = "create_date",strategy = FieldStrategy.NOT_EMPTY)
    private Instant createDate;

}
