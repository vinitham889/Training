package basic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class CreateAndDeleteScreenshot {
	public static WebDriver driver;
	@BeforeMethod
	public static void login()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		op.addArguments("--disable-notifications");
		driver = new ChromeDriver(op);
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void screenshot()
	{

        // Define the path to save the screenshots
        String screenshotPath =  ".//screenshot/";

        // Delete the previous screenshot if it exists
        File previousScreenshot = new File(screenshotPath + "previous_screenshot.png");
        if (previousScreenshot.exists()) {
            previousScreenshot.delete();
        }

        // Take a new screenshot
        File newScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Save the new screenshot
        try {
            String newScreenshotPath = screenshotPath + "new_screenshot.png";
            newScreenshot.renameTo(new File(newScreenshotPath));
        } catch (Exception e) {
            e.printStackTrace();
        }

    
        driver.quit();
    }
}