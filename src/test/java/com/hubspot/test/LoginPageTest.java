package com.hubspot.test;

import org.apache.log4j.Logger;

//import org.apache.log4j.Logger;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.hubspot.base.TestBase;
import com.hubspot.pages.LoginPage;


public class LoginPageTest extends TestBase {
	TestBase testBase;
	LoginPage loginPage;
	
	// Logger log=Logger.getLogger(LoginPageTest.class.getName());
	 Logger log=Logger.getLogger("LoginPageTest");
	
	
	public  LoginPageTest(){
		super();
	}
	@BeforeMethod
	
	public void setUp() {
	 testBase=new TestBase();
	 prop=testBase.initialize_Properties();
	 testBase.initialize_driver();
	// testBase.initialize_Log4j();
	 driver.get(prop.getProperty("url"));
	 loginPage=new LoginPage(driver);

	}
	@Test(enabled=false,priority=1)
	public void validLogin() {
		
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		log.info("valid login Test case");
		log.debug("valid login Test case");
	}
	
	@Test(priority=2)
	public void invalidLogin() {
		
		log.info("***********************************Invalid login Test case***********************************");
		loginPage=loginPage.invalidLogin(prop.getProperty("invalidusername"), prop.getProperty("invalidpassword1"));

		Assert.assertEquals(loginPage.getErrorMessage(), prop.getProperty("alert"));
	    log.info("***********************************End Invalid login Test case***********************************");
	
	}

	@Test(enabled=false,priority=0)
		public void getPageTitle() {
		
		String pagetitleAct = driver.getTitle();
		Assert.assertEquals("pass", "HubSpot Login", pagetitleAct);
		log.info("pagetitleAct");
		
	}
	

	@AfterMethod //--this method will be executed after every test method
	public void tearDown(){
		//driver.quit();
	}
}
