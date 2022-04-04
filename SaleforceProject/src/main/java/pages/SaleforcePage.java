package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SaleforcePage {
	
	WebDriver driver;
	
	public SaleforcePage(WebDriver driver) {
		this.driver = driver;
	}
	

	@FindBy(how = How.XPATH, using = "//span[@title='Component Reference']")WebElement Component_Referece;
	@FindBy(how = How.XPATH, using = "//input[@name='Quick Find'")WebElement Quick_Find;
	@FindBy(how = How.XPATH, using = "/div/span/a/span[@title='datatable'][1]")WebElement Datatable;
	@FindBy(how = How.XPATH, using = "//button[@name='example']")WebElement Example;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Run')]")WebElement Run;
	
	

	public void Click_on_Component() {
		// TODO Auto-generated method stub
		 WebElement cmp = Component_Referece;
         Actions action = new Actions(driver);
         action.moveToElement(cmp).click().build().perform();
	}

	public void Enter_Data_Table_Enter() {
		// TODO Auto-generated method stub
		Quick_Find.sendKeys("datatable" + "\n");
		
	}

	public void Click_On_Datatable_Lightning_Web() {
		// TODO Auto-generated method stub
		Datatable.click();
	}

	public void Click_Datatable_from_Inline_Edit() {
		// TODO Auto-generated method stub
		Example.click();
        List<WebElement> list = (List<WebElement>) Example;
        WebElement element = Example;     
        element.click();
        element.sendKeys("Data Table with Inline Edit");
        element.sendKeys(Keys.ENTER);
	}

	public void Click_Run() {
		// TODO Auto-generated method stub
		Run.click();
	}

}
