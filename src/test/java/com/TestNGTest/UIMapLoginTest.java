package com.TestNGTest;

import static org.testng.AssertJUnit.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UIMapLoginTest {
	public WebDriver driver;
	public UIMap uimap;
	public UIMap datafile;
	public String workingDir;

	@Test
	public void login() throws Exception {

		// Get object map file
		uimap = new UIMap(workingDir + "\\src\\test\\java\\com\\TestNGTest\\locator.properties");

		// Get the username element
		WebElement username = driver.findElement(uimap
				.getLocator("Username_field"));
		username.sendKeys(datafile.getData("username"));

		// Get the password element
		WebElement password = driver.findElement(uimap
				.getLocator("Password_field"));
		password.sendKeys(datafile.getData("password"));

		// Click on the Login button
		WebElement login = driver.findElement(uimap.getLocator("Login_button"));
		login.click();

		Thread.sleep(3000);
		// Assert the user login by checking the Online user
		WebElement onlineuser = driver.findElement(uimap
				.getLocator("online_user"));
		assertEquals("Hi, John Smith", onlineuser.getText());
	}

	@BeforeMethod
	public void setUp() throws Exception {

		// Get current working directory and load data file
		workingDir = System.getProperty("user.dir");
		datafile = new UIMap(workingDir + "\\src\\test\\java\\com\\TestNGTest\\datafile.properties");

		// Create a new instance of the Firefox driver
		//System.setProperty("webdriver.gecko.driver", "D://geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");	
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("http://phptravels.net/login");
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void afterMethod() throws Exception {
		driver.quit();
	}

}