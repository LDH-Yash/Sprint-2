package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.CustomerDao;
import com.cg.entity.Customer;

@Service
public class CustomerService implements ICustomerService 
{
	@Autowired
	private CustomerDao dao;
	
	@Override
	public List<Customer> getAccounts() 
	{
		return dao.retrive();
	}

	@Override
	public void updateService(Customer cust) 
	{
		dao.update(cust);	
	}

}
