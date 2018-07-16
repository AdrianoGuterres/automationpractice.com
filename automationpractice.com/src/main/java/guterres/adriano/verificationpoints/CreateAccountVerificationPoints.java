package guterres.adriano.verificationpoints;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;

import guterres.adriano.appobjects.CreateAccountAppObject;
import guterres.adriano.ressources.Report;
import guterres.adriano.ressources.ScreenShot;

public class CreateAccountVerificationPoints { 

	private final Boolean    PERSONAL_INFORMATION_TITLE           = true; 

	private final String     PERSONAL_INFORMATION_FIRST_NAME      = "José"; 

	private final String     PERSONAL_INFORMATION_LAST_NAME       = "Silva"; 
	
	private final String     PERSONAL_INFORMATION_PASSWORD        = "999888";  

	private final String     PERSONAL_INFORMATION_DAY_BIRTHDAY    = "10"; 

	private final String     PERSONAL_INFORMATION_MONTH_BIRTHDAY  = "March"; 

	private final String     PERSONAL_INFORMATION_YEAR_BIRTHDAY   = "1993"; 

	private final boolean    PERSONAL_INFORMATION_NEWSLETTERS     = true; 

	private final boolean    PERSONAL_INFORMATION_OFFERS_PARTNERS = true; 


	private final String     ADDRESS_FIRST_NAME             = "José"; 

	private final String     ADDRESS_LAST_NAME              = "Silva"; 

	private final String     ADDRESS_COMPANY                = "JoseSilvaLTDA";

	private final String     ADDRESS_ADDRESS                = "Nonsense Street";

	private final String     ADDRESS_ADDRESS_LINE2          = "building";

	private final String     ADDRESS_CITY                   = "Iowa City";

	private final String     ADDRESS_STATE                  = "Iowa";

	private final String     ADDRESS_POSTAL_CODE            = "55555";

	private final String     ADDRESS_COUNTRY                = "United States";

	private final String     ADDRESS_ADDITIONAL_INFORMATION = "Slipknot's city.";

	private final String     ADDRESS_HOME_PHONE             = "319-5555-5555";

	private final String     ADDRESS_MOBILE_PHONE           = "319-9999-5555";

	private final String     ADDRESS_ALIAS_REFERENCE        = "Mi casa";
	
	

	private CreateAccountAppObject formAppObject;

	private WebDriver driver;

	public CreateAccountVerificationPoints(WebDriver driver) {
		this.driver = driver;
		this.formAppObject = new CreateAccountAppObject(this.driver); 
		
	}

	public boolean verifyCustomerTitle() {
		boolean aux = false;

		WebElement element = formAppObject.getCustomerTitleMrRadioButton();

		if(element.isSelected() == this.PERSONAL_INFORMATION_TITLE) {			
			Report.log(Status.PASS, "The 'Mr' radioBox was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;
		}else {
			Report.log(Status.FAIL, "The 'Mr' radioBox wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}

		return aux;
	}

	public boolean verifyCustomerFirstlName() {
		boolean aux = false;

		WebElement element = formAppObject.getCustomerFirstNameTextField();
		
		if(element.getAttribute("value").equalsIgnoreCase(this.PERSONAL_INFORMATION_FIRST_NAME)) {			
			Report.log(Status.PASS, "The 'First name' field was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;
		}else {
			Report.log(Status.FAIL, "The 'First name' field wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}

		return aux;
	}

	public boolean verifyCustomerLastName() {
		boolean aux = false;

		WebElement element = this.formAppObject.getCustomerLastNameTextField();

		if(element.getAttribute("value").equalsIgnoreCase(this.PERSONAL_INFORMATION_LAST_NAME)) {			
			Report.log(Status.PASS, "The 'Last name' field was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;
		}else {
			Report.log(Status.FAIL, "The 'Last name' field wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}

		return aux;
	}
	
	
	public boolean verifyCustomerEmail() {
		boolean aux = false;

		WebElement element = this.formAppObject.getCustomerEmailTextField();

		if(element.getAttribute("value")!= null) {			
			Report.log(Status.PASS, "The 'Email' field was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;
		}else {
			Report.log(Status.FAIL, "The 'Email' field wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}

		return aux;
	}
	
	public boolean verifyCustomerPassword() {
		boolean aux = false;

		WebElement element = this.formAppObject.getCustomerPasswordTextField();

		if(element.getAttribute("value").equalsIgnoreCase(this.PERSONAL_INFORMATION_PASSWORD)) {			
			Report.log(Status.PASS, "The 'Password' field was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;
		}else {
			Report.log(Status.FAIL, "The 'Password' field wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}

		return aux;
	}

	public boolean verifyCustomerDayBirthday() {
		boolean aux = false;

		WebElement element = this.formAppObject.getCustomerDayDateBirthComboBox();

		if(element.getAttribute("value").equalsIgnoreCase(this.PERSONAL_INFORMATION_DAY_BIRTHDAY)) {			
			Report.log(Status.PASS, "The day of 'Date of Birthday' combobox was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;
		}else {
			Report.log(Status.FAIL, "The day of 'Date of Birthday' combobox wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}
		return aux;
	}

	public boolean verifyCustomerMonthBirthday() {
		boolean aux = false;

		WebElement element = this.formAppObject.getCustomerMonthDateBirthComboBox();
		
		Select select = new Select(element);	

		if(select.getFirstSelectedOption().getText().trim().equalsIgnoreCase(this.PERSONAL_INFORMATION_MONTH_BIRTHDAY)) {			
			Report.log(Status.PASS, "The month of 'Date of Birthday' combobox was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;
		}else {
			Report.log(Status.FAIL, "The month of 'Date of Birthday' combobox wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}
		return aux;
	}

	public boolean verifyCustomerYearBirthday() {
		boolean aux = false;

		WebElement element = this.formAppObject.getCustomerYearMonthDateBirthComboBox();

		if(element.getAttribute("value").equalsIgnoreCase(this.PERSONAL_INFORMATION_YEAR_BIRTHDAY)) {			
			Report.log(Status.PASS, "The year of 'Date of Birthday' combobox was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;
		}else {
			Report.log(Status.FAIL, "The year of 'Date of Birthday' combobox wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}
		return aux;
	}

	public boolean verifyCustomerNewsletter() {
		boolean aux = false;

		WebElement element = this.formAppObject.getCustomerSignNewsletterCheckBox();

		if(element.isSelected() == this.PERSONAL_INFORMATION_NEWSLETTERS) {			
			Report.log(Status.PASS, "The 'Sign up our newsletter!' checkbox was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;
		}else {
			Report.log(Status.FAIL, "The 'Sign up our newsletter!' checkbox wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}
		return aux;
	}

	public boolean verifyCustomerOffers() {
		boolean aux = false;

		WebElement element = this.formAppObject.getCustomerReceiveOffersCheckBox();

		if(element.isSelected() == this.PERSONAL_INFORMATION_OFFERS_PARTNERS) {			
			Report.log(Status.PASS, "The 'Receive specieal offers from our partners!' checkbox was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;
		}else {
			Report.log(Status.FAIL, "The 'Receive specieal offers from our partners!' checkbox wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}
		return aux;
	}




	public boolean verifyAddressFirstName() {
		boolean aux = false;

		WebElement element = this.formAppObject.getAddressFirstNameTextField();

		if(element.getAttribute("value").equalsIgnoreCase(this.ADDRESS_FIRST_NAME)) {			
			Report.log(Status.PASS, "The 'First name' field was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;
		}else {
			Report.log(Status.FAIL, "The 'First name' field  wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}
		return aux;
	}

	public boolean verifyAddressLastName() {
		boolean aux = false;

		WebElement element = this.formAppObject.getAddressLastNameTextField();

		if(element.getAttribute("value").equalsIgnoreCase(this.ADDRESS_LAST_NAME)) {			
			Report.log(Status.PASS, "The 'Last name' field was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;
		}else {
			Report.log(Status.FAIL, "The 'Last name' field  wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}
		return aux;
	}

	public boolean verifyAddressCompany() {
		boolean aux = false;

		WebElement element = this.formAppObject.getAddressCompanyTextField();

		if(element.getAttribute("value").equalsIgnoreCase(this.ADDRESS_COMPANY)) {			
			Report.log(Status.PASS, "The 'Company' field was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;
		}else {
			Report.log(Status.FAIL, "The 'Company' field  wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}
		return aux;
	}

	public boolean verifyAddressAddress() {
		boolean aux = false;

		WebElement element = this.formAppObject.getAddressAddressLine1TextField();

		if(element.getAttribute("value").equalsIgnoreCase(this.ADDRESS_ADDRESS)) {			
			Report.log(Status.PASS, "The 'Address' field was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;
		}else {
			Report.log(Status.FAIL, "The 'Address' field  wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}
		return aux;
	}

	public boolean verifyAddressAddressLine2() {
		boolean aux = false;

		WebElement element = this.formAppObject.getAddressAddressLine2TextField();

		if(element.getAttribute("value").equalsIgnoreCase(this.ADDRESS_ADDRESS_LINE2)) {			
			Report.log(Status.PASS, "The 'Address (Line 2)' field was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;
		}else {
			Report.log(Status.FAIL, "The 'Address (Line 2)' field  wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}
		return aux;
	}

	public boolean verifyAddressCity() {
		boolean aux = false;

		WebElement element = this.formAppObject.getAddressCityTextField();
		
		if(element.getAttribute("value").equalsIgnoreCase(this.ADDRESS_CITY)) {			
			Report.log(Status.PASS, "The 'City' field was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;
		}else {
			Report.log(Status.FAIL, "The 'City' field  wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}
		return aux;
	}


	public boolean verifyAddressState() {
		boolean aux = false;

		WebElement element = this.formAppObject.getAddressStateComboBox();

		Select select = new Select(element);		

		if(select.getFirstSelectedOption().getText().equalsIgnoreCase(this.ADDRESS_STATE)) {			
			Report.log(Status.PASS, "The 'State' combobox was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;
		}else {
			Report.log(Status.FAIL, "The 'State' combobox wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}
		return aux;
	}

	public boolean verifyAddressPostalCode() {
		boolean aux = false;

		WebElement element = this.formAppObject.getAddressPostalCodeTextField();

		if(element.getAttribute("value").equalsIgnoreCase(this.ADDRESS_POSTAL_CODE)) {			
			Report.log(Status.PASS, "The 'Zip/Postal Code' field was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;
		}else {
			Report.log(Status.FAIL, "The 'Zip/Postal Code' field wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}
		return aux;
	}

	public boolean verifyAddressCountry(){
		boolean aux = false;

		WebElement element = this.formAppObject.getAddressCountryComboBox();	
		
		Select select = new Select(element);

		if(select.getFirstSelectedOption().getText().equalsIgnoreCase(this.ADDRESS_COUNTRY)) {			
			Report.log(Status.PASS, "The 'Country' combobox was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;
		}else {
			Report.log(Status.FAIL, "The 'Country' combobox wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}
		return aux;
	}


	public boolean verifyAddressAdditionalInformation(){
		boolean aux = false;

		WebElement element = this.formAppObject.getAddressAdditionalInfoTextArea();

		if(element.getAttribute("value").equalsIgnoreCase(this.ADDRESS_ADDITIONAL_INFORMATION)) {			
			Report.log(Status.PASS, "The 'Additional Information' textArea was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;
		}else {
			Report.log(Status.FAIL, "The 'Additional Information' textArea wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}
		return aux;
	}

	public boolean verifyAddressHomePhone(){
		boolean aux = false;

		WebElement element = this.formAppObject.getAddressHomePhoneTextField();

		if(element.getAttribute("value").equalsIgnoreCase(this.ADDRESS_HOME_PHONE)) {			
			Report.log(Status.PASS, "The 'Home phone' field was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;
		}else {
			Report.log(Status.FAIL, "The 'Home phone' field wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}
		return aux;
	}

	public boolean verifyAddressMobilePhone(){
		boolean aux = false;		

		WebElement element = this.formAppObject.getAddressMobilePhoneTextField();

		if(element.getAttribute("value").equalsIgnoreCase(this.ADDRESS_MOBILE_PHONE)) {			
			Report.log(Status.PASS, "The 'Mobile phone' field was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;
		}else {
			Report.log(Status.FAIL, "The 'Mobile phone' field wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}
		return aux;
	}
	
	public boolean verifyAddressAliasAddress(){
		boolean aux = false;

		WebElement element = formAppObject.getAddressAliasReferenceTextField();

		if(element.getAttribute("value").equalsIgnoreCase(this.ADDRESS_ALIAS_REFERENCE)) {			
			Report.log(Status.PASS, "The 'Home phone' field was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;
		}else {
			Report.log(Status.FAIL, "The 'Home phone' field wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}
		return aux;
	}

}
