package com.kzdata.jmcloud.portal.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

/**
 * @ClassName: OmsUnit
 * @Description: 可以登录系统的企业表
 * @Author: XuZhao
 * @CreateDate: 19/07/05$ 下午 04:06$
 */
@Getter
@Setter
@ToString
@TableName("oms_unit")
public class OmsUnit {

    //主键
    @TableId(value = "id",type = IdType.ID_WORKER)
    private Long Id;

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

    //服务类别
    @TableField(value = "service_codes",strategy = FieldStrategy.NOT_EMPTY)
    private String serviceCodes;

    //备注
    @TableField(value = "note",strategy = FieldStrategy.NOT_EMPTY)
    private String note;

    //状态
    @TableField(value = "state",strategy = FieldStrategy.NOT_EMPTY)
    private Integer state;

    //更新时间
    @TableField(value = "update_date",strategy = FieldStrategy.NOT_EMPTY)
    private Instant updateDate;

    //添加时间
    @TableField(value = "create_date",strategy = FieldStrategy.NOT_EMPTY)
    private Instant createDate;

}
