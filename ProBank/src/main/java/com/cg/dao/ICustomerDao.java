package com.cg.dao;

import java.util.List;

import com.cg.entity.Customer;

public interface ICustomerDao 
{
	public void update(Customer cust);
	public List<Customer> retrive();
}
