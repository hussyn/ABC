package com.zoopla.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoopla.base.TestBase;


public class SearchPage extends TestBase  {

	@FindBy(xpath="//select[@name='results_sort']")
	public WebElement resultsSort;
	
	
	@FindBy(css=".listing-results-price.text-price")
	public static List<WebElement> price;
	
	//initialize page Object
	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	public  static void getPrice() {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		int priceCnt = price.size();
		System.out.println(priceCnt);
		int cnt = 0;

		for (WebElement pri:price) 
		{
			  if (pri.getText().contains("�")) 
			  		{
			
				  System.out.println(pri.getText());
				  cnt++;
				  System.out.println(cnt);
				  	if(cnt==7) {
				  		System.out.println("cnt:"+cnt);
				  		System.out.println("5th::"+pri);
				  		System.out.println("5th:"+pri.getAttribute("href"));
				  		
				  		String clicEle = pri.getAttribute("href");
				  		////a[contains(text(),'�62,500,000')]
				  		js.executeScript("arguments[0].scrollIntoView(true)", pri);	
				  		System.out.println("scorlling done");
				  		//Thread.sleep(2000);
				  		js.executeScript("arguments[0].style.border='3px dotted blue';", pri);

				  		js.executeScript("window.location = '"+clicEle+ "'");
				  		//js.executeScript("arguments[0].click;", pri);	
				  		System.out.println("click done");
				  		//pri.click();
				  		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					break;
				                }	
			  			}	
		 }
	}
	
	
}
