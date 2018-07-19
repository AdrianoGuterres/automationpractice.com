package guterres.adriano.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import guterres.adriano.ressources.NavigationTools;

public class CreateAccountAppObject {

	private WebDriver driver;

	public CreateAccountAppObject(WebDriver driver) {
		this.driver = driver;		
	}	

	public WebElement getCustomerTitleMrRadioButton() {
	//	WebElement element = new WebDriverWait(this.driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("id_gender1")));
		
		WebElement element = NavigationTools.waitForClickability(this.driver, (By.id("id_gender1")));
		return element;	
	}

	public WebElement getCustomerTitleMrsRadioButton() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.xpath("//*[@id=\"center_column\"]/form/div/h3"));
		return element;	
	}

	public WebElement getCustomerFirstNameTextField() {
		
		WebElement element = NavigationTools.waitForClickability(this.driver, By.id("customer_firstname"));
		return element;	
	}

	public WebElement getCustomerLastNameTextField() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.id("customer_lastname"));
		return element;	
	}

	public WebElement getCustomerEmailTextField() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.id("email"));
		return element;	
	}

	public WebElement getCustomerPasswordTextField() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.id("passwd"));
		return element;	
	}

	public WebElement getCustomerDayDateBirthComboBox() {
		WebElement element = this.driver.findElement(By.id("days"));		
		return element;	
	}

	public WebElement getCustomerMonthDateBirthComboBox() {
		WebElement element = this.driver.findElement(By.id("months"));	
		return element;	
	}

	public WebElement getCustomerYearMonthDateBirthComboBox() {
		WebElement element =this.driver.findElement(By.id("years"));		
		return element;	
	}

	public WebElement getCustomerSignNewsletterCheckBox() {
		WebElement element = this.driver.findElement(By.id("newsletter"));	
		return element;	
	}

	public WebElement getCustomerReceiveOffersCheckBox() {
		WebElement element = this.driver.findElement(By.id("optin"));		
		return element;	
	}


	public WebElement getAddressFirstNameTextField() {	
		WebElement element = NavigationTools.waitForClickability(this.driver,By.id("firstname"));
		return element;	
	}	

	public WebElement getAddressLastNameTextField() {		
		WebElement element = NavigationTools.waitForClickability(this.driver, By.id("lastname"));
		return element;	
	}

	public WebElement getAddressCompanyTextField() {	
		WebElement element = NavigationTools.waitForClickability(this.driver, By.id("company"));
		return element;	
	}

	public WebElement getAddressAddressLine1TextField() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.id("address1"));
		return element;	
	}

	public WebElement getAddressAddressLine2TextField() {
		WebElement element = NavigationTools.waitForClickability(this.driver,By.id("address2"));
		return element;	
	}

	public WebElement getAddressCityTextField() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.id("city"));
		return element;	
	}

	public WebElement getAddressStateComboBox() {
		WebElement element = this.driver.findElement(By.id("id_state"));		
		return element;	
	}

	public WebElement getAddressPostalCodeTextField() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.id("postcode"));
		return element;	
	}

	public WebElement getAddressCountryComboBox() {
		WebElement element = this.driver.findElement(By.id("id_country"));	
		return element;	
	}

	public WebElement getAddressAdditionalInfoTextArea() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.id("other"));
		return element;	
	}

	public WebElement getAddressHomePhoneTextField() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.id("phone"));
		return element;	
	}

	public WebElement getAddressMobilePhoneTextField() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.id("phone_mobile"));
		return element;	
	}

	public WebElement getAddressAliasReferenceTextField() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.id("alias"));
		return element;	
	}

	public WebElement getAddressRegisterButton() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.id("submitAccount"));
		return element;	
	}
}
