package com.TestNGTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTest2 {

	@BeforeMethod
	public void setUP() {
		
		System.out.println("pre condition excuted");
	}
	
	@Test
	public void VerifyTest2() {
		System.out.println("VerifyTest2 excuted");
	}
	
	@AfterMethod
	public void tearDown() {
		
		
	}
}
