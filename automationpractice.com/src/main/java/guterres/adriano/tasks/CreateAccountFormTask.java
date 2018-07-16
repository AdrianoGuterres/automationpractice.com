package guterres.adriano.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import guterres.adriano.appobjects.CreateAccountAppObject;

public class CreateAccountFormTask {
	private CreateAccountAppObject form;
	private WebDriver driver;
	

	public CreateAccountFormTask(WebDriver driver) {
		this.driver = driver;
		this.form = new CreateAccountAppObject(this.driver);		
	}

	public void fillFormYourPersonalInformation(boolean title, String firstName, String lastName, String password, String dayBirthday, String monthBirthday, String yearBirthday, boolean newsletter, boolean offers) {
		
		if(title) {
			this.form.getCustomerTitleMrRadioButton().click();			
		}else {
			this.form.getCustomerTitleMrsRadioButton().click(); 
		}
		
		this.form.getCustomerFirstNameTextField().sendKeys(firstName);		
		this.form.getCustomerLastNameTextField().sendKeys(lastName);
		this.form.getCustomerPasswordTextField().sendKeys(password);				
		this.form.getCustomerDayDateBirthComboBox().sendKeys(dayBirthday);		
		this.form.getCustomerMonthDateBirthComboBox().sendKeys(monthBirthday);		
		this.form.getCustomerYearMonthDateBirthComboBox().sendKeys(yearBirthday);
		
		if(newsletter) {
			this.form.getCustomerSignNewsletterCheckBox().click();			
		}
		
		if(offers) {
			this.form.getCustomerReceiveOffersCheckBox().click();
		}

	}

	public void fillFormYourAddress(String company, String addressLine1, String addressLine2, String city, String state, String postalCode, String country, String additionalInfo, String homePhone, String mobilePhone, String aliasAddress) {

		this.form.getAddressCompanyTextField().sendKeys(company);
		this.form.getAddressAddressLine1TextField().sendKeys(addressLine1);
		this.form.getAddressAddressLine2TextField().sendKeys(addressLine2);
		this.form.getAddressCityTextField().sendKeys(city);		
		this.form.getAddressPostalCodeTextField().sendKeys(postalCode);
		
		Select selectCountry = new Select(this.form.getAddressCountryComboBox());		
		selectCountry.selectByVisibleText(country);
		
		Select selectState = new Select(this.form.getAddressStateComboBox());		
		selectState.selectByVisibleText(state);
		
		this.form.getAddressAdditionalInfoTextArea().sendKeys(additionalInfo);
		this.form.getAddressHomePhoneTextField().sendKeys(homePhone);
		this.form.getAddressMobilePhoneTextField().sendKeys(mobilePhone);
		this.form.getAddressAliasReferenceTextField().clear();	
		this.form.getAddressAliasReferenceTextField().sendKeys(aliasAddress);		
		
	}

	public void clickRegisterButton() {
		this.form.getAddressRegisterButton().click();
	}
}
