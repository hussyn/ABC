package com.hubspot.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.hubspot.base.TestBase;
import com.hubspot.pages.FormsPage;
import com.hubspot.pages.HomePage;
import com.hubspot.pages.LoginPage;

public class FormsPageTest extends TestBase{
	public TestBase testBase;
	public LoginPage loginPage;
	public HomePage homePage;
	public FormsPage formsPage;
	
	@BeforeMethod
	
	public void setUp() {
		testBase=new TestBase();
		testBase.initialize_driver();
		prop=testBase.initialize_Properties();
		driver.get(prop.getProperty("url"));
		loginPage = new LoginPage(driver);
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		//homePage.navigateToMarketingPage();
		homePage.navigateToFormsPage();
	}
	
	@Test
	public void  navigatetoFormPage() {
		
		String title = driver.getTitle();
		System.out.println("navigatetoFormPage title:"+title);
		
	}

	public void tearDown() {
	
		driver.quit();	
	}

}
