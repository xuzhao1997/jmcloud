package com.kzdata.jmcloud.portal.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

/**
 * @ClassName: OmsFeePlan
 * @Description: 费用方案表
 * @Author: XuZhao
 * @CreateDate: 19/07/05$ 下午 02:47$
 */
@Getter
@Setter
@ToString
@TableName("oms_fee_plan")
public class OmsFeePlan {

    //主键
    @TableId(value = "id",type = IdType.ID_WORKER)
    private Long Id;

    //方案名称
    @TableField(value = "title",strategy = FieldStrategy.NOT_EMPTY)
    private String title;

    //服务代码
    @TableField(value = "service_code",strategy = FieldStrategy.NOT_EMPTY)
    private String service_code;

    //服务子项代码
    @TableField(value = "service_sub_code",strategy = FieldStrategy.NOT_EMPTY)
    private String service_sub_code;

    //创建人企业ID
    @TableField(value = "unit_id",strategy = FieldStrategy.NOT_EMPTY)
    private Long unit_id;

    //创建人
    @TableField(value = "user_id",strategy = FieldStrategy.NOT_EMPTY)
    private Long user_id;

    //状态：0禁用,1启用
    @TableField(value = "state",strategy = FieldStrategy.NOT_EMPTY)
    private Integer state;

    //更新时间
    @TableField(value = "update_date",strategy = FieldStrategy.NOT_EMPTY)
    private Instant update_date;

    //添加时间
    @TableField(value = "create_date",strategy = FieldStrategy.NOT_EMPTY)
    private Instant create_date;

}
