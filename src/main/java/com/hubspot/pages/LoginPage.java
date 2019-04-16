package com.hubspot.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.hubspot.base.TestBase;
import com.zoopla.utility.TestUtil;

public class LoginPage extends TestBase{
	
	//1.a: define page objects (PAGE OR) : using PageFactory Pattern
	
	@FindBy(id = "username")
	WebElement emailId;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(id = "loginBtn")
	WebElement loginButton;
	
	@FindBy(linkText = "Sign up")
	WebElement signUpLink;
	
	//@FindBy(xpath="//h2[@class=\"private-heading-5 private-alert__title\"]")
	//public WebElement alertMsg;
	
	@FindBy(xpath="//div[@class=\"private-alert__inner\"]/h2")
	public WebElement alertMsg;
	
	@FindBy(className="h3")
	@CacheLookup
	private WebElement userNameLabel;
	
	//1. Constructor of page class and initialize elements with driver
	public LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
/*	public void enterName(String firstName, String lastName){
		this.firstName.clear();
		this.firstName.sendKeys(firstName);

		this.lastName.clear();
		this.lastName.sendKeys(lastName);
	}*/
	
	public HomePage login(String un, String pwd){
		emailId.sendKeys(un);
		password.sendKeys(pwd);
		loginButton.click();
		
		return new HomePage(driver);
	}
	
	public LoginPage invalidLogin(String un, String pwd){
		emailId.sendKeys(un);
		password.sendKeys(pwd);
		loginButton.click();
		TestUtil.shortWait();
		return new LoginPage(driver);
	}
	
	//verify that the correct error is shown
	public String getErrorMessage() {
		
		String ActualMsg = alertMsg.getText();
		System.out.println(ActualMsg);
		return ActualMsg;
        
    }

}
