package com.hubspot.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hubspot.base.TestBase;
import com.zoopla.utility.TestUtil;

public class MarketingPage extends TestBase {

	@FindBy(id="nav-primary-marketing-branch")
	WebElement  MarketingTab;
	
	@FindBy(id="nav-secondary-ads-free")
	WebElement  AdsLink;
	
	//MarketingTab>LeadCapture>FormsLink
	@FindBy(id="nav-secondary-lead-capture-branch")
	public static WebElement  MarketingLeadCapturetab;
	
	@FindBy(id="nav-tertiary-forms")
	public static WebElement  FormsLink;
	
/*	@FindBy(id="nav-primary-sales-branch")
	WebElement SalesTab;*/
	
	@FindBy(id="nav-secondary-tasks")
	public static WebElement TasksLink;

	
	public MarketingPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickForm() {
		TestUtil.waitExplicit(MarketingLeadCapturetab);
		TestBase.HoldTabLink(MarketingLeadCapturetab);
		TestUtil.waitExplicit(MarketingPage.FormsLink);
		TestBase.switchTabLink(FormsLink);
		TestUtil.shortWait();
	
	}
}
