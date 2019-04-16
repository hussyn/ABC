package com.zoopla.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zoopla.base.TestBase;
import com.zoopla.pages.ForsalePage;

public class ForsalePageTest extends TestBase {
	ForsalePage salePage;
	public ForsalePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		
		initialization();
		
	}
	@Test
	public void salePage() {
		 salePage=new ForsalePage(driver);
		 salePage.Search("London");
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}
}
