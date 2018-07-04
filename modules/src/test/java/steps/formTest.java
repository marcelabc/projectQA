package steps;

import static org.junit.Assert.assertTrue;

import com.liferay.gs.testFramework.SeleniumReadPropertyKeys;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.FormsPage;
import utils.CommonMethods;

public class formTest {
	
	CommonMethods commonMethods = new CommonMethods();
	FormsPage formsPage = new FormsPage();
	
	@Given("^I want to fill a form with my (-?[^\"]*) and (-?[^\"]*) and (-?[^\"]*)$")
	public void i_want_to_fill_a_forms_with_my_name_and_date_and_motivation(String name, String date, String motivation) {
		SeleniumReadPropertyKeys.DRIVER.get("https://forms.liferay.com/web/forms/shared/-/form/372406");

		formsPage.fillNameFormsLocator(name);
		formsPage.fillDateFormsLocator(date);
		formsPage.fillMotivationFormsLocator(motivation);
		
		formsPage.clickOnSubmitButton();
	}

	@Then("^I verify the success message appear on Forms$")
	public void i_verify_the_success_message_appear_on_forms() {
		assertTrue(formsPage.isDisplayedTheSucessMessageOnForms());
	}
}
