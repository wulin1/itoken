package com.itoken.personnel.controller;

import com.itoken.personnel.entity.User;
import com.itoken.personnel.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


/**
 * @Auther: Administrator
 * @Date: 2018/11/8 0008 15:18
 * @Description:
 */
@Controller
public class UserController {

    @Autowired
    private UsersService userservice;
    @RequestMapping("/tologin.action")
    public String index() {
        return "login";
    }

    @RequestMapping(value = "/login.action")
    public ModelAndView login(User user, HttpServletRequest request, HttpSession session) {
        ModelAndView mav = new ModelAndView();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        user.setUsername(username);
        user.setPassword(password);
        user = this.userservice.dologin(user);
        if (user != null) {
            session.setAttribute("user", user);
            mav.setViewName("detail");
            return mav;
        } else {
            session.setAttribute("errormsg", "账号或密码错误!请重新输入");
        }
        mav.setViewName("login");
        return mav;
    }
}