package sikuli;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class MyVerification_05 {
 
    public WebDriver driver;
    private String baseUrl;
     
    public static void main(String[] args) {
        MyVerification_05 mv =new MyVerification_05();
        mv.launch_test();
    }
    public void launch_test()  
    {
        driver = new FirefoxDriver();
        baseUrl = "http://demo.tanmaysarkar.com/sample_04.html";
        driver.get(baseUrl);
         
        WebElement image1 = driver.findElement(By.xpath("//img[contains(@alt,'image one')]"));
         
        Boolean imageLoaded1 = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", image1);
        if (!imageLoaded1)
        {
             System.out.println("1. Image is not present");
        }
        else
        {
            System.out.println("1. Got it");
        }
         
        WebElement image2 = driver.findElement(By.xpath("//img[contains(@alt,'image two')]"));
         
        Boolean imageLoaded2 = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", image2);
        if (!imageLoaded2)
        {
             System.out.println("2. Image is not present");
        }
        else
        {
            System.out.println("2. Got it");
        }
         
        driver.close();
    }
}
/*only first image is present and second one is missing or the link is broken , so the output is –

1. Got it
2. Found broken image*/