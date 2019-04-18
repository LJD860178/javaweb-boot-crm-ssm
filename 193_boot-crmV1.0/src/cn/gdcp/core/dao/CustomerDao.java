package cn.gdcp.core.dao;

import java.util.List;

import cn.gdcp.core.po.Customer;

public interface CustomerDao {
    public List<Customer> selectCustomerList(Customer customer);
    public Integer selectCustomerListCount(Customer customer);
	public int createCustomer(Customer customer);
	public int updateCustomer(Customer customer);
	public Customer getCustomerById(Integer id);
	public int deleteCustomer(Integer id);
}
