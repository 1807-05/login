package com.jk.service;

import com.jk.bean.Login;

public interface LoginService {

    //登陆
    Login getUserInfoByLoginNumber(String loginacct);
}
