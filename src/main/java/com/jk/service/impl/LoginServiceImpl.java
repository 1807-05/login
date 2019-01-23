package com.jk.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.bean.Login;
import com.jk.mapper.LoginMapper;
import com.jk.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    //登陸
    @Override
    public Login getUserInfoByLoginNumber(String loginacct) {

        Login userInfoByLoginNumber = loginMapper.getUserInfoByLoginNumber(loginacct);
        return userInfoByLoginNumber;
    }
}
