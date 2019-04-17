package com.zoopla.utility;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.hubspot.base.TestBase;


public class TestListener extends TestBase implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("<----"+result.getName()+"  is Started---->");
		log.info("<----"+result.getName()+ "  is Started---->");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("<----"+result.getName()+"  was Passed---->");
		log.info("<----"+result.getName()+ "  was Passed---->");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("<----"+result.getName()+ "  was Failed---->");
		log.error("<----"+result.getName()+ "  was Failed---->");
		
		TakesScreenshot sc= (TakesScreenshot) driver;
		File scr=sc.getScreenshotAs(OutputType.FILE);
		
		File destfile=new File(".\\Screenshots\\"+result.getName()+"png");
		try {
			FileHandler.copy(scr, destfile); //FileHandler=Utility methods for common filesystem activities

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
//OutputType=this is interface and Defines the output type for a screenshot.
	//FILE=Obtain the screenshot into a temporary file that will be deleted once the JVM exits. It is up to users to make a copy of this file.
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("<----"+result.getName()+ "  was Skipped---->");
		log.warn("<----"+result.getName()+ "  was Skipped---->");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
