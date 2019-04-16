package com.TestNGTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExe {
	
	@Test(dataProvider="getdata")
	public void LoginTest(String username,String password){
	
		System.out.println("username"+username);
		System.out.println("password"+password);
	
		}
	
	@DataProvider(name="getdata")
	
	public Object [][] getdata1()
	{
	 Object [][] data=new Object[2][2];	
	 data[0][0]="sajjad3";
	 data[0][1]="sajjad4";
	 data[1][0]="sajjad1";
	 data[1][1]="sajjad2";
	return data;
	}
	
	
	
}
