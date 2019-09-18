package com.itoken.personnel.dao;

import com.itoken.personnel.entity.Login;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginDao {
    Integer toLogin(Login login);
}