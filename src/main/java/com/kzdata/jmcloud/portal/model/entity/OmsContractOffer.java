package com.kzdata.jmcloud.portal.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

/**
 * @ClassName: OmsContractOffer
 * @Description: 合同报价关联表
 * @Author: XuZhao
 * @CreateDate: 19/07/05$ 下午 02:14$
 */
@Getter
@Setter
@ToString
@TableName("oms_contract_offer")
public class OmsContractOffer {

    //主键
    @TableId(value = "id",type = IdType.ID_WORKER)
    private Long id;

    //合同ID
    @TableField(value = "contract_id",strategy = FieldStrategy.NOT_EMPTY)
    private Long contractId;

    //报价单ID
    @TableField(value = "offer_id",strategy = FieldStrategy.NOT_EMPTY)
    private Long offerId;

    //修改时间
    @TableField(value = "update_date",strategy = FieldStrategy.NOT_EMPTY)
    private Instant updateDate;

    //创建时间
    @TableField(value = "create_date",strategy = FieldStrategy.NOT_EMPTY)
    private Instant createDate;

}
