package com.TestNGTest;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageScreenShot {
	public static void main(String[] args) throws Exception {
		// set the geckodriver.exe property
		System.setProperty("webdriver.gecko.driver", "D:/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		// set time limit to find the element
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// Go to URL
		driver.get("https://chercher.tech/selenium-webdriver-sample");
		// Take a ScreenShot
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:\\pageScreenshot.png"), true);

		// Close Driver
		driver.quit();
	}}