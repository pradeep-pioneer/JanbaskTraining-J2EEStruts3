package com.janbask.action;
import com.opensymphony.xwork2.ActionSupport;

public class GlobalException extends ActionSupport {
	public String execute() throws NullPointerException 
	   {
			throw new ArithmeticException("I don't know how to perform this calculation!");
	   }
}
