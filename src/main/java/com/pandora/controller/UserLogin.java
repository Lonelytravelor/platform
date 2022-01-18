package com.pandora.controller;

import com.pandora.model.UserAccount;
import com.pandora.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author : Pandora
 * 2022/1/18-18:27
 */

public class UserLogin {
    @Autowired
    private UserAccountService userAccountService;


    public boolean user_login(String name, String password){

        UserAccount userAccount = userAccountService.selectOneByUserName(name);
        if ( userAccount == null )
            userAccount = userAccountService.selectOneByUserEmail(name);
        if ( userAccount == null )
            userAccount = userAccountService.selectOneByUserPhone(name);
        if ( userAccount == null )
            System.out.println("没有该用户！");
        else {
            if ( userAccount.getUserPassword().equals(password) ){
                System.out.println("登陆成功！");
                return true;
            }else {
                System.out.println("密码错误！");
            }
        }
        return false;
    }
}
