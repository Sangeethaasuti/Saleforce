package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.BasePage;
import util.BrowserFactory;

public class BaseStep extends BasePage{
	protected static WebDriver driver;

	protected WebDriver GetDriver() {
		if (driver == null) {
			
			   driver.get("https://developer.salesforce.com/docs/component-library/overview/components");        
	           driver.manage().window().maximize();   
	           WaitForElement(driver,driver.findElement(By.xpath("//span[@title='Component Reference']")));
	           driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		}
		return driver;
	}
}