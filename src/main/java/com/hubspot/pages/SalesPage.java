package com.hubspot.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.hubspot.base.TestBase;

public class SalesPage extends TestBase {

	
	
	public SalesPage() {
		System.out.println("SalesPage");
	}

	
	public SalesPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
