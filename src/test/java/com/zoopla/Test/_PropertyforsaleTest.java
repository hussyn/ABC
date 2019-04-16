package com.zoopla.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zoopla.base.TestBase;
import com.zoopla.pages.ForsalePage;
import com.zoopla.pages.SearchPage;
import com.zoopla.utility.TestUtil;

public class _PropertyforsaleTest extends TestBase {

	ForsalePage salePage;
	SearchPage searchPage;
	TestUtil testUtil;
	
	public _PropertyforsaleTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
	}
	
	@Test
	public void x() {
		
	}
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}
}
