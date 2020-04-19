package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="Address")
@DynamicUpdate(true)
@DynamicInsert(true)
public class Address 
{
	@Id
	@Column(name="address_id")
	@NotNull(message="Address Id input is Mandatory")
	private String addressId;
	@Column(name="address_line1")
	@NotNull(message="Address Line1 is Mandatory")
	private String addressLine1;
	@Column(name="address_line2")
	@NotNull(message="Address Line2 is Mandatory")
	private String addressLine2;
	@Column(name="address_line3")
	private String addressLine3;
	@Column(name="address_city")
	@NotNull(message="Address City is Mandatory")
	private String addressCity;
	@Column(name="address_state")
	@NotNull(message="Address State is Mandatory")
	private String addressState;
	@Column(name="address_country")
	@NotNull(message="Address Country is Mandatory")
	private String addressCountry;
	@Column(name="address_zipcode")
	@NotNull(message="Address Zipcode is Mandatory")
	private String addressZipcode;
	
	public Address() 
	{
		super();
	}

	public Address(String addressId, String addressLine1, String addressLine2, String addressLine3, String addressCity, String addressState, String addressCountry, String addressZipcode) 
	{
		super();
		this.addressId = addressId;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressLine3 = addressLine3;
		this.addressCity = addressCity;
		this.addressState = addressState;
		this.addressCountry = addressCountry;
		this.addressZipcode = addressZipcode;
	}

	public String getAddressId() 
	{
		return addressId;
	}

	public void setAddressId(String addressId) 
	{
		this.addressId = addressId;
	}

	public String getAddressLine1() 
	{
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) 
	{
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() 
	{
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) 
	{
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() 
	{
		return addressLine3;
	}

	public void setAddressLine3(String addressLine3) 
	{
		this.addressLine3 = addressLine3;
	}

	public String getAddressCity() 
	{
		return addressCity;
	}

	public void setAddressCity(String addressCity) 
	{
		this.addressCity = addressCity;
	}

	public String getAddressState() 
	{
		return addressState;
	}

	public void setAddressState(String addressState) 
	{
		this.addressState = addressState;
	}

	public String getAddressCountry() 
	{
		return addressCountry;
	}

	public void setAddressCountry(String addressCountry) 
	{
		this.addressCountry = addressCountry;
	}

	public String getAddressZipcode() 
	{
		return addressZipcode;
	}

	public void setAddressZipcode(String addressZipcode) 
	{
		this.addressZipcode = addressZipcode;
	}

	@Override
	public String toString() 
	{
		return "Address [addressId=" + addressId + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", addressLine3=" + addressLine3 + ", addressCity=" + addressCity + ", addressState=" + addressState + ", addressCountry=" + addressCountry + ", addressZipcode=" + addressZipcode + "]";
	}
	
}
