package com.TestNGTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTest4 {

	@BeforeMethod
	public void setUP() {
		
		System.out.println("pre condition excuted");
	}
	@Test(priority=0,description="smokeTest case Desc",enabled=true,groups={"smokeTest"})
	public void VerifyTest3() {
		System.out.println("VerifyTest3 excuted");
	}
	
	@Test(groups={"smokeTest","functionalTest"})
	public void VerifyTest4() {
		System.out.println("VerifyTest4 excuted");
	}
	
	@Test(groups= {"functionalTest"})
	public void VerifyTest5() {
		System.out.println("VerifyTest5 excuted");
	}
	
	@Test(groups= {"smokeTest","functionalTest"})
	public void VerifyTest6() {
		System.out.println("VerifyTest6 excuted");
	}
	
	@Test(groups= {"nonfunctionTest"})
	public void VerifyTest7() {
		System.out.println("VerifyTest7 excuted");
	}
	
	@AfterMethod
	public void tearDown() {
		
		
	}
}
