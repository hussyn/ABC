package com.hubspot.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.hubspot.base.TestBase;

public class AutomationPage extends TestBase {

	public AutomationPage() {
		System.out.println("ServicePage");
	}

	
	public AutomationPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
