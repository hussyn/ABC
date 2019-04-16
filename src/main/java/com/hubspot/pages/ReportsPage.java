package com.hubspot.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.hubspot.base.TestBase;

public class ReportsPage extends TestBase {

	public ReportsPage() {
		System.out.println("ReportsPage");
	}

	
	public ReportsPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
