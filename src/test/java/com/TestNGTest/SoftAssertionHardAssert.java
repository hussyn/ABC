package com.TestNGTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionHardAssert {

	@Test
	 public void softAssert(){
	SoftAssert softAssertion= new SoftAssert();
	 System.out.println("softAssert Method Was Started");
	 softAssertion.assertTrue(false, "fail");//java.lang.AssertionError:
	 System.out.println("softAssert Method Was Executed");
	 softAssertion.assertAll();
	//Note:  If you forget to call assertAll() at the end of your test, 
	 //the test will pass even if any assert objects threw exceptions as shown in the above example. 
	 //So don’t forget to add assertAll() 
	 }
	 
	 @Test
	 public void hardAssert(){
	 System.out.println("hardAssert Method Was Started");
	 Assert.assertTrue(false);
	 System.out.println("hardAssert Method Was Executed");
	 }
}
