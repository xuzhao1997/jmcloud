package com.kzdata.jmcloud.portal.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.kzdata.jmcloud.portal.enums.EnableIdentity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

/**
 * 系统工号表
 * @author zhouqi
 * @date 2019-06-25 17:52
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-25 17:52     zhouqi          v1.0.0           Created
 *
 */
@Getter
@Setter
@ToString
@TableName("system_user")
public class SystemUser {


    /**
     * 系统用户表主键
     */
    @TableId(value = "sys_user_id",type = IdType.ID_WORKER)
    private Long sysUserId;

    /**
     * 系统用户编码
     */
    @TableField(value = "sys_user_code",strategy = FieldStrategy.NOT_EMPTY)
    private String sysUserCode;

    /**
     * 用户账号（用户登录账号）
     */
    @TableField(value = "username",strategy = FieldStrategy.NOT_EMPTY)
    private String username;

    /**
     * 用户密码
     */
    @TableField(value = "password",strategy = FieldStrategy.NOT_EMPTY)
    private String password;

    /**
     * 用户手机号
     */
    @TableField(value = "phone_num")
    private Long phoneNum;

    /**
     * 用户所属组织id
     */
    @TableField(value = "sys_org_id",strategy = FieldStrategy.NOT_EMPTY)
    private Long sysOrgId;

    /**
     * 系统工号状态   0-冻结  1-启用
     */
    @TableField(value = "status",strategy = FieldStrategy.NOT_EMPTY)
    private EnableIdentity status;

    /**
     * 用户密码输入错误次数，连续达到5次后冻结
     */
    @TableField(value = "err_count",strategy = FieldStrategy.NOT_EMPTY)
    private Integer errCount;

    /**
     * 工号创建时间
     */
    @TableField(value = "create_date")
    private Instant createDate;

    /**
     * 工号更新时间
     */
    @TableField(value = "update_date")
    private Instant updateDate;

    /**
     * 系统所属部门
     */
    @TableField(value = "sys_depart_id")
    private Long sysDepartId;


}
