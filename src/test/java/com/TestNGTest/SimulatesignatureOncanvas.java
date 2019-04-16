package com.TestNGTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class SimulatesignatureOncanvas {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D://geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		//driver= new ChromeDriver();
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("Browser opened.");
		// loading URL
		driver.get("file:///E:/HTML%20Wireframe/drawing-a-signature/signature1.html");
		Actions actionBuilder=new Actions(driver);     
		//WebElement element = driver.findElement(By.xpath("//canvas"));
		WebElement wbCanvas = driver.findElement(By.xpath("//canvas"));
		Action drawOnCanvas=actionBuilder
		                .contextClick(wbCanvas)
		                .moveToElement(wbCanvas,8,8)
		                .clickAndHold(wbCanvas)
		                .moveByOffset(120, 120)
		                .moveByOffset(60,70)
		                .moveByOffset(-140,-140)
		                .release(wbCanvas)
		                .build();
		drawOnCanvas.perform();
/*		Actions act = new Actions(driver);
		driver.switchTo().frame("elecsign");
		WebElement canvasElement = driver.findElement(By.id("electronicSignImage"));
		 Action drawAction = act.moveToElement(canvasElement, 20, 20)
			.clickAndHold()
			.moveByOffset(80, 80)
			.moveByOffset(50, 20)
			.release()
			.build();
		drawAction.perform();*/
	}

}
