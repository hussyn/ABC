package com.TestNGTest;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestExample {
	@Test
	  public void testWithSkip() { 
	   String myVal[] = {"Avinash", "Mishra"};
	   String myCal[] = {"Avinash", "Mishra"};
	   for(String s : myVal){
	   if (s.equalsIgnoreCase("Avinash")){
	   //validate another name
	 if( myCal[1].contains("Kumar")){
	 System.out.println("Test passed");
	 }else{
	   throw new SkipException("Test skipped"); //here kumar is missing so test skiped
	   }
	   }
	   }
	  
	   }
	   
	  @Test
	  public void testWithOutSkip(){
	   System.out.println("testWithOutSkip invoked");
	  }
	
}
