package com.zoopla.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoopla.base.TestBase;



public class ForsalePage extends TestBase {

	//public static WebDriver driver;
	
	@FindBy(xpath="//input[@id='search-input-location']")
	WebElement searchinputText;
	
	@FindBy(id="search-submit")
	WebElement SearchBtn;
	
	//Initializing the Page Object
	public ForsalePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	
	public  SearchPage Search(String inputtext) {
		System.out.println(inputtext);
		searchinputText.sendKeys(inputtext);
		
		SearchBtn.click();
		return new SearchPage(driver);
	}
}
