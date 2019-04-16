package com.zoopla.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoopla.base.TestBase;

public class _Propertyforsale extends TestBase {

	
	@FindBy(xpath="//h4[@class='ui-agent__name']")
	WebElement agentName;
	
	@FindBy(xpath="//a[@class='ui-link'][@data-track-label='Agent phone number 1']")
	WebElement telPhoneNo;
	//1.b: Constructor of page class and initialize elements with driver
	public _Propertyforsale(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public  AgentPage Agent() {
		
		return new AgentPage(null);
		
	}
}
