package com.TestNGTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @Test(dataProvider= "data")
    public void TestUltimatixFromExcelData(String userName,String password) {
        WebDriver driver; 
        driver=new FirefoxDriver();
        //Test to login into a site
    }

    @DataProvider(name="data")
    public static Object[][] dataProviderTest() throws Exception{

        Object[][] returnArray={new Object[]{"username1","password1"},new Object[]{"username2","password2"},new Object[]{"username3","password3"}
        };
        return returnArray;
    }
}