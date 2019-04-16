package sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class demoSikul {
	 
public static void main(String[] args) throws FindFailed, InterruptedException {
//Screen class is the base classes for all the methods provided by Sikuli. Screen class contains predefined methods for all the commonly performed operations on screen elements such as click, double-click, providing input to a text box, hover, etc
// We have to create Screen class object to access method 
Screen screen = new Screen();//Screen screen = new Screen();screen.click("QA.png");; screen.doubleClick("QA.png");


//Pattern class is used to associate the image file with additional attributes to uniquely identify the element. It takes the path of the image as a parameter. 
// Create object of Pattern class and specify the images path 
Pattern image = new Pattern("C:\\gmail.PNG");
 
Pattern image1 = new Pattern("C:\\images\\uname.PNG");
 
Pattern image2 = new Pattern("C:\\images\\password.PNG");
 
Pattern image3 = new Pattern("C:\\images\\click.PNG");
 
WebDriver driver=new FirefoxDriver();
 
driver.manage().window().maximize();
 
driver.get("http://www.google.com");
 
screen.wait(image, 10);
 
// using screen object we can call click method which will accept image path and will perform //action
 
// This will click on gmail image on google home page
 
screen.click(image);
 
// using screen object we can call type  method which will accept image path and content which //we have to type and will perform action.
 
// This  will type on username field
 
screen.type(image1, "mukeshotwani@gmail.com");
 
//This will type of password field
 
screen.type(image2, "password1");
 
// This will click on login button
 
screen.click(image3);
 
}
 
}