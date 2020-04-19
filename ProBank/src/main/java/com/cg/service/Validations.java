package com.cg.service;

public interface Validations 
{
	String validAccountNumber="[1-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]";
	String validName="[a-zA-Z].*";
	String validContactNumber = "[1-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]";
	public static boolean validateData(String data,String pattern)
	{
		return data.matches(pattern);
	}
}