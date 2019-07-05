package com.kzdata.jmcloud.portal.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

/**
 * @ClassName: dictionary
 * @Description: 数据字典表
 * @Author: XuZhao
 * @CreateDate: 19/07/05$ 下午 02:39$
 */
@Getter
@Setter
@ToString
@TableName("oms_dictionary")
public class OmsDictionary {

    //主键
    @TableId(value = "id",type = IdType.ID_WORKER)
    private Long Id;

    //字典类型编码
    @TableField(value = "dict_type",strategy = FieldStrategy.NOT_EMPTY)
    private String dicttype;

    //键
    @TableField(value = "code",strategy = FieldStrategy.NOT_EMPTY)
    private String code;

    //值
    @TableField(value = "value",strategy = FieldStrategy.NOT_EMPTY)
    private String value;

    //排序
    @TableField(value = "list_order",strategy = FieldStrategy.NOT_EMPTY)
    private Integer listOrder;

    //描述
    @TableField(value = "remark",strategy = FieldStrategy.NOT_EMPTY)
    private String remark;

    //修改时间
    @TableField(value = "update_date",strategy = FieldStrategy.NOT_EMPTY)
    private Instant updateDate;

    //更新时间
    @TableField(value = "create_date",strategy = FieldStrategy.NOT_EMPTY)
    private Instant createDate;

}
