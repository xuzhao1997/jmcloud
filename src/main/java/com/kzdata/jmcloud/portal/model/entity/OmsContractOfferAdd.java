package com.kzdata.jmcloud.portal.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

/**
 * @ClassName: OmsContractOfferAdd
 * @Description:
 * @Author: XuZhao
 * @CreateDate: 19/07/05$ 下午 02:22$
 */
@Getter
@Setter
@ToString
@TableName("oms_contract_offer_add")
public class OmsContractOfferAdd {

    //主键
    @TableId(value = "id",type = IdType.ID_WORKER)
    private Long Id;

    //合同ID
    @TableField(value = "contract_id",strategy = FieldStrategy.NOT_EMPTY)
    private Long contractId;

    //报价单ID
    @TableField(value = "offer_id",strategy = FieldStrategy.NOT_EMPTY)
    private Long offerId;

    //拒绝原因
    @TableField(value = "refuse_note",strategy = FieldStrategy.NOT_EMPTY)
    private String refuseNote;

    //状态
    @TableField(value = "state",strategy = FieldStrategy.NOT_EMPTY)
    private Integer state;

    //确认时间
    @TableField(value = "confirm_date",strategy = FieldStrategy.NOT_EMPTY)
    private Instant confirmDate;

    //更新时间
    @TableField(value = "update_date",strategy = FieldStrategy.NOT_EMPTY)
    private Instant updateDate;

    //添加时间
    @TableField(value = "create_date",strategy = FieldStrategy.NOT_EMPTY)
    private Instant createDate;


}
