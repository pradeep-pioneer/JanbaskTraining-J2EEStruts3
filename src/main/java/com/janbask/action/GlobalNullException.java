package com.janbask.action;
import com.opensymphony.xwork2.ActionSupport;

public class GlobalNullException extends ActionSupport {
	public String execute() throws NullPointerException 
	   {
			throw new NullPointerException("Oops!");
	   }
}
