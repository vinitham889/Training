package basic;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	 public WebDriver driver ;
	
	
	
  @Test
  public void f() {
	  System.out.println("launching chrome browser"); 
     // String driverPath = "C:\\Selenium\\chromedriver.exe";
      System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
      driver = new ChromeDriver();
       String baseUrl = "https://rahulshettyacademy.com/AutomationPractice/";
      
      driver.get(baseUrl);
     String expectedTitle = "Practice Page";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      driver.close();
	
	  
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
