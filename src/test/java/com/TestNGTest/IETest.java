package com.TestNGTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class IETest {

	@Test
	public void TestIE() {
		
		System.setProperty("webdriver.ie.driver", "E://software KS//IEDriverServer.exe");
        //Initialize InternetExplorerDriver Instance.
        WebDriver driver = new InternetExplorerDriver();
        driver.navigate().to("https://www.google.com/");
        driver.navigate().to("javascript:document.getElementById('overridelink').click()");  
        System.out.println("Selenium Webdriver Script in Internet Explorer browser");
        driver.close();
        
       // Mouse Hovering on Web Element:
        	 WebElement element=driver.findElement(By.xpath("Locator Value"));
        	 Actions actionseries=new Actions(driver);
        	// Action action=actionseries.moveToElement(element);
        	 //action.perform();
	}
	
	
}
