
package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Trail {

	public static WebDriver driver;
     @BeforeMethod
	 public void launch()
	 {
		 System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options);
	    driver.get("https://app.hrone.cloud/login");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 }
	@Test
	public void tc1()
	{
	    driver.findElement(By.xpath("//input[@id=\"hrone-username\"]")).sendKeys("vinitham@datatemplate.com");
        driver.findElement(By.xpath("//*[contains(text(),' NEXT ')]")).click();
        WebElement pwd = driver.findElement(By.xpath("//input[@id=\"hrone-password\"]"));
    		pwd.click();
    		pwd.sendKeys("SelVin@22");
    		driver.findElement(By.xpath("//*[contains(text(),' LOG IN ')]")).click();
    		}
	@Test
	public void tc2() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id=\"hrone-username\"]")).sendKeys("vinitha67@datatemplate.com");
		driver.findElement(By.xpath("//*[contains(text(),' NEXT ')]")).click();
		WebElement pwd = driver.findElement(By.xpath("//input[@id=\"hrone-password\"]"));
		pwd.click();
		pwd.sendKeys("Pwd@2^3");
		driver.findElement(By.xpath("//*[contains(text(),' LOG IN ')]")).click();
		Thread.sleep(1000);
		
	}
	@Test
	public void tc() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id=\"hrone-username\"]")).sendKeys("vinitham@datatemplate.com");
		driver.findElement(By.xpath("//*[contains(text(),' NEXT ')]")).click();
		WebElement pwd = driver.findElement(By.xpath("//input[@id=\"hrone-password\"]"));
		pwd.click();
		pwd.sendKeys("Vin@22");
		driver.findElement(By.xpath("//*[contains(text(),' LOG IN ')]")).click();
		Thread.sleep(1000);
	}
	@Test
	public void tc4() throws InterruptedException 
	{
		driver.findElement(By.xpath("//input[@id=\"hrone-username\"]")).sendKeys("vinitham1@datatemplate.com");
		driver.findElement(By.xpath("//*[contains(text(),' NEXT ')]")).click();
		WebElement pwd = driver.findElement(By.xpath("//input[@id=\"hrone-password\"]"));
		pwd.click();
		pwd.sendKeys("SelVin@22");
		driver.findElement(By.xpath("//*[contains(text(),' LOG IN ')]")).click();
		Thread.sleep(1000);
		}
	@Test
	public void tc5() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id=\"hrone-username\"]")).sendKeys("          vinitham@datatemplate.com");
		driver.findElement(By.xpath("//*[contains(text(),' NEXT ')]")).click();
		WebElement pwd = driver.findElement(By.xpath("//input[@id=\"hrone-password\"]"));
		pwd.click();
		pwd.sendKeys("SelVin@22");
		driver.findElement(By.xpath("//*[contains(text(),' LOG IN ')]")).click();
		Thread.sleep(1000);
	}
	@Test
	public void tc6() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[@class=\"login-by ng-star-inserted\"]")).click();
		WebElement  cmpCode =driver.findElement(By.id("hrone-userdomain"));
		cmpCode.click();
		cmpCode.sendKeys("02935");
		WebElement empCode=driver.findElement(By.xpath("//input[@id=\"hrone-username\"]"));
		empCode.click();
		empCode.sendKeys("10712");
		driver.findElement(By.xpath("//*[contains(text(),' NEXT ')]")).click();
		WebElement pwd1=driver.findElement(By.xpath("//input[@id=\"hrone-password\"]"));
		pwd1.click();
		pwd1.sendKeys("Pwd@2^3");
		driver.findElement(By.xpath("//*[contains(text(),' LOG IN ')]")).click();
		Thread.sleep(1000);
	}
	@Test
	public void tc7() throws InterruptedException
	{ 
		driver.findElement(By.xpath("//span[@class=\"login-by ng-star-inserted\"]")).click();
		WebElement  cmpCode =driver.findElement(By.id("hrone-userdomain"));
		cmpCode.click();
		cmpCode.sendKeys("02935");
		WebElement empCode=driver.findElement(By.xpath("//input[@id=\"hrone-username\"]"));
		empCode.click();
		empCode.sendKeys("10712");
		driver.findElement(By.xpath("//*[contains(text(),' NEXT ')]")).click();
		WebElement pwd1=driver.findElement(By.xpath("//input[@id=\"hrone-password\"]"));
		pwd1.click();
		pwd1.sendKeys("Pweed@23");
		driver.findElement(By.xpath("//*[contains(text(),' LOG IN ')]")).click();
		Thread.sleep(1000);
		
	}
	@Test
	public void tc8() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[@class=\"login-by ng-star-inserted\"]")).click();
		WebElement  cmpCode =driver.findElement(By.id("hrone-userdomain"));
		cmpCode.click();
		cmpCode.sendKeys("02935");
		WebElement empCode=driver.findElement(By.xpath("//input[@id=\"hrone-username\"]"));
		empCode.click();
		empCode.sendKeys("10112");
		driver.findElement(By.xpath("//*[contains(text(),' NEXT ')]")).click();
		WebElement pwd1=driver.findElement(By.xpath("//input[@id=\"hrone-password\"]"));
		pwd1.click();
		pwd1.sendKeys("Pweed@23");
		driver.findElement(By.xpath("//*[contains(text(),' LOG IN ')]")).click();
		Thread.sleep(3000);
	}
	@Test
	public void tc9() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[@class=\"login-by ng-star-inserted\"]")).click();
		WebElement  cmpCode =driver.findElement(By.id("hrone-userdomain"));
		cmpCode.click();
		cmpCode.sendKeys("02935");
		driver.findElement(By.xpath("//span[contains(text(),' NEXT ')]")).click();
		Thread.sleep(1000);
		
	}
	@Test
	public void tc10() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[@class=\"login-by ng-star-inserted\"]")).click();
		WebElement empCode=driver.findElement(By.xpath("//input[@id=\"hrone-username\"]"));
		empCode.click();
		empCode.sendKeys("10712");
		driver.findElement(By.xpath("//span[contains(text(),' NEXT ')]")).click();
		Thread.sleep(1000);
	}
	
	@Test
	public void tc11()
	{
		driver.findElement(By.xpath("//span[@class=\"login-by ng-star-inserted\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-h-40 btn-login btn-outline-success loginform m-r-10 outline ng-star-inserted\"]")).click();
	}
	@Test
	public void tc12() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id=\"hrone-username\"]")).sendKeys("8197723276");
        driver.findElement(By.xpath("//*[contains(text(),' NEXT ')]")).click();
        WebElement pwd = driver.findElement(By.xpath("//input[@id=\"hrone-password\"]"));
    		pwd.click();
    		pwd.sendKeys("SelVin@22");
    		driver.findElement(By.xpath("//*[contains(text(),' LOG IN ')]")).click();
    		Thread.sleep(1000);
	}
	@Test
	public void tc13() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id=\"hrone-username\"]")).sendKeys("8190723276");
        driver.findElement(By.xpath("//*[contains(text(),' NEXT ')]")).click();
        WebElement pwd = driver.findElement(By.xpath("//input[@id=\"hrone-password\"]"));
    		pwd.click();
    		pwd.sendKeys("SelVin@22");
    		driver.findElement(By.xpath("//*[contains(text(),' LOG IN ')]")).click();
		    Thread.sleep(1000);
		
	}
	@Test
	public void tc14() throws InterruptedException 
	{
		driver.findElement(By.xpath("//input[@id=\"hrone-username\"]")).sendKeys("81977232762");
        driver.findElement(By.xpath("//*[contains(text(),' NEXT ')]")).click();
        WebElement pwd = driver.findElement(By.xpath("//input[@id=\"hrone-password\"]"));
    		pwd.click();
    		pwd.sendKeys("SelVin@22");
    		driver.findElement(By.xpath("//*[contains(text(),' LOG IN ')]")).click();
		    Thread.sleep(1000);
		
	}
	@Test
	public void tc15() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id=\"hrone-username\"]")).sendKeys("819772327");
        driver.findElement(By.xpath("//*[contains(text(),' NEXT ')]")).click();
        WebElement pwd = driver.findElement(By.xpath("//input[@id=\"hrone-password\"]"));
    		pwd.click();
    		pwd.sendKeys("SelVin@22");
    		driver.findElement(By.xpath("//*[contains(text(),' LOG IN ')]")).click();
		    Thread.sleep(1000);
	}
	@Test
	public void tc16() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id=\"hrone-username\"]")).sendKeys("8197723276");
        driver.findElement(By.xpath("//*[contains(text(),' NEXT ')]")).click();
        WebElement pwd = driver.findElement(By.xpath("//input[@id=\"hrone-password\"]"));
    		pwd.click();
    		pwd.sendKeys("QVin@22");
    		driver.findElement(By.xpath("//*[contains(text(),' LOG IN ')]")).click();
		    Thread.sleep(1000);
	}
	@Test
	public void tc17() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id=\"hrone-username\"]")).sendKeys("8197723276");
		driver.findElement(By.xpath("//*[contains(text(),' NEXT ')]")).click();
	    driver.findElement(By.xpath(" //a[contains(text(),' Forgot Password?')]")).click();
	   Thread.sleep(1000);
	   
	}
	@Test
	public void tc18() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id=\"hrone-username\"]")).sendKeys("8197723276");
		driver.findElement(By.xpath("//*[contains(text(),' NEXT ')]")).click();
		WebElement pwd = driver.findElement(By.xpath("//input[@id=\"hrone-password\"]"));
		pwd.click();
		pwd.sendKeys("PwD@22");
		driver.findElement(By.xpath("//*[contains(text(),' visibility')]")).click();
		Thread.sleep(4000);
	}
	/*
	@Test
	public void tc19()
	{
		driver.findElement(By.xpath("//input[@id=\"hrone-username\"]")).sendKeys("vinitham@datatemplate.com");
		driver.findElement(By.xpath("//*[contains(text(),' NEXT ')]")).click();
		driver.findElement(By.xpath(" //a[contains(text(),' Forgot Password?')]")).click();
		driver.findElement(By.id("mat-input-2")).sendKeys("vinitham@datatemplate.com");
		driver.findElement(By.xpath("//div[@class=\"recaptcha-checkbox-checkmark\"]")).click();
		WebElement btn=driver.findElement(By.xpath("//button[@class=\"btn btn-login btn-block btn-h-40 ladda-button\"]"));
		btn.submit();
	}*/
	@AfterMethod
	public void logOut() {
		driver.close(); 
	}
		
	}
