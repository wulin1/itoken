package com.itoken.personnel.controller;

import com.itoken.personnel.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/Login")
public class LoginController {
    @Autowired
    private LoginService loginservice;

    // 先跳转页面
    @RequestMapping(value = "/toLogin")
    public String toLogin(){
        return "Login";
    }

    @RequestMapping(value = "/login")
    public String Login(String username, String password){
        Integer userlogin = loginservice.toLogin(username, password);
        if(username != null && password != null && userlogin == 1) {
            return "success";
        }else {
            return "error";
        }
    }
}

