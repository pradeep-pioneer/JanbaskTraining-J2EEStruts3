package com.janbask.action;
import com.opensymphony.xwork2.ActionSupport;

public class ActionNullException extends ActionSupport {
	public String execute() throws NullPointerException 
	   {
			throw new NullPointerException("Exception occurred in \"ActionNullException\" action class!");
	   }
}
