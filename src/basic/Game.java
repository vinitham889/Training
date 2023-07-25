package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Game {
	public static WebDriver driver;

	
	public static void main(String[] args) throws InterruptedException {
		
		
		 
			 System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
				
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				options.addArguments("--disable-notifications");

			driver = new ChromeDriver(options);
		    driver.get("https://app.hrone.cloud/login");
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    driver.findElement(By.xpath("//input[@id=\"hrone-username\"]")).sendKeys("vinitham@datatemplate.com");
		        driver.findElement(By.xpath("//*[contains(text(),' NEXT ')]")).click();
		        Thread.sleep(2000);
		       
		        WebElement pwd = driver.findElement(By.xpath("//input[@id=\"hrone-password\"]"));
		    		pwd.click();
		    		pwd.sendKeys("SelVin@22");
		    		driver.findElement(By.xpath("//*[contains(text(),' LOG IN ')]")).click();
		    		for(int i=0;i<=9;i++)
		    		{
		    		driver.findElement(By.xpath("//button[@class=\"btn btn-success cls-nextbtn ng-star-inserted\"]")).click();
		    		
		    		}
		    		driver.findElement(By.xpath("//div[contains(@class,'p-dialog-content')]/div/div/a/i")).click();
		    		driver.findElement(By.xpath("//div[contains(@class,'ng-tns-c75-150 p-dialog-content')]/div/a/i")).click();
		    		/*JavascriptExecutor js = (JavascriptExecutor)driver;
		    		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		    		Thread.sleep(5000);
		    		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		    		//Clicking date
		    		driver.findElement(By.xpath("(//*[@class=\"avatar-content ng-star-inserted\"])[1]")).click();
		    		driver.findElement(By.xpath("//div[contains(@class,'sidebarmenu ng-star-inserted')]/ul/li[1]/a [1]")).click();
		    		driver.findElement(By.xpath("(//*[@class=\"h-100\"])[6]")).click();*/
		    		
		    		//Adding AppLink
		    		driver.findElement(By.xpath("//img[@class=\"pt-1 w-45\"]")).click();
		    		driver.findElement(By.xpath("/html/body/app-root/app-main/app-sidebar/div[2]/div[2]/div[2]/span[1]")).click();
		    		Thread.sleep(1000);
		    		WebElement lnk=driver.findElement(By.xpath("//*[@id=\"mat-form-field-label-373\"]/span"));
		    		lnk.click();
		    		lnk.sendKeys("cliq");
	}

}
