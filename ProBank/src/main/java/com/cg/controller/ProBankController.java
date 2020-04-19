package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Customer;
import com.cg.service.CustomerService;

@CrossOrigin
@RestController
public class ProBankController 
{
	@Autowired
	CustomerService cSer;
	
	@GetMapping(value="/allcustomers")
	public List<Customer> getListCustomer()
	{
		return cSer.getAccounts();
	}
}
