package com.lmxdawn.admin.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * 登录验证
 */
@Data
public class LoginForm {

    @NotEmpty(message = "用户名不能为空")
    private String username;

    @NotEmpty(message = "密码不能为空")
    private String pwd;

}
