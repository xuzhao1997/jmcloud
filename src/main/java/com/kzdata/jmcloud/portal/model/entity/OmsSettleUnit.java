package com.kzdata.jmcloud.portal.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.time.Instant;

/**
 * @ClassName: OmsSettleUnit
 * @Description: 结算单位表
 * @Author: XuZhao
 * @CreateDate: 19/07/05$ 下午 03:56$
 */
@Getter
@Setter
@ToString
@TableName("oms_settle_unit")
public class OmsSettleUnit {

    //主键
    @TableId(value = "id",type = IdType.ID_WORKER)
    private Long Id;

    //客户单位ID
    @TableField(value = "unit_id",strategy = FieldStrategy.NOT_EMPTY)
    private Long unitId;

    //客户单位名称
    @TableField(value = "unit",strategy = FieldStrategy.NOT_EMPTY)
    private String unit;

    //结算单位ID
    @TableField(value = "sys_user_code",strategy = FieldStrategy.NOT_EMPTY)
    private Long settleUnitId;

    //结算单位名称
    @TableField(value = "settle_unit",strategy = FieldStrategy.NOT_EMPTY)
    private String settleUnit;

    //服务商ID
    @TableField(value = "service_unit_id",strategy = FieldStrategy.NOT_EMPTY)
    private Long serviceUnitId;

    //服务商名称
    @TableField(value = "service_unit",strategy = FieldStrategy.NOT_EMPTY)
    private String serviceUnit;

    //合同号ID
    @TableField(value = "contract_id",strategy = FieldStrategy.NOT_EMPTY)
    private Long contractId;

    //合同编号
    @TableField(value = "contract_no",strategy = FieldStrategy.NOT_EMPTY)
    private String contractNo;

    //内容
    @TableField(value = "content",strategy = FieldStrategy.NOT_EMPTY)
    private String content;

    //附件
    @TableField(value = "attachment",strategy = FieldStrategy.NOT_EMPTY)
    private String attachment;

    //创建人
    @TableField(value = "user_id",strategy = FieldStrategy.NOT_EMPTY)
    private Long userId;

    //状态
    @TableField(value = "state",strategy = FieldStrategy.NOT_EMPTY)
    private Integer state;

    //更新时间
    @TableField(value = "update_date",strategy = FieldStrategy.NOT_EMPTY)
    private Instant updateDate;

    //创建时间
    @TableField(value = "create_date",strategy = FieldStrategy.NOT_EMPTY)
    private Instant createDate;

}
