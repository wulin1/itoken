package com.itoken.personnel.service.Impl;

import com.itoken.personnel.dao.LoginDao;
import com.itoken.personnel.entity.Login;
import com.itoken.personnel.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginDao logindao;

    @Override
    public Integer toLogin(String username, String password) {
        Login login = new Login();
        login.setPassword(password);
        login.setUsername(username);
        Integer userLogin = logindao.toLogin(login);
        return userLogin;
        // return userLogin = 0 或 1
    }
}
