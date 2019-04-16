package sikuli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliDemo {
//<img role="presentation" alt="Guru99 Demo Sites" src="/logo.png"/>
    public static void main(String[] args) throws FindFailed  {

        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        String filepath = "E:\\TestData\\imagecomparisionbySikuli\\";
        String inputFilePath = "E:\\TestData\\imagecomparisionbySikuli\\";
        Screen s = new Screen();
        Pattern fileInputTextBox = new Pattern(filepath + "logo.PNG");
        Pattern openButton = new Pattern(filepath + "OpenButton.PNG");
        WebDriver driver;

        // Open Chrome browser    
        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/image_upload/index.php");

        // Click on Browse button and handle windows pop up using Sikuli
        driver.findElement(By.xpath(".//*[@id='photoimg']")).click();
        s.wait(fileInputTextBox, 20);
        s.type(fileInputTextBox, inputFilePath + "Test.docx");
        s.click(openButton);

        // Close the browser
        driver.close();

    }

}