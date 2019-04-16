package com.TestNGTest;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerAndOuterHTML {

	public static void main(String[] args) {
		
	
	WebDriver driver = null;
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	//create chrome instance
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	String baseUrl = "https://www.xoom.com/sign-up";
	//String Url = "file:///E:/HTML%20Wireframe/signin.html";
	driver.navigate().to(baseUrl);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	//List<WebElement> el=driver.findElements(By.xpath("//input[@type=\"text\" or @type=\"email\" or @type=\"password\"]"));
	//List<WebElement> el=driver.findElements(By.xpath("//label[@class]"));
	List<WebElement> el=driver.findElements(By.xpath("//input[@type]"));

	System.out.println(el.size());
	for (int i = 0; i < el.size(); i++)
	{  
		System.out.println("text--------:"+el.get(i).getText());
		System.out.println("outerHTML:"+el.get(i).getAttribute("outerHTML"));
	    System.out.println("type:"+el.get(i).getAttribute("type"));
	    System.out.println("id:"+el.get(i).getAttribute("id"));
	    System.out.println("class:"+el.get(i).getAttribute("class"));
	}
}
}