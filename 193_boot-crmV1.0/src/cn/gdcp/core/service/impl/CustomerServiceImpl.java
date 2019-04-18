package cn.gdcp.core.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.gdcp.common.utils.Page;
import cn.gdcp.core.dao.CustomerDao;
import cn.gdcp.core.po.Customer;
import cn.gdcp.core.service.CustomerService;
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	@Autowired
    private CustomerDao customerDao;
	@Override
	public Page<Customer> findCustomerList(Integer page, Integer rows, String custName, String custSource,
			String custIndustry, String custLevel) {
		System.out.println(custName);
		Customer customer = new Customer();
		if(StringUtils.isNotBlank(custName)) {
			customer.setCust_name(custName);
		}
		if(StringUtils.isNotBlank(custSource)) {
			customer.setCust_name(custSource);
		}
		if(StringUtils.isNotBlank(custIndustry)) {
			customer.setCust_name(custIndustry);
		}
		if(StringUtils.isNotBlank(custLevel)) {
			customer.setCust_name(custLevel);
		}
		customer.setStart((page-1)*rows);
		customer.setRows(rows);
		List<Customer> customers = customerDao.selectCustomerList(customer);
		Integer count = customerDao.selectCustomerListCount(customer);
		Page<Customer> result = new Page<>();
		result.setPage(page);
		result.setRows(customers);
		result.setTotal(count);
		result.setSize(rows);
		System.out.println(page);
		System.out.println(count);
		return result;
	}
	@Override
	public int createCustomer(Customer customer) {
		return customerDao.createCustomer(customer);
	}
	@Override
	public int updateCustomer(Customer customer) {
		return customerDao.updateCustomer(customer);
	}
	@Override
	public Customer getCustomerById(Integer id) {
		return customerDao.getCustomerById(id);
	}
	@Override
	public int deleteCustomer(Integer id) {
		return customerDao.deleteCustomer(id);
	}
	

}
