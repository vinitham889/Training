package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Droppable {

	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

	driver = new ChromeDriver(options);

		
		//WebDriver driver = new ChromeDriver();
			
		 
	driver.get("https://jqueryui.com/droppable/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  WebElement framename = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
	  driver.switchTo().frame(framename);
	  WebElement from = driver.findElement(By.xpath("//*[contains(text(),'Drag me to my target')]"));
	    WebElement to = driver.findElement(By.xpath("//*[contains(text(),'Drop here')]"));
	  
	    Actions builder  = new Actions(driver);
	    Action work = builder.clickAndHold(from).moveToElement(to).build();
	    //.moveToElement(from)
	    //.click()
	    //.dragAndDrop(from, to)
	    
	    work.perform();
	     driver.switchTo().defaultContent();
		}

	}

