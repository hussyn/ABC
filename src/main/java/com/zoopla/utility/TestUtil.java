package com.zoopla.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.zoopla.base.TestBase;


public class TestUtil extends TestBase{

	public static void shortWait(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void waitExplicit(WebElement ele) {
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}
	public static void selectFromDropDown(WebElement ele,String VisibleText) {
		Select sel=new Select(ele);
		sel.selectByVisibleText(VisibleText);
	}
	
	public void switchToFrame() {
		driver.switchTo().frame("mainpanel");
	}
	//Perform Mouseover Function Using WebDriver In Java.
	public void hover(WebElement hoverElement,WebElement Ele ) {
		Actions action = new Actions(driver);
		WebElement item = driver.findElement(By.xpath("locator"));
		//We can achieve this by chaining all actions to simulate mouse hover.
		action.moveToElement(hoverElement).moveToElement(Ele).click().build().perform();
	}
	
	public void javscript(WebElement checkbox) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].checked = true;", checkbox);
	}
	//Open A New Tab
	
	public void OpenNewTab() {
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
	}

}