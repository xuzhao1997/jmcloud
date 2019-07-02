package com.kzdata.jmcloud.portal.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * 用户登陆参数封装DTO
 * @author zhouqi
 * @date 2019-06-25 09:14
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-25 09:14     zhouqi          v1.0.0           Created
 *
 */
@ApiModel(value = "com.kzdata.jmcloud.portal.model.dto.UserLoginDto", description = "用户登陆参数")
@Getter
@Setter
@ToString
public class UserLoginDto {


    @ApiModelProperty(value = "登陆用户名")
    @NotBlank(message = "用户名不能为空")
    //@Pattern(regexp = "^1[0-9A-Za-z]{5}$",message = "用户名格式错误")   //TODO 修改此正则
    private String username;

    @ApiModelProperty(value = "密码")
    @NotBlank(message = "密码不能为空")
    //@Pattern(regexp = "^1[0-9A-Za-z]{5}$",message = "密码格式错误")    //TODO 修改此正则
    private String password;


}
