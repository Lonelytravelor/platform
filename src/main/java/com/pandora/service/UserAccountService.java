package com.pandora.service;
import java.util.List;
import com.pandora.model.UserAccount;

/**
 * @author : Pandora
 * 2022/1/18-18:10
 */

public class UserAccountService {

	@org.springframework.beans.factory.annotation.Autowired
	private com.pandora.mapper.UserAccountMapper userAccountMapper;

	public UserAccount selectOneByUserName(String userName){
		 return userAccountMapper.selectOneByUserName(userName);
	}

	public UserAccount selectOneByUserEmail(String userEmail){
		 return userAccountMapper.selectOneByUserEmail(userEmail);
	}


	public UserAccount selectOneByUserPhone(String userPhone){
		 return userAccountMapper.selectOneByUserPhone(userPhone);
	}




}
