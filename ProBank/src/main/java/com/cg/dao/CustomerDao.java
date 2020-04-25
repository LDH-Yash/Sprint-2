package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.entity.Customer;

@Transactional
@Repository
public class CustomerDao implements ICustomerDao 
{
	@PersistenceContext
	EntityManager em;

	@Override
	public void update(Customer cust) 
	{
		Customer cust1 = em.find(Customer.class, cust.getCustomerId());
		if(cust1!=null)
		{
			cust1.setCustomerName(cust.getCustomerName());
			cust1.setCustomerAddress(cust.getCustomerAddress());
			cust1.setCustomerContact(cust.getCustomerContact());
		}
		else
		{
			System.out.println("UnSuccessful");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> retrive() 
	{
		Query q=em.createQuery("Select c from Customer c");
		return q.getResultList();
	}
}
