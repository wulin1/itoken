package com.itoken.personnel.dao;

import com.itoken.personnel.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UsersDao {
    public User login(String username, String password);
}