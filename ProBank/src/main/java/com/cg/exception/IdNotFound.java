package com.cg.exception;

public class IdNotFound extends Exception
{
	private static final long serialVersionUID = 1L;
	@Override
	public String toString() 
	{
		return "ID Not Found";
	}
	
	public IdNotFound(String msg) 
	{
		super(msg);
	}
}
