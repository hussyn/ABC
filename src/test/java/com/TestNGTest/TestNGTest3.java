package com.TestNGTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTest3 {

	@BeforeMethod
	public void setUP() {
		
		System.out.println("pre condition excuted");
	}
	
	@Test
	public void VerifyTest3() {
		System.out.println("VerifyTest3 excuted");
	}
	
	@AfterMethod
	public void tearDown() {
		
		
	}
}
