package guterres.adriano.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccountAppObject {

	private WebDriver driver;

	public CreateAccountAppObject(WebDriver driver) {
		this.driver = driver;		
	}	

	public WebElement getCustomerTitleMrRadioButton() {
		WebElement element = new WebDriverWait(this.driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("id_gender1")));
		return element;		
	}

	public WebElement getCustomerTitleMrsRadioButton() {
		WebElement element = new WebDriverWait(this.driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("id_gender2")));
		return element;			
	}

	public WebElement getCustomerFirstNameTextField() {
		return this.driver.findElement(By.id("customer_firstname"));		
	}

	public WebElement getCustomerLastNameTextField() {
		return this.driver.findElement(By.id("customer_lastname"));		
	}

	public WebElement getCustomerEmailTextField() {
		return this.driver.findElement(By.id("email"));		
	}

	public WebElement getCustomerPasswordTextField() {
		return this.driver.findElement(By.id("passwd"));		
	}

	public WebElement getCustomerDayDateBirthComboBox() {
		return this.driver.findElement(By.id("days"));		
	}

	public WebElement getCustomerMonthDateBirthComboBox() {
		return this.driver.findElement(By.id("months"));		
	}

	public WebElement getCustomerYearMonthDateBirthComboBox() {
		return this.driver.findElement(By.id("years"));		
	}

	public WebElement getCustomerSignNewsletterCheckBox() {
		return this.driver.findElement(By.id("newsletter"));		
	}

	public WebElement getCustomerReceiveOffersCheckBox() {
		return this.driver.findElement(By.id("optin"));		
	}



	public WebElement getAddressFirstNameTextField() {
		return this.driver.findElement(By.id("firstname"));		
	}	

	public WebElement getAddressLastNameTextField() {
		return this.driver.findElement(By.id("lastname"));		
	}

	public WebElement getAddressCompanyTextField() {
		return this.driver.findElement(By.id("company"));		
	}

	public WebElement getAddressAddressLine1TextField() {
		return this.driver.findElement(By.id("address1"));		
	}

	public WebElement getAddressAddressLine2TextField() {
		return this.driver.findElement(By.id("address2"));		
	}

	public WebElement getAddressCityTextField() {
		return this.driver.findElement(By.id("city"));		
	}

	public WebElement getAddressStateComboBox() {
		return this.driver.findElement(By.id("id_state"));		
	}

	public WebElement getAddressPostalCodeTextField() {
		return this.driver.findElement(By.id("postcode"));		
	}

	public WebElement getAddressCountryComboBox() {
		return this.driver.findElement(By.id("id_country"));		
	}

	public WebElement getAddressAdditionalInfoTextArea() {
		return this.driver.findElement(By.id("other"));		
	}

	public WebElement getAddressHomePhoneTextField() {
		return this.driver.findElement(By.id("phone"));		
	}

	public WebElement getAddressMobilePhoneTextField() {
		return this.driver.findElement(By.id("phone_mobile"));		
	}

	public WebElement getAddressAliasReferenceTextField() {
		return this.driver.findElement(By.id("alias"));		
	}

	public WebElement getAddressRegisterButton() {
		return this.driver.findElement(By.id("submitAccount"));		
	}
}
