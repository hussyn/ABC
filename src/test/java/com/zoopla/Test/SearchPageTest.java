package com.zoopla.Test;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.zoopla.base.TestBase;
import com.zoopla.pages.ForsalePage;
import com.zoopla.pages.SearchPage;
import com.zoopla.utility.TestUtil;

public class SearchPageTest extends TestBase {

	SearchPage searchPage;
	ForsalePage forsalePage;
	TestUtil testUtil;
	
	public SearchPageTest() {
		super();
	}
	
	public void setUp() {
		initialization();
		forsalePage=new ForsalePage(driver);
		forsalePage.Search("London");
		
		
	}
	
	@Test
	public void SearchPageOperation() {
		//Select price list in descending order
		testUtil=new TestUtil();
		searchPage=new SearchPage(driver);
		WebElement ele = searchPage.resultsSort;
		testUtil.selectFromDropDown(ele, "Highest price");
	}
	
	public void tearDown() {
		//driver.quit();
	}
}
