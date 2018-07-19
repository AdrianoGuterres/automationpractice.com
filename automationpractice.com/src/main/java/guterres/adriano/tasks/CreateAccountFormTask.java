package guterres.adriano.tasks;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import guterres.adriano.appobjects.CreateAccountAppObject;
import guterres.adriano.ressources.NavigationTools;

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
		
		
		WebElement dayBox = this.form.getCustomerDayDateBirthComboBox();			
		int dayInteger = Integer.parseInt(dayBirthday);		
		for(int i = 0; i<dayInteger; i++) {
			dayBox.sendKeys(Keys.ARROW_DOWN);		
		}		
		dayBox.sendKeys(Keys.ENTER);
		
		
		WebElement monthBox = this.form.getCustomerMonthDateBirthComboBox();				
		monthBox.sendKeys(monthBirthday);		
		
		
		WebElement yearBox = this.form.getCustomerYearMonthDateBirthComboBox();		
		int yearInteger =( Integer.parseInt(yearBirthday)-2018) *-1;		

		for(int i = 0; i<=yearInteger; i++) {
			yearBox.sendKeys(Keys.ARROW_DOWN);		
			yearBox.sendKeys(Keys.ENTER);
		}		
		yearBox.sendKeys(Keys.ENTER);
		
		
		
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
		
		WebElement countryBox = this.form.getAddressCountryComboBox();
		Select selectCountry = new Select(countryBox);		
		selectCountry.selectByVisibleText(country);
		
		WebElement stateBox = this.form.getAddressStateComboBox();
		Select selectState = new Select(stateBox);		
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
