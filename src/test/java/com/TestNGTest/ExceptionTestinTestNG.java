package com.TestNGTest;

import org.testng.annotations.Test;

public class ExceptionTestinTestNG {
	@Test
	 public void testException() {
	 System.out.println("SoftwareTesting");
	 int i = 1 / 0; //java.lang.ArithmeticException: / by zero
	 }

	@Test(expectedExceptions = ArithmeticException.class)//The list of exceptions that a test method is expected to throw. If no exception or a different than one on this list is thrown, this test will be marked a failure.

	 public void testException1() {
	 System.out.println("pass without throw ArithmeticException ");
	 int i = 1 / 0; 
	 }
}
