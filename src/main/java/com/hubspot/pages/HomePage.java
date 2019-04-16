package com.hubspot.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.hubspot.base.TestBase;

import com.hubspot.utility.TestUtil;


public class HomePage extends TestBase{

	@FindBy(className = "private-page__title")
	WebElement homePageHeader;
	
	@FindBy(id = "nav-primary-contacts-branch")
	WebElement contactsTab;
	
	@FindBy(id = "nav-secondary-contacts")
	WebElement contactsLink;
	
	@FindBy(id = "nav-secondary-companies")
	WebElement companiesLink;
	
	@FindBy(id="nav-primary-conversations-branch")
	WebElement  ConversationsTab;
	
	@FindBy(id="nav-secondary-inbox")
	WebElement  ConversationsLink;
	
	@FindBy(id="nav-primary-marketing-branch")
	WebElement  MarketingTab;
	
	@FindBy(id="nav-secondary-ads-free")
	WebElement  AdsLink;
	
	//MarketingTab>LeadCapture>FormsLink
	@FindBy(id="nav-secondary-lead-capture-branch")
	WebElement  MarketingLeadCapturetab;
	
	@FindBy(id="nav-tertiary-forms")
	WebElement  FormsLink;
	
	@FindBy(id="nav-primary-sales-branch")
	WebElement SalesTab;
	
	@FindBy(id="nav-secondary-tasks")
	WebElement TasksLink;
	
	@FindBy(id="nav-primary-service-branch")
	WebElement ServiceTab;
	
	@FindBy(id="nav-secondary-tickets")
	WebElement TicketsLink;
	
	@FindBy(id="nav-primary-automation")
	WebElement AutomationTab;
	
	@FindBy(id="nav-primary-reports-branch")
	WebElement  ReportsTab;
	
	@FindBy(id="nav-secondary-reports-list")
	WebElement  ReportsLink;
	
	@FindBy(id="nav-secondary-dashboards")
	WebElement  DashboardsLink;
	

	
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean isInitialized() {
		return false; //firstName.isDisplayed();
	}
		
	public ContactsPage navigateToContactsPage(){
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(contactsTab));
		contactsTab.click();
		TestUtil.shortWait();
		contactsLink.click();
		
		return new ContactsPage(driver);
	}
	
	public ConversationsPage navigateToConversationsPage() {
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(ConversationsTab));
		ConversationsTab.click();
		TestUtil.shortWait();
		ConversationsLink.click();
		return new ConversationsPage(driver);
			
	}
	public  FormsPage navigateToFormsPage() {
	
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(MarketingTab));
		MarketingTab.click();
		TestUtil.shortWait();
	
		TestBase.HoverAndClick(driver, MarketingLeadCapturetab, FormsLink);
		return new FormsPage(driver);
		
	}
	
	public  MarketingPage navigateToMarketingPage() {
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(MarketingTab));
		MarketingTab.click();
		TestUtil.shortWait();
	
		TestBase.HoverAndClick(driver, MarketingLeadCapturetab, FormsLink);
		
		return new MarketingPage(driver);
	}
	
}
