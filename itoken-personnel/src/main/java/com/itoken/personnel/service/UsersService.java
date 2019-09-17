package com.itoken.personnel.service;

import com.itoken.personnel.dao.UsersDao;
import com.itoken.personnel.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    @Autowired
    private UsersDao usersDao;

    public User dologin(User user) {
        user=this.usersDao.login(user.getUsername(), user.getPassword());
        return user;
    }
}