package com.pandora.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.pandora.model.UserAccount;

public interface UserAccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserAccount record);

    int insertSelective(UserAccount record);

    UserAccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserAccount record);

    int updateByPrimaryKey(UserAccount record);

    UserAccount selectOneByUserName(@Param("userName")String userName);

    UserAccount selectOneByUserEmail(@Param("userEmail")String userEmail);

    UserAccount selectOneByUserPhone(@Param("userPhone")String userPhone);


}