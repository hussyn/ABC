package com.TestNGTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminInterface {
//http://softwaretestingtalk.com/registration-form/
	//http://softwaretestingtalk.com/automation-practice-form-a-basic-form-with-different-webelements/
	public static WebDriver driver;
	
	public void launchApp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.gcrit.com/build3/admin");
	}
	
	public void closeApp() {
		
		driver.close();
	}
	
	public void adminLogin(String Username, String Password) {
		
		driver.findElement(By.name("user")).sendKeys(Username);
		driver.findElement(By.name("pass")).sendKeys(Password);
		driver.findElement(By.id("tdb1")).click();
	}
	
	public void addManufacturer(String Name) {
		
		driver.findElement(By.linkText("Manufacturers")).click();
		driver.findElement(By.className("ui-button-text")).click();
		driver.findElement(By.name("manufacturers_name")).sendKeys(Name);
		driver.findElement(By.id("tdb1")).click();
	}
	
    public void addCategory(String Name) {
		
		driver.findElement(By.linkText("Categories/Products")).click();
		driver.findElement(By.className("ui-button-text")).click();
		driver.findElement(By.name("categories_name[1]")).sendKeys(Name);
		driver.findElement(By.id("tdb3")).click();
	}
    
    public void addProduct(String Name) {
		
		driver.findElement(By.linkText("Categories/Products")).click();
		driver.findElement(By.xpath(".//*[@id='tdb2']/span[2]")).click();
		driver.findElement(By.name("manufacturers_name")).sendKeys(Name);
		driver.findElement(By.id("tdb1")).click();
	}
	
	public static void main(String[] args) throws InterruptedException {


		AdminInterface obj = new AdminInterface();
		/*
		obj.launchApp();
		obj.adminLogin("admin", "admin@123");
		obj.addManufacturer("Oktav");
		obj.addCategory("Software");
		
		obj.closeApp();
		*/
		
		//TC1: Verify "Launch Application" in gcrShop Web portal Admin interface
		obj.launchApp();
		boolean Username = driver.findElement(By.name("username")).isDisplayed();
		boolean Password = driver.findElement(By.name("password")).isDisplayed();
		boolean Login = driver.findElement(By.id("tdb1")).isDisplayed();
		
		if(Username==true && Password==true && Login==true) {
			System.out.println("Username, Password and Login Passed Successfully !");
		}
		else {
			System.out.println("Username, Password and Login Failed !");
		}
		
		obj.closeApp();
		
		//TC2: Verify "Admin Login in gcrShop Web portal Admin interface
		obj.launchApp();
		obj.adminLogin("admin", "admin@123");
		String url = driver.getCurrentUrl();
		
		if (url.equals("http://www.gcrit.com/build3/admin/index.php")) {
			System.out.println("Admin Login Successfully Passed !");
		}
		else {
			System.out.println("Admin Login Failed !");
		}
		
		obj.closeApp();
		
		//TC3: Verify "Important/Required Elements availability" in gcrShop Web portal Admin interface
		obj.launchApp();
		obj.adminLogin("admin", "admin@123");
		boolean Manufact = driver.findElement(By.linkText("Manufacturers")).isDisplayed();
		boolean CatandProd = driver.findElement(By.linkText("Categories/Products")).isDisplayed();
		
		if(Manufact==true && CatandProd==true) {
			System.out.println("Manufacturers, Categories and Products Elements available");
		}
		else {
			System.out.println("Manufacturers, Categories and Products Elements not available");
		}
		
		obj.closeApp();
		
		//TC4: Verify "Add Manufacturer" in gcrShop Web portal Admin interface
		obj.launchApp();
		obj.adminLogin("admin", "admin@123");
		obj.addManufacturer("Oktav");
		String Man_count = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[22]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/strong[3]")).getText();
		int Manf_count = Integer.parseInt(Man_count);
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		if(Manf_count==2390) {
			System.out.println("Manufacturer added");
		}
		else {
			System.out.println("Manufacturer not added");
		}
		
		obj.closeApp();
		
		//TC5: 

	}

}