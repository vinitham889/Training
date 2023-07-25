package basic;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Example {
	public static WebDriver driver;
      public static void main(String[] args) throws InterruptedException, IOException {
    	  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		  ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.findElement(By.xpath("//select[@id=\"dropdown-class-example\"]")).click();
		//driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).click();
		//driver.findElement(By.xpath("//input[@value=\"radio1\"]")).click();
		//WebElement name = driver.findElement(By.xpath("//input[@id=\"name\"]"));
		//name.sendKeys("vinitha");
		//WebElement src=driver.findElement(By.xpath("//input[@id=\"autocomplete\"]"));
		//src.sendKeys("Ind");
		//Select sel = new Select(src);
		//sel.selectByVisibleText("India");
        //Select drp = new Select(drpoption);
		//drp.selectByVisibleText("Option1");
		//Selecting option from dropdown without using methods*/
		/*List<WebElement> allOptions = driver.findElements(By.cssSelector("#dropdown-class-example >option"));
		for(WebElement option:allOptions)
		{ if(option.getText().equals("Option3"));
		   { option.click();
		     break;
		   }
			}*/
		    //driver.findElement(By.xpath("//input[@id=\"autocomplete\"]")).sendKeys("India");
		    //driver.findElement(By.xpath("//div[@id=\"ui-id-42\"]")).click();
		       //Screenshot
		    //File Screenshotfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    //FileUtils.copyFile(Screenshotfile , new File("/SeleniumFramework/Screenshot.png"));
		     /*Drag and Drop
		    driver.get("https://jqueryui.com/droppable/");
		    Actions builder  = new Actions(driver);
		    WebElement from = driver.findElement(By.id("draggable"));
		    WebElement to = driver.findElement(By.id("droppable"));
		    builder.dragAndDrop(from, to).perform();*/
		    
      }
      
}
		


     
