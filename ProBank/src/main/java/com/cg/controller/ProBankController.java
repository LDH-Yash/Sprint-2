package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Customer;
import com.cg.service.CustomerService;

@CrossOrigin
@RestController
public class ProBankController 
{
	@Autowired
	CustomerService cSer;
	
	@GetMapping(value="/customer")
	public List<Customer> getListCustomer()
	{
		return cSer.getAccounts();
	}
	
	@PutMapping(value="/customer/update",consumes= {"application/json"})
	public String updateCustomer(@RequestBody Customer cust)
	{
		cSer.updateService(cust);
		return "Updated Successfully";
	}
}
