package com.pandora.controller;

import com.pandora.model.UserAccount;
import com.pandora.service.UserAccountService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author : Pandora
 * 2022/1/18-18:27
 */

public class UserLoginText {
    @Test
    public void userLoginText01(){
        UserLogin userLogin = new UserLogin();
        userLogin.user_login("1746384966@qq.com","123456");
    }

    @Test
    public void userLoginText02(){
        UserLogin userLogin = new UserLogin();
        userLogin.user_login("19845919903","123456");
    }

    @Test
    public void userLoginText03(){
        UserLogin userLogin = new UserLogin();
        userLogin.user_login("user","123456");
    }

    @Test
    public void userLoginText04(){
        UserLogin userLogin = new UserLogin();
        userLogin.user_login("","");
    }

    @Test
    public void userLoginText05(){
        UserLogin userLogin = new UserLogin();
        userLogin.user_login("user","000000");
    }

    @Test
    public void userLoginText06(){
        UserLogin userLogin = new UserLogin();
        userLogin.user_login("0000000","000000");
    }
}
