package com.cg.dao;

import java.util.List;
//import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.cg.entity.Customer;

public class CustomerDao implements ICustomerDao 
{
	@PersistenceContext
	EntityManager em;

	@Override
	public void update(int id) 
	{
//		Scanner sc = new Scanner(System.in);
//		Customer cust = em.find(Customer.class, id);
//		cust.setCustomerName(sc.next());
//		sc.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> retrive() 
	{
		Query q=em.createQuery("Select c from Customer c");
		return q.getResultList();
	}

}
