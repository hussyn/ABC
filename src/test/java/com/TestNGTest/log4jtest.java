package com.TestNGTest;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//import org.apache.log4j.Logger;


public class log4jtest {
	public static WebDriver driver;
	
	public static Logger log=Logger.getLogger("log4jtest");

@Test
	public void Test1() {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
			//create chrome instance
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		
			String Url = "https://app.hubspot.com/login";
			driver.navigate().to(Url);
			log.info("url passed");
			//log.debug("Getting errors");
			
			log.debug("hello debug");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.id("username")).sendKeys("ff@gmail.com");
			driver.findElement(By.id("password")).sendKeys("ff@gmail.com");
			driver.findElement(By.id("loginBtn")).click();
			//WebElement x = driver.findElement(By.xpath("//h2[@class=\"private-heading-5 private-alert__title\"]"));
			WebElement x = driver.findElement(By.xpath("//div[@class=\"private-alert__inner\"]/h2"));
			System.out.println(x.getText());
		}
	

}
