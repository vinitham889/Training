package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
	public static WebDriver driver;
	
	  @BeforeMethod
	  public void launch() {
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		  ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options);
		   //driver = new ChromeDriver();
		  driver.get("https://amazon.in");
		  driver.manage().window().maximize();
	  }
     
  @Test
  public void verifyHomepageTitle() {
       
	  WebElement ent=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
	    
		ent.sendKeys("kuk");
		
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
}
}