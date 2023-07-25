
package basic;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Screenshot {
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
	public void getScreenshot()throws IOException 
	{
//		WebElement element = driver.findElement(By.cssSelector("img.logoClass"));
		TakesScreenshot ts = (TakesScreenshot)driver;
		String screenshotPath = ".//screenshot/";
		File screenshotFile = new File(screenshotPath);
		if(!screenshotFile.exists())
		{
			File src = ts.getScreenshotAs(OutputType.FILE);
    File dst = new File(screenshotPath);
    FileUtils.copyFile(src,dst);
		}
		else
		{
			screenshotFile.delete();
		}
		
		
		
	}
	

}