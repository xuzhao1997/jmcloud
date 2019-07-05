package com.kzdata.jmcloud.portal.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

/**
 * @ClassName: OmsUnitApply
 * @Description: 企业申请表实体
 * @Author: XuZhao
 * @CreateDate: 19/07/05$ 下午 04:15$
 */
@Getter
@Setter
@ToString
@TableName("oms_unit_apply")
public class OmsUnitApply {

    //主键
    @TableId(value = "id",type = IdType.ID_WORKER)
    private Long Id;

    //企业ID
    @TableField(value = "unit_id",strategy = FieldStrategy.NOT_EMPTY)
    private Long unitId;

    //企业类型:1客户2服务商3既是客户又是服务商
    @TableField(value = "unit_type",strategy = FieldStrategy.NOT_EMPTY)
    private Integer unitType;

    //服务类别
    @TableField(value = "service_codes",strategy = FieldStrategy.NOT_EMPTY)
    private String serviceCodes;

    //企业名称
    @TableField(value = "name",strategy = FieldStrategy.NOT_EMPTY)
    private String name;

    //企业编码
    @TableField(value = "code",strategy = FieldStrategy.NOT_EMPTY)
    private String code;

    //企业组织机构代码
    @TableField(value = "organization_code",strategy = FieldStrategy.NOT_EMPTY)
    private String organizationCode;

    //企业海关唯一编码
    @TableField(value = "hs_code",strategy = FieldStrategy.NOT_EMPTY)
    private String hsCode;

    //联系人
    @TableField(value = "contact_name",strategy = FieldStrategy.NOT_EMPTY)
    private String contactName;

    //联系人手机号
    @TableField(value = "contact_mobile",strategy = FieldStrategy.NOT_EMPTY)
    private String contactMobile;

    //邮箱
    @TableField(value = "email",strategy = FieldStrategy.NOT_EMPTY)
    private String email;

    //地址
    @TableField(value = "address",strategy = FieldStrategy.NOT_EMPTY)
    private String address;

    //营业执照
    @TableField(value = "license",strategy = FieldStrategy.NOT_EMPTY)
    private String license;

    //公司介绍信
    @TableField(value = "letter",strategy = FieldStrategy.NOT_EMPTY)
    private String letter;

    //身份证复印件
    @TableField(value = "id_card",strategy = FieldStrategy.NOT_EMPTY)
    private String idCard;

    //手持身份证照
    @TableField(value = "handheld_id_card",strategy = FieldStrategy.NOT_EMPTY)
    private String handheldIdCard;

    //退回原因
    @TableField(value = "reject_note",strategy = FieldStrategy.NOT_EMPTY)
    private String rejectNote;

    //状态
    @TableField(value = "state",strategy = FieldStrategy.NOT_EMPTY)
    private Integer state;

    //申请人
    @TableField(value = "user_id",strategy = FieldStrategy.NOT_EMPTY)
    private Long userId;

    //更新时间
    @TableField(value = "update_date",strategy = FieldStrategy.NOT_EMPTY)
    private Instant updateDate;

    //添加时间
    @TableField(value = "create_date",strategy = FieldStrategy.NOT_EMPTY)
    private Instant createDate;

}
