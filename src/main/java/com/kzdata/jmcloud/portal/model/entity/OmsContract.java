package com.kzdata.jmcloud.portal.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

/**
 * @ClassName: OmsContract
 * @Description: OMS合同表
 * @Author: XuZhao
 * @CreateDate: 19/07/05$ 下午 01:36$
 */
@Getter
@Setter
@ToString
@TableName("oms_contract")
public class OmsContract {

    //主键
    @TableId(value = "id",type = IdType.ID_WORKER)
    private Long Id;

    //合同名称
    @TableField(value = "title",strategy = FieldStrategy.NOT_EMPTY)
    private String title;

    //合同编号
    @TableField(value = "contract_no",strategy = FieldStrategy.NOT_EMPTY)
    private String contractNo;

    //甲方客户
    @TableField(value = "a_unit",strategy = FieldStrategy.NOT_EMPTY)
    private String aUnit;

    //甲方客户id
    @TableField(value = "a_unit_id",strategy = FieldStrategy.NOT_EMPTY)
    private Long aUnitId;

    //乙方服务商（合同创建人）
    @TableField(value = "b_unit",strategy = FieldStrategy.NOT_EMPTY)
    private String bUnit;

    //乙方服务商ID
    @TableField(value = "b_unit_id",strategy = FieldStrategy.NOT_EMPTY)
    private Long bUnitId;

    //合同属性
    @TableField(value = "category",strategy = FieldStrategy.NOT_EMPTY)
    private String category;

    //合同内容
    @TableField(value = "content")
    private String content;

    //合同备注
    @TableField(value = "note",strategy = FieldStrategy.NOT_EMPTY)
    private String note;

    //拒绝原因
    @TableField(value = "refuse_note",strategy = FieldStrategy.NOT_EMPTY)
    private String refuseNote;

    //状态
    @TableField(value = "state",strategy = FieldStrategy.NOT_EMPTY)
    private Integer state;

    //确认人
    @TableField(value = "confirm_user_id",strategy = FieldStrategy.NOT_EMPTY)
    private Integer confirmUserId;

    //确认时间
    @TableField(value = "confirm_date",strategy = FieldStrategy.NOT_EMPTY)
    private Integer confirmDate;

    //发起人
    @TableField(value = "create_user_id",strategy = FieldStrategy.NOT_EMPTY)
    private Integer createUserId;

    //修改时间
    @TableField(value = "update_date",strategy = FieldStrategy.NOT_EMPTY)
    private Instant updateDate;

    //添加时间
    @TableField(value = "create_date",strategy = FieldStrategy.NOT_EMPTY)
    private Instant createDate;


}
