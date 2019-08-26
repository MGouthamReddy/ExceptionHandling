package com.goutham;

public class NumberformateException {

	//Number
	public static void main(String[] args) {
         System.out.println("This statement will be executed");
       try {
         Integer it=new Integer("ABC");
       }
        catch(Exception e) { 
       System.out.println("a");
       
       {
       System.out.println("This statement will be not executed");
	}

}}}
