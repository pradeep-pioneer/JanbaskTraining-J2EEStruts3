package com.janbask.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.IntRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;

public class EmployeeAnnotation extends ActionSupport{
   private String name;
   private int age;
   
   public String execute() 
   {
       return SUCCESS;
   }
   public String getName() {
       return name;
   }
   @RequiredStringValidator(message = "Please enter your name.")
   public void setName(String name) {
       this.name = name;
   }
   public int getAge() {
       return age;
   }
   
   @IntRangeFieldValidator(message="The age must be between 28 and 65", min="28", max= "65")
   public void setAge(int age) {
       this.age = age;
   }
}