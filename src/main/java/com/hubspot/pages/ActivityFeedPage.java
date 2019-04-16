package com.hubspot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActivityFeedPage {

	@FindBy(id="nav-secondary-activity")
	WebElement createContactSecondBtn;
	
	@FindBy(id = "uid-ctrl-1")
	WebElement email;
	
}
