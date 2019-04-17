package com.hubspot.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.Assert;

import com.zoopla.utility.WebEventListener;

//import com.zoopla.utility.TestListener;



public class TestBase {
	public static WebDriver driver;
	public Properties prop;
	//for log4j
	public Logger log;
	
	EventFiringWebDriver e_driver;
	public static WebDriverEventListener eventListener;
	//public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();

	public void initialize_driver() {
		//Set the path to Chrome driver
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		//Create driver object for Chrome
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//tdriver.set(driver);
		//return getDriver();
		
		e_driver=new EventFiringWebDriver(driver);
		
	    eventListener = new WebEventListener(); 
	    e_driver.register(eventListener);
	    driver=	e_driver;
			
	}

/*	public static synchronized WebDriver getDriver() {
		return tdriver.get();
	}*/
	
	public Properties initialize_Properties() {

		log=Logger.getLogger(this.getClass());
		
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")
					
					+ "\\src\\main\\java\\com\\hubspot\\config\\config.properties");
			//System.out.println("user.dir");
			//System.out.println(ip);
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return prop;
	}
	

	
	public static String getScreenshot() {
		TakesScreenshot sh=(TakesScreenshot) driver;
		
		File src = sh.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "//Screenshot//" + System.currentTimeMillis() +"ScreenshotName" +".png";
		System.out.println(path);
		//String path = ".\\Screenshot\\" + System.currentTimeMillis() + ".png";
		File destination = new File(path);
		try {
			FileUtils.copyFile(src, destination);
			//FileHandler.copy(src, destination);
		} catch (IOException e) {
			System.out.println("Capture Failed " + e.getMessage());
		}
		return path;
	}
	
	public static void HoverAndClick(WebDriver driver,WebElement elementToHover,WebElement elementToClick) {
		Actions action = new Actions(driver);
		action.moveToElement(elementToHover).click(elementToClick).build().perform();
	}
	
	public static void HoldTabLink(WebElement ele) {
		
		Actions act=new Actions(driver);
		act.release(ele);
		
		
	}

	public static void switchTabLink(WebElement ele) {
		
		Actions act=new Actions(driver);
		act.moveToElement(ele).build().perform();
	}

	////////////////////////
	 //(JS CLICK METHOD)
    public void jsClick(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", element);
    }


                //(JS SCROLL DOWN INTO VIEW)
    public void jsScrollElementIntoView(WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }


                //(HIGHLIGHT METHOD)
    public static void highlight(WebElement element) throws InterruptedException {
        for (int i = 0; i < 2; i++) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript(
                    "arguments[0].setAttribute('style', arguments[1]);",
                    element, "border: 4px solid Green;");
            Thread.sleep(200);
            js.executeScript("arguments[0].setAttribute('style', arguments[1]);",element, "");

            Thread.sleep(200);
        }
    }

    public void verifyTitle(String expected){
        String actual = driver.getTitle();
        Assert.assertEquals(expected, actual);

    }

                //(DELAY/TIME UNIT METHOD)
    public void delayFor(int timeInMili) {
        try {
            Thread.sleep(timeInMili);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    
}
	/////////////
}
