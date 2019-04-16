package com.TestNGTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getErrorFromPage {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		//create chrome instance
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		String Url = "https://app.hubspot.com/login";
		driver.navigate().to(Url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("ff@gmail.com");
		driver.findElement(By.id("password")).sendKeys("ff@gmail.com");
		driver.findElement(By.id("loginBtn")).click();
		//WebElement x = driver.findElement(By.xpath("//h2[@class=\"private-heading-5 private-alert__title\"]"));
		WebElement x = driver.findElement(By.xpath("//div[@class=\"private-alert__inner\"]/h2"));
		System.out.println(x.getText());
	}

}
