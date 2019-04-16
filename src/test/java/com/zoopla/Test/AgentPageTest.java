package com.zoopla.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zoopla.base.TestBase;
import com.zoopla.pages.AgentPage;
import com.zoopla.pages.ForsalePage;
import com.zoopla.pages.SearchPage;
import com.zoopla.pages._Propertyforsale;
import com.zoopla.utility.TestUtil;

public class AgentPageTest extends TestBase {

	ForsalePage salePage;
	SearchPage searchPage;
	_Propertyforsale propertyforsale;
	AgentPage agentPage;
	TestUtil testUtil;
	
	public AgentPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
	}
	
	@Test
	public void agent() {
		 salePage=new ForsalePage(driver);
		 salePage.Search("London");		
		 WebElement ele=searchPage.resultsSort;
		 System.out.println(searchPage.resultsSort);
		 TestUtil.selectFromDropDown(ele, "Highest price");
		 Select sel=new Select(ele);
		 sel.selectByVisibleText("Highest price");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 List<WebElement> x = searchPage.price;
		 System.out.println(x);
		 SearchPage.getPrice();
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}
}
