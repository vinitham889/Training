package basic;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HroneHomePage {
	public static WebDriver driver;
	 @BeforeMethod
	 public void lunch() throws InterruptedException
	 {
		 System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			options.addArguments("--disable-notifications");

		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
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
    		
	    
	 }
	 
	 @Test
		public void tc1() throws InterruptedException
		
		{
		     driver.findElement(By.xpath("//div[contains(@class,'p-dialog-content')]/div/div/a/i")).click();
    		   driver.findElement(By.xpath("//div[contains(@class,'p-dialog-content')]/div/a/i")).click();
		       /* WebElement ent = driver.findElement(By.xpath("//span[@class=\"text-center\"]"));
	    		ent.click();
	    		driver.findElement(By.xpath("//input[@id=\"search_text\"]")).sendKeys("Actions");
	    		driver.findElement(By.xpath("//a[@class=\"btnclose p-0 clearbtn font-medium ng-star-inserted\"]")).click();
	    		driver.findElement(By.xpath("//figure[@class=\"align-items-center d-flex justify-content-center p-1 mb-0 pb-0\"]")).click();
	    		driver.findElement(By.xpath("//i[@class=\"Inbox\"]")).click();
	    		driver.findElement(By.xpath("//span[@class=\"cls-cross\"]")).click();
	    		//Request icon
	    		driver.findElement(By.xpath("//i[@class=\"Request\"]")).click();
	    		driver.findElement(By.xpath("//li[@class=\"cls-outermenu ng-star-inserted\"][1]")).click();
	    		Thread.sleep(3000);
	    		driver.findElement(By.xpath("//*[contains(text(),'Approved ')]")).click();
	    		Thread.sleep(3000);
	    		driver.findElement(By.xpath("//*[contains(text(),'Rejected ')]")).click();
	    		Thread.sleep(3000);
	    		driver.findElement(By.xpath("//*[contains(text(),'Undo')]")).click();
	    		Thread.sleep(3000);
	    		driver.findElement(By.xpath("//*[contains(text(),'Drafts')]")).click();
	    		Thread.sleep(3000);
	    		driver.findElement(By.xpath("//*[contains(@class,'btn waves-effect waves-light btn-warning')]")).click();
	    		Thread.sleep(3000);
	    		driver.findElement(By.xpath("//i[@class=\"fa fa-arrow-left\"]")).click();*/
	    	
	    		//Adding application links
	     driver.findElement(By.xpath("//img[@class=\"pt-1 w-45\"]")).click();
		 driver.findElement(By.xpath("/html/body/app-root/app-main/app-sidebar/div[2]/div[2]/div[2]/span[1]")).click();
		 Thread.sleep(3000);

		 driver.findElement(By.xpath("(//input[starts-with(@id,'mat-input')]/../..)[1]")).sendKeys("TEST");
		 Thread.sleep(2000);
	//	 Shtcut.sendKeys("cliq");
		 driver.findElement(By.xpath("//input[@id=\"mat-input-39\"]")).sendKeys("https://cliq.zoho.in/");
		 driver.findElement(By.xpath("//button[contains(text(),' DONE ')]")).click();
		 driver.findElement(By.xpath("//*[@class=\"material-icons font-semibold closediv\"]")).click();
    	 
    	   //Profile widget
    	  
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("/html/body/app-root/app-main/app-sidebar/div/ul/li[5]/div/a/ngx-avatar/div")).click();
	     driver.findElement(By.xpath("//div[contains(@class,'sidebarmenu ng-star-inserted')]/ul/li[1]/a [1]")).click();
	     driver.findElement(By.xpath("//*[@id=\"sidevanv-content\"]/div/app-my-calendar/div/div/app-emp-attendance/div/div[2]/div/div[1]/perfect-scrollbar/div/div[1]/app-attendance-calendar/div/div/div[2]/div[1]/div[5]/div")).click();
		 driver.findElement(By.xpath("//div[contains(@class,'sidebarmenu ng-star-inserted')]/ul/li[2]/a")).click();
		 driver.findElement(By.xpath("//div[contains(@class,'sidebarmenu ng-star-inserted')]/ul/li[3]/a")).click();
		 driver.findElement(By.xpath("//div[contains(@class,'sidebarmenu ng-star-inserted')]/ul/li[4]/a")).click();
		 driver.findElement(By.xpath("//div[contains(@class,'sidebarmenu ng-star-inserted')]/ul/li[5]/a")).click();
		 driver.findElement(By.xpath("//div[contains(@class,'sidebarmenu ng-star-inserted')]/ul/li[6]/a")).click();
		 driver.findElement(By.xpath("//div[contains(@class,'sidebarmenu ng-star-inserted')]/ul/li[7]/a")).click();
		 driver.findElement(By.xpath("//div[contains(@class,'sidebarmenu ng-star-inserted')]/ul/li[8]/a")).click();
		 driver.findElement(By.xpath("//div[contains(@class,'sidebarmenu ng-star-inserted')]/ul/li[9]/a")).click();
		 driver.findElement(By.xpath("//div[contains(@class,'sidebarmenu ng-star-inserted')]/ul/li[10]/a")).click();
		 //Profile Information
		driver.findElement(By.xpath("//div[contains(@class,'sidebarmenu ng-star-inserted')]/ul/li[11]/a")).click();
		 driver.findElement(By.xpath("//*[@id=\"manage-list\"]/mat-list-item[2]")).click();
		 driver.findElement(By.xpath("//*[@class=\"btn btn-success btn-h-40 ng-star-inserted\"]")).click();
		 driver.findElement((By.xpath("//*[@id=\"AadharNumber\"]"))).sendKeys("834510997774");
		 driver.findElement(By.xpath("//*[@id=\"PassportNumber\"]")).sendKeys("u9729217");
		driver.findElement(By.xpath("//*[@id=\"passportExpiryDate\"]")).sendKeys("24/05/2026");
		 
		driver.findElement(By.xpath("//*[@id=\"PersionalEamil\"]")).sendKeys("vmini8319@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"EmergencyName\"]")).sendKeys("Thilagam");
		driver.findElement(By.xpath("//*[@id=\"EmergencyContactNumber\"]")).sendKeys("8197723276");
		Thread.sleep(3000);
		WebElement drp =driver.findElement(By.xpath("(//*[contains(text(),'Relation')])[1]"));
		drp.click();
		driver.findElement(By.xpath("//*[contains(text(),'Mother')]")).click();
		Thread.sleep(1000);
		//Family information
		driver.findElement(By.xpath("//*[@id=\"manage-list\"]/mat-list-item[3]/div/a")).click();
		driver.findElement(By.xpath("//*[@class=\"btn btn-success btn-h-40 ng-star-inserted\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"FatherName\"]")).sendKeys("Mani k");
		driver.findElement(By.xpath("//*[@id=\"FatherDob\"]")).sendKeys("22/07/1973");
		driver.findElement(By.xpath("//*[@id=\"MotherName\"]")).sendKeys("Thilagam");
		driver.findElement(By.xpath("//*[@id=\"MotherDob\"]")).sendKeys("18/08/1975");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'Marital status')])[1]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Single ')]")).click();
		Thread.sleep(3000);
		
		//Professional Information
		driver.findElement(By.xpath("//*[contains(text(),'Professional ')]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-success btn-h-40 ng-star-inserted\"]")).click();
		driver.findElement(By.xpath("//*[contains(text(),' Add experience ')]")).click();
		driver.findElement(By.xpath("//*[@id=\"Company\"]")).sendKeys("Cognizant");
		driver.findElement(By.xpath("//*[@id=\"Designation\"]")).sendKeys("Analyst");
		driver.findElement(By.xpath("//*[@id=\"From\"]")).sendKeys("24/02/2021");
		driver.findElement(By.xpath("//*[@id=\"To\"]")).sendKeys("02/12/2022");
		driver.findElement(By.xpath("//*[@id=\"NumberOfMonths\"]")).sendKeys("22");
		driver.findElement(By.xpath("//*[@id=\"JobDescription\"]")).sendKeys("NA");
		Thread.sleep(2000);
		
		//Education Information
		
		driver.findElement(By.xpath("//*[contains(text(),' Add education ')]")).click();
		driver.findElement(By.xpath("(//*[contains(text(),'Qualification')])[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),' B.E')]")).click();
		driver.findElement(By.xpath("(//*[contains(text(),'Specialization')])[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),' CSE')]")).click();
		driver.findElement(By.xpath("(//*[contains(text(),'Qualification Type')])[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),' Full Time')]")).click();
		driver.findElement(By.xpath("//*[@id=\"YearOfPassing\"]")).sendKeys("2020");
		driver.findElement(By.xpath("//*[@id=\"BoardUniversityName\"]")).sendKeys("VTU");
		driver.findElement(By.xpath("//*[@id=\"NameofInstitute\"]")).sendKeys("KNS");
		driver.findElement(By.xpath("//*[@id=\"Grade\"]")).sendKeys("6.9");
		driver.findElement(By.xpath("//*[contains(text(),' Logout ')]")).click();
		
		 
	 }
	 @AfterMethod
	 public void logout() 
	 {
		 
	 }
}
