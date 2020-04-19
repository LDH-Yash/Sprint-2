package com.cg.dao;

import java.util.List;

import com.cg.entity.Customer;

public interface ICustomerDao 
{
	//public void updateName(int id);
	//public void updateAddress(int id);
	//public void updateContact(int id);
	public List<Customer> retrive();
}
