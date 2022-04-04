package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SaleforcePage;

public class SaleforceSteps extends BaseStep {

	WebDriver driver = GetDriver();
	SaleforcePage tp = PageFactory.initElements(driver, SaleforcePage.class);
	
	
	@When("^click on Component reference$")
	public void click_on_Component_reference() {
		tp.Click_on_Component();
	}
	
	@Then("^enter datatable in Quick find$")
	public void Enter_DataTable() throws Throwable {
		tp.Enter_Data_Table_Enter();

	}

	@Then("^Under Lightning Web Components click on Datatable$")
	public void Click_On_Datatable() throws Throwable {
		tp.Click_On_Datatable_Lightning_Web();

	}
	
	@Then("^Select Datatable from Inline Edit$")
	public void click_on_Datatable_from_Inline_Edit() throws Throwable {
	    tp.Click_Datatable_from_Inline_Edit();
	}

	@Then("^Click on Run$")
	public void Click_Run() throws Throwable {
	    tp.Click_Run();
	}
}
