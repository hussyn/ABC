package com.hubspot.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.hubspot.base.TestBase;

public class ServicePage extends TestBase {

	
	
	public ServicePage() {
		System.out.println("ServicePage");
	}

	
	public ServicePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
