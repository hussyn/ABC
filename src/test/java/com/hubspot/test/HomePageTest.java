package com.hubspot.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hubspot.base.TestBase;
import com.hubspot.pages.ContactsPage;
import com.hubspot.pages.HomePage;
import com.hubspot.pages.LoginPage;

public class HomePageTest extends TestBase {

	public TestBase testBase;
	public LoginPage loginPage;
	public HomePage homePage;
	public ContactsPage contactsPage;
	
	@BeforeMethod
	public void setUp() {
		testBase=new TestBase();
		testBase.initialize_driver();
		prop=testBase.initialize_Properties();
		driver.get(prop.getProperty("url"));
		///Create object of LoginPage
		loginPage = new LoginPage(driver);
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test
	
	public void  navigatetoContactsPage() {
		homePage.navigateToContactsPage();
		
	}
	
	public void teardown() {
		driver.close();
	}
}
