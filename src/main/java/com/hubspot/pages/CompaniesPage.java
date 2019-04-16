package com.hubspot.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hubspot.base.TestBase;

public class CompaniesPage extends TestBase{
	//To-//span[@class="truncate-text"]
	//From //span[@class="sender-input"]
	//span[@data-text="true"]
	////input[@data-selenium-test="email-subject-input"]
	
//for send button//button//i18n-string[text()='Send']
	//for email close //span[text()='remove']
	@FindBy(id="uid-ctrl-34")
	WebElement Companydomainname;
	
	@FindBy(id="uid-ctrl-35")
	WebElement name;
	
	@FindBy(xpath="//span[@class='private-dropdown__item__label']")
	WebElement Companyowner;
	
	@FindBy(xpath="//span[text()='Create company']")
	WebElement CreatecompanyBtn;
	
	@FindBy(xpath="//li//span[text()='Create and add another']")
	WebElement CreateandaddanotherBtn;
	
	@FindBy(xpath="//button//span[text()='Cancel']")
	WebElement Cancel;
	
	public void CompaniesPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	
}
