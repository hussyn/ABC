package com.TestNGTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest1 {
  @Test
  public void Test1() {
	  
	  System.out.println("Test1 excuted");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("beforeMethod excuted");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod excuted");
  }

  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("beforeClass excuted");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("afterClass excuted");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("beforeTest excuted");
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("afterTest excuted");
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("beforeSuite excuted");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite excuted");
  }
}
/*
@BeforeSuite First of all, beforeSuite() method is executed only once.
@BeforeTest - before first @Test method execution. It runs only once per class.
@BeforeClass -executed only once.

@BeforeMethod-executes for each test case but before executing the test case.

      each test case executes.

@AfterMethod-afterMethod() method executes for each test case but after executing the test case.

@AfterClass -executed only once.
@AfterTest -executed only once.
@AfterSuite    Lastly, the afterSuite() method executes only once.*/
