package com.TestNGTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicLoginID {
	WebDriver driver;
	@Test
	public void login() {
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	//create chrome instance
	driver = new ChromeDriver();
	driver.manage().window().maximize();

	String Url = "https://www.valentino.com/en-gb/account/User/Login";
	driver.navigate().to(Url);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.id("username")).sendKeys("ff@gmail.com");
	driver.findElement(By.id("password")).sendKeys("ff@gmail.com");
	driver.findElement(By.id("loginBtn")).click();
}
	}
