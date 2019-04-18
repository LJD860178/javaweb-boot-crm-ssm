package cn.gdcp.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.gdcp.common.utils.Page;
import cn.gdcp.core.dao.UserDao;
import cn.gdcp.core.po.Customer;
import cn.gdcp.core.po.User;
import cn.gdcp.core.service.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
	private UserDao userDao;
	@Override
	public User findUser(String usercode, String password) {
		User user = this.userDao.findUser(usercode , password);
		return user;
	}
	@Override
	public Page<Customer> findCustomerList(Integer page, Integer rows, String custName, String custSource,
			String custIndusty, String custLevel) {
		// TODO Auto-generated method stub
		return null;
	}
    
}
