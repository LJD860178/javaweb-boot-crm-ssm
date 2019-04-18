package cn.gdcp.core.service;

import cn.gdcp.common.utils.Page;
import cn.gdcp.core.po.Customer;
import cn.gdcp.core.po.User;

public interface UserService {
    public User findUser(String usercode , String password);
    public Page<Customer> findCustomerList(Integer page , Integer rows , String custName , String custSource , String custIndusty , String custLevel);
}
