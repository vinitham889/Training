package basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoSuggestion {
	public static WebDriver driver;
	public static void main(String args[])
	{

	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	options.addArguments("--disable-notifications");
	driver = new ChromeDriver(options);
	driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.name("q")).sendKeys("Java");
	List<WebElement> listItem=driver.findElements(By.xpath("//li[@class=\"sbct\"]//div[@role=\"option\"]//div[1]/span"));
	System.out.println("Size of Auto suggestion"+listItem.size());
	for(WebElement item :listItem)
	{
		if(item.getText().contains("tpoint"))
		{
			item.click();
			break;
		}
	}
}
}
