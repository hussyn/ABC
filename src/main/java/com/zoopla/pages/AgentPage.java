package com.zoopla.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.zoopla.base.TestBase;

public class AgentPage extends TestBase {

	@FindBy(css=".agent_phone>a")
	WebElement agentPhone;
	
	@FindBys(@FindBy(css=".sidebar.sbt>p>strong") )
	List<WebElement> agentNameNew;
	//1.b: Constructor of page class and initialize elements with driver
	public AgentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
