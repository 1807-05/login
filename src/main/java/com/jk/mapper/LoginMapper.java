package com.jk.mapper;

import com.jk.bean.Login;

public interface LoginMapper {

    //登陆
    Login getUserInfoByLoginNumber(String loginacct);
}
