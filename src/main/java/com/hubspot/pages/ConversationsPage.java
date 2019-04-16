package com.hubspot.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.hubspot.base.TestBase;

public class ConversationsPage extends TestBase {

	public ConversationsPage() {
		System.out.println("ConversationsPage");
	}

	
	public ConversationsPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
