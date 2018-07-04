package pages;

import org.openqa.selenium.By;

import com.liferay.gs.testFramework.SeleniumReadPropertyKeys;

import utils.CommonMethods;

public class FormsPage {
	CommonMethods commonMethods = new CommonMethods();

	private final By nameLocator = By.xpath(
			".//*[contains(@id, '_com_liferay_dynamic_data_mapping_form_web_portlet_') and contains(@id, 'Nome')]");
	private final By dateLocator = By.xpath(
			".//*[contains(@name, '_com_liferay_dynamic_data_mapping_form_web_portlet') and contains(@name, 'Data')]");
	private final By motivationLocator = By.xpath(
			".//*[contains(@id, '_com_liferay_dynamic_data_mapping_form_web_portlet') and contains(@id, 'Porque')]");

	private final By submitLocator = By.xpath(".//*[@type='submit']");

	private final By requiredLocator = By.xpath(".//*[contains(@class, 'help-block')]");
	private final By successMessage = By.xpath(".//h5[contains(text(), 'sucesso')]");

	// private final By partyRockLocator =
	// By.xpath(".//*[@id='BHXdFdkm']/div[1]/div/div/h4");

	public void clickOnSubmitButton() {
		commonMethods.waitElement(submitLocator);
		SeleniumReadPropertyKeys.DRIVER.findElement(submitLocator).click();
	}

	public void fillNameFormsLocator(String nameForms) {
		commonMethods.input(nameLocator, nameForms);
	}

	public void fillDateFormsLocator(String dateForms) {
		commonMethods.input(dateLocator, dateForms);
	}

	public void fillMotivationFormsLocator(String motivationForms) {
		commonMethods.input(motivationLocator, motivationForms);
	}

	public boolean isDisplayedTheSucessMessageOnForms() {
		commonMethods.waitElement(successMessage);
		Boolean successMesageFromFormsAppear = SeleniumReadPropertyKeys.DRIVER.findElement(successMessage)
				.isDisplayed();
		return successMesageFromFormsAppear;
	}

	public boolean isDisplayedTheRequiredMessageOnForms() {
		commonMethods.waitElement(requiredLocator);
		Boolean successMesageFromFormsAppear = SeleniumReadPropertyKeys.DRIVER.findElement(requiredLocator)
				.isDisplayed();
		return successMesageFromFormsAppear;
	}

}
