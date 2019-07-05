package com.kzdata.jmcloud.portal.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

/**
 * @ClassName: OmsInquirySub
 * @Description: 询价单项目表
 * @Author: XuZhao
 * @CreateDate: 19/07/05$ 下午 03:12$
 */
@Getter
@Setter
@ToString
@TableName("oms_inquiry_sub")
public class OmsInquirySub {

    //主键
    @TableId(value = "id",type = IdType.ID_WORKER)
    private Long Id;

    //询价单ID
    @TableField(value = "inquiry_id",strategy = FieldStrategy.NOT_EMPTY)
    private Long inquiryId;

    //服务类型
    @TableField(value = "service_code",strategy = FieldStrategy.NOT_EMPTY)
    private String serviceCode;

    //服务子类型
    @TableField(value = "service_sub_code",strategy = FieldStrategy.NOT_EMPTY)
    private String serviceSubCode;

    //指派服务器ID
    @TableField(value = "assign_unit_id",strategy = FieldStrategy.NOT_EMPTY)
    private Long assignUnitId;

    //状态
    @TableField(value = "state",strategy = FieldStrategy.NOT_EMPTY)
    private Integer state;

    //指派状态
    @TableField(value = "assign_state",strategy = FieldStrategy.NOT_EMPTY)
    private Integer assignState;

    //更新时间
    @TableField(value = "update_date",strategy = FieldStrategy.NOT_EMPTY)
    private Instant updateDate;

    //创建时间
    @TableField(value = "create_date",strategy = FieldStrategy.NOT_EMPTY)
    private Instant createDate;


}
