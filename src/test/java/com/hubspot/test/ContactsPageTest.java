package com.hubspot.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hubspot.base.TestBase;
import com.hubspot.constants.Constants;
import com.hubspot.pages.ContactsPage;
import com.hubspot.pages.HomePage;
import com.hubspot.pages.LoginPage;

import com.zoopla.utility.excelutility;

public class ContactsPageTest extends TestBase{
	public TestBase testBase;
	ContactsPage contactsPage;
	HomePage homePage;
	LoginPage loginPage;
	
	//String sheetName = "contacts";
	
	public ContactsPageTest() {
		super();
	}
  
	@BeforeMethod
	public void SetUp() {
		testBase=new TestBase();
		testBase.initialize_driver();
		prop=testBase.initialize_Properties();
		driver.get(prop.getProperty("url"));
		///Create object of LoginPage
		loginPage = new LoginPage(driver);
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		contactsPage=homePage.navigateToContactsPage();
	}
	
	@Test(dataProvider="getHubData")
	
	public void createNewContactTest(String email, String firstname, String lastname, String jobtitle ) throws InterruptedException {
		contactsPage.createNewContact( email, firstname, lastname, jobtitle);
		System.out.println();
	}
	
	@DataProvider(name="getHubData")
	public Object[][] getHubData(){
		Object[][] testdata = excelutility.getTestData(Constants.CONTACTS_SHEET_NAME);
		return testdata;
		
	}
	
	@AfterMethod
	public void tearDown() {
	driver.close();	
	}
	
}

