package com.kzdata.jmcloud.portal.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

/**
 * @ClassName: OmsOffer
 * @Description: 报价单主单表
 * @Author: XuZhao
 * @CreateDate: 19/07/05$ 下午 03:19$
 */
@Getter
@Setter
@ToString
@TableName("oms_offer")
public class OmsOffer {

    //主键
    @TableId(value = "id",type = IdType.ID_WORKER)
    private Long Id;

    //报价单号
    @TableField(value = "offer_no",strategy = FieldStrategy.NOT_EMPTY)
    private String offerNo;

    //询价单子项ID
    @TableField(value = "inquiry_sub_id",strategy = FieldStrategy.NOT_EMPTY)
    private Long inquirySubId;

    //服务子类型代码
    @TableField(value = "service_sub_code",strategy = FieldStrategy.NOT_EMPTY)
    private String serviceSubCode;

    //报价说明
    @TableField(value = "note")
    private String note;

    //状态(0 建新1未报价 2 已报价10仓库可以查看)
    @TableField(value = "state",strategy = FieldStrategy.NOT_EMPTY)
    private Integer state;

    //拒绝原因
    @TableField(value = "reject_note",strategy = FieldStrategy.NOT_EMPTY)
    private String rejectNote;

    //创建人单位ID
    @TableField(value = "unit_id",strategy = FieldStrategy.NOT_EMPTY)
    private Long unitId;

    //创建人
    @TableField(value = "user_id",strategy = FieldStrategy.NOT_EMPTY)
    private Long userId;

    //确认时间
    @TableField(value = "confirm_time",strategy = FieldStrategy.NOT_EMPTY)
    private Instant confirmTime;

    //报价时间
    @TableField(value = "submit_time",strategy = FieldStrategy.NOT_EMPTY)
    private Instant submitTime;

    //更新时间
    @TableField(value = "update_time",strategy = FieldStrategy.NOT_EMPTY)
    private Instant updateTime;

    //创建时间
    @TableField(value = "create_date",strategy = FieldStrategy.NOT_EMPTY)
    private Instant createDate;

}
