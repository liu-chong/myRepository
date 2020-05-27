package com.example.demo.service;

import com.example.demo.dao.CenterUserInfo;
import com.example.demo.dao.TeamMenuConfig;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserService {
    List<CenterUserInfo> queryAll();

    CenterUserInfo findUserById(int id);

    int updateUser(@Param("user") CenterUserInfo user);

    int deleteUserById(int id);

    TeamMenuConfig getSecond(Long id);
}
