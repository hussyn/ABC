package com.hubspot.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.hubspot.base.TestBase;

public class Switchtab {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://app.hubspot.com/login");
		driver.findElement(By.id("username")).sendKeys("samrizriz@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Zaman321");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("nav-primary-marketing-branch")).click();
		System.out.println("click");
		Actions act=new Actions(driver);
		
		WebElement clickleadcapture = driver.findElement(By.id("nav-secondary-lead-capture-branch"));
		//act.release(clickleadcapture);
		WebElement clickforms=driver.findElement(By.id("nav-tertiary-forms"));
		//act.click(clickforms).build().perform();
		TestBase.HoverAndClick(driver, clickleadcapture, clickforms);
	}
}
