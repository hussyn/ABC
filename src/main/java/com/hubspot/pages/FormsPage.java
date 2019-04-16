package com.hubspot.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hubspot.base.TestBase;
import com.zoopla.utility.TestUtil;

public class FormsPage extends TestBase{
	
		@FindBy(id="nav-primary-marketing-branch")
		WebElement  MarketingTab;
	//MarketingTab>LeadCapture>FormsLink
		@FindBy(id="nav-secondary-lead-capture-branch")
		WebElement  MarketingLeadCapturetab;
		
		@FindBy(id="nav-tertiary-forms")
		WebElement  FormsLink;
	
	public FormsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickForm() {
		TestUtil.waitExplicit(MarketingLeadCapturetab);
		TestBase.HoldTabLink(MarketingLeadCapturetab);
		TestUtil.waitExplicit(FormsLink);
		TestBase.switchTabLink(FormsLink);
		TestUtil.shortWait();
	
	}

}
