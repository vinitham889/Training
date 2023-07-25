package basic;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.reporters.Files;

public class TakeSpecificScreenshot 
{
public static WebDriver driver;

	@BeforeMethod
	public void LogScreenshot()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(option);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }
	@Test
	public void image() throws IOException 
	{
		WebElement element = driver.findElement(By.cssSelector("img.logoClass"));
		File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Point location=element.getLocation();
		int width = element.getSize().getWidth();
		int height = element.getSize().getHeight();
		//To crop the specific image from full screen we use BufferedImage
		BufferedImage img = ImageIO.read(screen);
		//Taking specific image and to store in particular location
		BufferedImage dest = img.getSubimage(location.getX(), location.getY(), width, height);
		ImageIO.write(dest,"png",screen);
		File fis = new File(".//screenshot/log.png");
		FileUtils.copyFile(screen, fis);
	   //FileHandler.copy(screen, fis); //works same as FileUtils.copyFile
		
		//Delete screenshot 
	String screenshotPath = ".//screenshot/log.png";
		File screenshotFile = new File(screenshotPath);
	if(screenshotFile.exists())
	{
		screenshotFile.delete();
	}
	
	}

}
