package com.TestNGTest;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class findAlllinkAndBack {
	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		String notWorkingUrlTitle = "Under Construction: QAAutomated";
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		//create chrome instance
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//String baseUrl = "http://www.qaautomated.com/";
		String Url = "file:///E:/HTML%20Wireframe/signin.html";
		driver.navigate().to(Url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List<WebElement> linkElements = driver.findElements(By.tagName("a"));
        String[] linkTexts = new String[linkElements.size()];
        int i = 0;
         System.out.println("count link:"+linkElements.size());
        //extract the link texts of each link element
        for (WebElement elements : linkElements) {
            linkTexts[i] = elements.getText();
            i++;
        }

        //test each link
        for (String t : linkTexts) {
            driver.findElement(By.linkText(t)).click();
            Thread.sleep(2000);
            if (driver.getTitle().equals(notWorkingUrlTitle )) {
                System.out.println("\"" + t + "\""
                        + " is not working.");
            } else {
                System.out.println("\"" + t + "\""
                        + " is working.");
            }
            driver.navigate().back();
        }
        driver.quit();
    }
}
	

