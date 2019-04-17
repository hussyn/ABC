package com.hubspot.test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hubspot.base.TestBase;
import com.hubspot.pages.HomeNewPage;
import com.hubspot.pages.SearchResultPage;

public class SearchResultPageTest extends TestBase {
	
	public SearchResultPage searchResultPage;
	public HomeNewPage homePage;

	@BeforeMethod

	public void setUp(){
	System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
	driver = new ChromeDriver();
	driver.navigate().to("https://www.1800flowers.com");
    driver.manage().window().maximize();

    homePage = new HomeNewPage(driver);
    searchResultPage = new SearchResultPage(driver);
	}
	@Test(enabled=false)
    public void test1() {
        WebElement searchTextbox = driver.findElement(By.id("SearchBox"));
        searchTextbox.sendKeys("rose");

        WebElement searchButton = driver.findElement(By.cssSelector(".searchbtn>a"));
        searchButton.click();
    }

    @Test(enabled=false)
    public void test2() {
        WebElement searchTextbox = driver.findElement(By.id("SearchBox"));
        searchTextbox.sendKeys("Spray");

        WebElement searchButton = driver.findElement(By.cssSelector(".searchbtn>a"));
        searchButton.click();
    }


    //(test 3 = Page Object Model "POM")
    @Test(priority=0)
   // public void verifySpecialProductInfoForSearchResult() {
        //(Outside)PageFactory.initElements(new AjaxElementLocatorFactory(driver,30),homePage);
        //homePage.verifyTitle();

    	//homePage.verifyTitle("Flowers | Flower Delivery | Fresh Flowers Online | 1-800-FLOWERS.COM");
       // homePage.search("rose");
        
        //searchResultPage.verifyTitle();
        //searchResultPage.verifyTopLinks("Roses");
       // delayFor(4000);
       // searchResultPage.verifySpecialProductName(0, "Rose Elegance™ Premium Long Stem Red Roses");
        //searchResultPage.selectSpecialProduct(0);
        //searchResultPage.verifySpecialProductPrice(0, "$59.99-$99.99");
       // System.out.println("Rose Elegance™ Premium Long Stem Red Roses");

       /* searchResultPage.verifySpecialProductName(1, "Blooming Love™ Premium Red Roses");
        searchResultPage.verifySpecialProductPrice(1, "$64.99-$89.99");
        System.out.println("Blooming Love™ Premium Red Roses");

        searchResultPage.verifySpecialProductName(2, "Ultimate Elegance™ Premium Long Stem Red Roses");
        searchResultPage.verifySpecialProductPrice(2, "$119.99-$209.99");
        System.out.println("Ultimate Elegance™");


        searchResultPage.verifySpecialProductName(3, "100 Premium Long Stem Red Roses");
        searchResultPage.verifySpecialProductPrice(3, "$349.99");
        System.out.println("100 Premium Long Stem Red Roses");
    }*/
    
    @AfterMethod
    public void teardown(){
        driver.close();
        //driver.quit();
    }
}
