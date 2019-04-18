package cn.gdcp.core.dao;

import org.apache.ibatis.annotations.Param;

import cn.gdcp.core.po.User;

public interface UserDao {
	
    public User findUser(@Param("usercode")  String usercode , @Param("password") String password );
    
}
