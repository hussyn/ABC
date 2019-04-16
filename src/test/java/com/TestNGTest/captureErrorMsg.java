package com.TestNGTest;

import org.testng.annotations.Test;

public class captureErrorMsg {
//http://www.gcrit.com/build3/create_account.php
	//http://demo.nopcommerce.com/
	//String error = login.captureErrorMsg();
		@Test
	
		public void captureErrorMsg() {
	
	String error="err";
	
	if(error.contains("Error: Invalid administrator login attempt.")) {
		System.out.println("Login Unsuccessfully and Error Message showed");
		
	}
	else {
		System.out.println("Login Successfully");
	}
		}
}
