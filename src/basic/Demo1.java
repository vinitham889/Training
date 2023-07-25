package basic;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {
	public static WebDriver driver;
	@BeforeMethod
	public static void Launch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	}
	@Test
	public void radioButton() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@value=\"radio1\"]")).click();
		Thread.sleep(3000);
		
	}
	@Test(priority=1)
	public void checkBox()
	{
		//Selecting all check box
	    List<WebElement> chk =driver.findElements(By.xpath("//*[@type='checkbox' and contains(@id,'checkBoxOption') ]"));
	    for(int i=0;i<chk.size();i++)
		{
	    	chk.get(i).click();
			
		}
	    for(WebElement chbox :chk)
	    {
	    	chbox.click();
	    }
	    
	}
	@Test(priority=2)
	public void autoSuggestion() throws InterruptedException 
	{
		WebElement auto=driver.findElement(By.xpath("//input[@placeholder=\"Type to Select Countries\"]"));
		//List<WebElement> auto=driver.findElements(By.xpath("//li[@class=\"ui-menu-item\"]/div"));
		auto.sendKeys("canada");
		Thread.sleep(2000);
		auto.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		auto.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//*[contains(text(),'Canada')])[2]")).click();
		/*for(WebElement listItem:auto)
		{
			if(listItem.getText().equals("canada"))
			{
				listItem.click();
				break;
			}
			Thread.sleep(2000);
			
		}*/
		
	}
	@Test(priority=3)
	public void dropDown()
	{
		WebElement options=driver.findElement(By.xpath("//select[@id=\"dropdown-class-example\"]"));
		Select sel = new Select(options);
		sel.selectByVisibleText("Option2");
		
	}
	@Test(priority=4)
	public void switchWindow() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"opentab\"]")).click();
		Set<String>handles = driver.getWindowHandles();
		Iterator it = handles.iterator();
		String parentid = (String) it.next();
		String childid = (String) it.next();
		driver.switchTo().window(childid);
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div/div[2]/div[2]/a")).click();
		driver.close();
		driver.switchTo().window(parentid);
	}
	@Test(priority=5)
	public void verticalscroll() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//using scrollby
		/*String scrolldown = "window.scrollBy(0,1500)";
		js.executeScript(scrolldown);
		Thread.sleep(1000);
		String scrollup = "window.scrollBy(0,-1500)";
		js.executeScript(scrollup);
		Thread.sleep(1000);*/
		//using scrollTo
		// Scroll down the window
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		// Scroll up the window
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(1000);
		

	}
	@Test(priority=6)
	public void alertPopUp() throws InterruptedException
	{
		WebElement alt=driver.findElement(By.xpath("//*[@id=\"name\"]"));
		alt.sendKeys("Vinitha");
		Thread.sleep(1000);
		alt.clear();
		driver.findElement(By.xpath("//*[@id=\"alertbtn\"]")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"confirmbtn\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}
	@Test(priority=7)
	public void screenShot() throws InterruptedException, IOException
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		String scrolldown = "window.scrollBy(0,1500)";
		js.executeScript(scrolldown);
		Thread.sleep(1000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File(".//screenshot/image1.png");
		FileUtils.copyFile(src,dst);
		Thread.sleep(2000);
	   }
	@Test(priority=8)
	public void scrollingWebTable() throws InterruptedException
	{
		WebElement xpath = driver.findElement(By.xpath("//*[text()='Web Table Example']"));
		Point loc = xpath.getLocation();
		int y = loc.getY();
		Thread.sleep(1000);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		//scroll down to specific element on webpage 
		String scrolldown = "window.scrollBy(0,'"+y+"')";
		js.executeScript(scrolldown);
		Thread.sleep(1000);
		EventFiringWebDriver scroll = new EventFiringWebDriver(driver);
		scroll.executeScript("document.querySelector('div.tableFixHead').scrollTop=500");
		Thread.sleep(1000);
	}
	@Test(priority=9)
	public void rightClick() throws InterruptedException
	{
		WebElement link = driver.findElement(By.xpath("//*[@id=\"opentab\"]"));
		Actions act = new Actions(driver);
		act.contextClick(link)
		.moveToElement(link)
		.sendKeys(Keys.ARROW_DOWN)
	    .sendKeys(Keys.ENTER)
		.build().perform();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//scroll right 
		String scrollrght = "window.scrollBy(500,0)";
		js.executeScript(scrollrght);
		String scrollLeft = "window.scrollBy(-500,0)";
		js.executeScript(scrollLeft);

	}
	@Test(priority=10)
	public void mouseHover() throws InterruptedException
	{
		WebElement btn= driver.findElement(By.cssSelector("button#mousehover"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Point loc = btn.getLocation();
		int y = loc.getY();
		Thread.sleep(1000);
		String mouseElement = "window.scrollBy(0,'"+y+"')";
		js.executeScript(mouseElement);
		Actions act = new Actions(driver);
		act.moveToElement(btn).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.='Top']")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		
	}
	@Test(priority=11)
	public void display() throws InterruptedException 
	{
		WebElement hidebtn =driver.findElement(By.cssSelector("input#hide-textbox"));
		WebElement showbtn =driver.findElement(By.cssSelector("input[value ='Show']"));
		WebElement input = driver.findElement(By.cssSelector("input[placeholder='Hide/Show Example']"));
		if(input.isDisplayed())
		{
			input.sendKeys("Hello");
			Thread.sleep(1000);
		}
		else
		{
			showbtn.click();
			Thread.sleep(1000);
		}
		hidebtn.click();

	}
	@Test(priority=12)
	public void iframe() throws InterruptedException
	{
		WebElement frameLink =driver.findElement(By.cssSelector("iframe#courses-iframe"));
		WebElement exp = driver.findElement(By.xpath("//*[text()='iFrame Example']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Point loc = exp.getLocation();
		int y = loc.getY();
		Thread.sleep(1000);
		String scroll = "window.scrollBy(0,'"+y+"')";
		js.executeScript(scroll);
        driver.switchTo().frame(frameLink);
        Thread.sleep(1000);
       driver.findElement(By.xpath("//*[@class=\"theme-btn register-btn\"]")).click();
		Thread.sleep(1000);
		
		
		
	}
	@AfterMethod
	
	public void close()
	{
		driver.close();
	}

}
