package com.hubspot.test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.hubspot.base.TestBase;
import com.hubspot.pages.HomePage;
import com.hubspot.pages.LoginPage;
import com.hubspot.pages.MarketingPage;



public class MarketingPageTest extends TestBase {
	public TestBase testBase;
	public LoginPage loginPage;
	public HomePage homePage;
	public MarketingPage marketingPage;
	
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
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println("navigatetoFormPage title:"+title);
		
	}
	
	
	public void teardown() {
		//driver.quit();
	}

	
}
