package com.kzdata.jmcloud.portal.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

/**
 * @ClassName: OmsFeePlanSub
 * @Description: 费用方案子表
 * @Author: XuZhao
 * @CreateDate: 19/07/05$ 下午 02:54$
 */
@Getter
@Setter
@ToString
@TableName("oms_fee_plan_sub")
public class OmsFeePlanSub {

    //主键
    @TableId(value = "id",type = IdType.ID_WORKER)
    private Long Id;

    //费用方案ID
    @TableField(value = "fee_plan_id",strategy = FieldStrategy.NOT_EMPTY)
    private Long fee_plan_id;

    //费用项目
    @TableField(value = "fee_type",strategy = FieldStrategy.NOT_EMPTY)
    private String fee_type;

    //单价
    @TableField(value = "price",strategy = FieldStrategy.NOT_EMPTY)
    private double price;

    //币制
    @TableField(value = "currency",strategy = FieldStrategy.NOT_EMPTY)
    private String currency;

    //汇率
    @TableField(value = "rate",strategy = FieldStrategy.NOT_EMPTY)
    private double rate;

    //结算方式
    @TableField(value = "settle_type",strategy = FieldStrategy.NOT_EMPTY)
    private String settle_type;

    //结算标准
    @TableField(value = "fee_mode",strategy = FieldStrategy.NOT_EMPTY)
    private String fee_mode;

    //结算周期（天）
    @TableField(value = "period",strategy = FieldStrategy.NOT_EMPTY)
    private Integer period;

    //更新时间
    @TableField(value = "update_date",strategy = FieldStrategy.NOT_EMPTY)
    private Instant update_date;

    //添加时间
    @TableField(value = "create_date",strategy = FieldStrategy.NOT_EMPTY)
    private Instant create_date;

}
