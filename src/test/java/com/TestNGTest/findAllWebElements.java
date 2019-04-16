package com.TestNGTest;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class findAllWebElements {
	public static WebDriver driver;
	@Test
	
	public void Test() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		//create chrome instance
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> getElements = driver.findElements(By.tagName("a"));
		List<WebElement> getElements1 = driver.findElements(By.tagName("input"));
		System.out.println("link"+getElements.size());
		System.out.println(Integer.toString(getElements1.size()));
	
	
		for (WebElement ele:getElements1) {
			
			System.out.println(ele.getText());
		}
	}
	
	@Test
	//clickAllHyperLinksByTagName("h3"); 
		public static void clickAllHyperLinksByTagName(String tagName){
		    int numberOfElementsFound = getNumberOfElementsFound(By.tagName(tagName));
		    System.out.println(numberOfElementsFound);
		    for (int pos = 0; pos < numberOfElementsFound; pos++) {
		        getElementWithIndex(By.tagName(tagName), pos).click();
		        driver.navigate().back();
		    }
		}

		public static int getNumberOfElementsFound(By by) {
		    return driver.findElements(by).size();
		}

		public static WebElement getElementWithIndex(By by, int pos) {
		    return driver.findElements(by).get(pos);
		}
	
}
