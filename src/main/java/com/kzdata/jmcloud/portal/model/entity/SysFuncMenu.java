package com.kzdata.jmcloud.portal.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

/**
 * 系统菜单表
 * @author zhouqi
 * @date 2019-06-26 10:54
 * @version v1.0.0
 * @Description 
 * 
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-26 10:54     zhouqi          v1.0.0           Created
 *
 */
@Getter
@Setter
@ToString
@TableName("sys_func_menu")
public class SysFuncMenu {

    /**
     * 菜单主键id
     */
    @TableId(value = "sys_menu_id",type = IdType.ID_WORKER)
    private Long sysMenuId;

    /**
     * 菜单编码
     */
    @TableField(value = "sys_menu_code",strategy = FieldStrategy.NOT_EMPTY)
    private String sysMenuCode;

    /**
     * 菜单名称
     */
    @TableField(value = "sys_menu_name",strategy = FieldStrategy.NOT_EMPTY)
    private String sysMenuName;

    /**
     * 菜单等级
     */
    @TableField(value = "menu_level",strategy = FieldStrategy.NOT_EMPTY)
    private Integer menuLevel;

    /**
     * 菜单排序标签  0-100数字排序
     */
    @TableField(value = "menu_index")
    private Integer menuIndex;

    /**
     * 菜单绑定url地址
     */
    @TableField(value = "url")
    private String url;

    /**
     * 上级菜单id
     */
    @TableField(value = "par_menu_id")
    private Long parMenuId;

    /**
     * 菜单描述
     */
    @TableField(value = "menu_desc")
    private String menuDesc;

    /**
     * 菜单信息创建时间
     */
    @TableField(value = "create_date")
    private Instant createDate;

    /**
     * 更新时间戳
     */
    @TableField(value = "update_date")
    private Instant updateDate;


}
