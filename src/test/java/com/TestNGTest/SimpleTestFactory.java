package com.TestNGTest;

import org.testng.annotations.Factory;

public class SimpleTestFactory extends SimpleTest
{
	
	@Factory
	public Object[] factorymethod() {
		
		Object [] data=new Object [2];
		
		data[0]=new Test1();
		//data[1]=new Test2();//if you comment this line then org.testng.TestNGException: returned a null instanceat index 1
		
		return data;
		
		
	}
/*    @Factory
      public Object[] factoryMethod() {
        return new Object[] { 
	       new SimpleTest(), 
	       new SimpleTest() 
	       };
    }*/
}