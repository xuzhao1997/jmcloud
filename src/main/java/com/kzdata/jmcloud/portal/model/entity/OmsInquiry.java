package com.kzdata.jmcloud.portal.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

/**
 * @ClassName: OmsInquiry
 * @Description: 询价单表
 * @Author: XuZhao
 * @CreateDate: 19/07/05$ 下午 03:03$
 */
@Getter
@Setter
@ToString
@TableName("oms_inquiry")
public class OmsInquiry {

    //主键
    @TableId(value = "id",type = IdType.ID_WORKER)
    private Long Id;

    //询价单号
    @TableField(value = "inquiry_no",strategy = FieldStrategy.NOT_EMPTY)
    private String inquiryNo;

    //联系人
    @TableField(value = "contact_name",strategy = FieldStrategy.NOT_EMPTY)
    private String contactName;

    //联系人手机号
    @TableField(value = "contact_mobile",strategy = FieldStrategy.NOT_EMPTY)
    private String contactMobile;

    //询价内容（要求）
    @TableField(value = "content",strategy = FieldStrategy.NOT_EMPTY)
    private String content;

    //状态
    @TableField(value = "state",strategy = FieldStrategy.NOT_EMPTY)
    private Integer state;

    //指派状态
    @TableField(value = "assign_state",strategy = FieldStrategy.NOT_EMPTY)
    private Integer assignState;

    //单位ID
    @TableField(value = "unit_id",strategy = FieldStrategy.NOT_EMPTY)
    private Long unitId;

    //创建人ID
    @TableField(value = "user_id",strategy = FieldStrategy.NOT_EMPTY)
    private Long userId;

    //修改时间
    @TableField(value = "udpate_date",strategy = FieldStrategy.NOT_EMPTY)
    private Instant updateDate;

    //创建时间
    @TableField(value = "create_date",strategy = FieldStrategy.NOT_EMPTY)
    private Instant createDate;





}
