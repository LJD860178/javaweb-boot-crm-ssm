package cn.gdcp.core.service;

import cn.gdcp.common.utils.Page;
import cn.gdcp.core.po.Customer;

public interface CustomerService {
     public Page<Customer> findCustomerList(Integer page, Integer rows, String custName, String custSource, String custIndustry, String custLevel);

	public int createCustomer(Customer customer);

	public int updateCustomer(Customer customer);

	public Customer getCustomerById(Integer id);

	public int deleteCustomer(Integer id);

}
