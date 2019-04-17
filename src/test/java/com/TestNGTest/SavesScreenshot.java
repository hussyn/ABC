package com.TestNGTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.hubspot.base.TestBase;
import com.hubspot.utility.JavaScriptUtil;
import com.zoopla.utility.TestUtil;

public class SavesScreenshot extends TestBase {
	
	
	@BeforeMethod
	public void setupHomePage() {
		TestBase testBase=new TestBase();
		 prop=testBase.initialize_Properties();
		 testBase.initialize_driver();
		 driver.navigate().to("https://app.hubspot.com/login");
	}
	
	@Test
	public void ScreenShotAS() throws InterruptedException {
		TestUtil TestUtil=new TestUtil();
		//Assert.assertEquals(true, false);
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("ajay@gmail.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("ajay@gmail.com");
		JavaScriptUtil.drawBorder(password, driver);
		//TestBase.getScreenshot();
		driver.findElement(By.id("loginBtn")).click();
		TestBase.getScreenshot();
		Shutterbug.shootPage(driver).withName("screenname").save();
		
		
	}
	@AfterMethod
	
	public void tearDown() {
		//driver.close();
	}

}
