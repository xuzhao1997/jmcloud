package com.kzdata.jmcloud.portal.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

/**
 * @ClassName: OmsOfferSub
 * @Description: 报价单费用项目表实体
 * @Author: XuZhao
 * @CreateDate: 19/07/05$ 下午 03:30$
 */
@Getter
@Setter
@ToString
@TableName("oms_offer_sub")
public class OmsOfferSub {

    //主键
    @TableId(value = "id",type = IdType.ID_WORKER)
    private Long Id;

    //报价单ID
    @TableField(value = "offer_id",strategy = FieldStrategy.NOT_EMPTY)
    private Long offerId;

    //费用项目
    @TableField(value = "fee_type",strategy = FieldStrategy.NOT_EMPTY)
    private String feeType;

    //单价
    @TableField(value = "price",strategy = FieldStrategy.NOT_EMPTY)
    private Double price;

    //币制
    @TableField(value = "currency",strategy = FieldStrategy.NOT_EMPTY)
    private String currency;

    //汇率
    @TableField(value = "rate",strategy = FieldStrategy.NOT_EMPTY)
    private Double rate;

    //结费方式
    @TableField(value = "settle_type",strategy = FieldStrategy.NOT_EMPTY)
    private String settleType;

    //结算标准
    @TableField(value = "fee_mode",strategy = FieldStrategy.NOT_EMPTY)
    private String feeMode;

    //结算周期(天)
    @TableField(value = "period",strategy = FieldStrategy.NOT_EMPTY)
    private Integer period;

    //更新时间
    @TableField(value = "update_date",strategy = FieldStrategy.NOT_EMPTY)
    private Instant updateDate;

    //创建时间
    @TableField(value = "create_date",strategy = FieldStrategy.NOT_EMPTY)
    private Instant createDate;

}
