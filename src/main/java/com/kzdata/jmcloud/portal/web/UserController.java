package com.kzdata.jmcloud.portal.web;

import com.kzdata.jmcloud.common.model.dto.ReturnValueLoader;
import com.kzdata.jmcloud.portal.inter.IUserService;
import com.kzdata.jmcloud.portal.model.dto.UserLoginDto;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 用户Controller
 * @author zhouqi
 * @date 2019-06-24 18:19
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-24 18:19     zhouqi          v1.0.0           Created
 *
 */
@Api("门户用户API")
@RestController
@RequestMapping("/portal/user")
public class UserController {


    @Autowired
    private IUserService userService;


    @ApiOperation(value = "用户登陆", notes = "JWT TOKEN模式")
    @ApiImplicitParams({

            @ApiImplicitParam(dataTypeClass = UserLoginDto.class)
            //@ApiImplicitParam(name = "username", value = "用户名", paramType = "POST", required = true, dataType = "String"),
            //@ApiImplicitParam(name = "password", value = "密码,需要先将明文使用MD5加密之后再使用非对称算法加密", paramType = "POST", required = true, dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code = 200,response = String.class,message = "登陆成功，返回JWT TOKEN"),
    })
    @PostMapping("login")
    public ReturnValueLoader login(@Valid @RequestBody UserLoginDto userLoginDto) {

        //根据传入的用户名密码得到JWT TOKEN
        ReturnValueLoader rvl = this.userService.login(userLoginDto.getUsername(), userLoginDto.getPassword());

        return rvl;
    }




}
