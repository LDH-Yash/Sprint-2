package com.cg.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.DynamicInsert;

@Entity
@Table(name="Customer")
@DynamicUpdate(true)
@DynamicInsert(true)
public class Customer 
{
	@Id
	@Column(name="cust_id")
	@NotNull(message="ID input is Mandatory")
	private String customerId;
	@Column(name="cust_name")
	@NotNull(message="Name is Mandatory")
	private String customerName;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="addressId")
	@NotNull(message="Customer's Address is Mandatory")
	private Address customerAddress;
	@Column(name="cust_aadhar")
	@NotNull(message="Customer's Aadhar Number is Mandatory")
	private String customerAadhar;
	@Column(name="cust_pan")
	@NotNull(message="Customer's Pan is Mandatory")
	private String customerPan;
	@Column(name="cust_contact")
	@NotNull(message="Customer's Contact is Mandatory")
	private String customerContact;
	@Column(name="cust_gender")
	@NotNull(message="Customer's Gender is Mandatory")
	private String customerGender;
	@Column(name="cust_dob")
	@NotNull(message="Customer's Dob is Mandatory")
	private Date customerDob;
	
	public Customer() 
	{
		super();
	}

	public Customer(String customerId, String customerName, Address customerAddress, String customerAadhar, String customerPan, String customerContact, String customerGender, Date customerDob) 
	{
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerAadhar = customerAadhar;
		this.customerPan = customerPan;
		this.customerContact = customerContact;
		this.customerGender = customerGender;
		this.customerDob = customerDob;
	}

	public String getCustomerId() 
	{
		return customerId;
	}

	public void setCustomerId(String customerId) 
	{
		this.customerId = customerId;
	}

	public String getCustomerName() 
	{
		return customerName;
	}

	public void setCustomerName(String customerName) 
	{
		this.customerName = customerName;
	}

	public Address getCustomerAddress() 
	{
		return customerAddress;
	}

	public void setCustomerAddress(Address customerAddress) 
	{
		this.customerAddress = customerAddress;
	}

	public String getCustomerAadhar() 
	{
		return customerAadhar;
	}

	public void setCustomerAadhar(String customerAadhar) 
	{
		this.customerAadhar = customerAadhar;
	}

	public String getCustomerPan() 
	{
		return customerPan;
	}

	public void setCustomerPan(String customerPan) 
	{
		this.customerPan = customerPan;
	}

	public String getCustomerContact() 
	{
		return customerContact;
	}

	public void setCustomerContact(String customerContact) 
	{
		this.customerContact = customerContact;
	}

	public String getCustomerGender() 
	{
		return customerGender;
	}

	public void setCustomerGender(String customerGender) 
	{
		this.customerGender = customerGender;
	}

	public Date getCustomerDob() 
	{
		return customerDob;
	}

	public void setCustomerDob(Date customerDob) 
	{
		this.customerDob = customerDob;
	}

	@Override
	public String toString() 
	{
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress=" + customerAddress + ", customerAadhar=" + customerAadhar + ", customerPan=" + customerPan + ", customerContact=" + customerContact + ", customerGender=" + customerGender + ", customerDob=" + customerDob + "]";
	}
	
}
