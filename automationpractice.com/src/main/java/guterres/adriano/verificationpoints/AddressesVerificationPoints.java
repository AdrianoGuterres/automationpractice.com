package guterres.adriano.verificationpoints;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

import guterres.adriano.appobjects.AddressesAppObject;
import guterres.adriano.ressources.NavigationTools;
import guterres.adriano.ressources.Report;
import guterres.adriano.ressources.ScreenShot;

public class AddressesVerificationPoints {

	private WebDriver driver;

	private AddressesAppObject confirmInformationsAppObject;


	private final String DELIVERY_ADDRESS_COMPLETE_NAME = "José Silva";

	private final String DELIVERY_ADDRESS_COMPANY       = "JoseSilvaLTDA";

	private final String DELIVERY_ADDRESS_STREET        = "Nonsense Street building";

	private final String DELIVERY_ADDRESS_STATE         = "Iowa City, Iowa 55555";
 
	private final String DELIVERY_ADDRESS_COUNTRY       = "United States";

	private final String DELIVERY_ADDRESS_HOME_PHONE    = "319-5555-5555";

	private final String DELIVERY_ADDRESS_MOBILE_PHONE  = "319-9999-5555";


	private final String BILLING_ADDRESS_COMPLETE_NAME  = "José Silva";

	private final String BILLING_ADDRESS_COMPANY        = "JoseSilvaLTDA";

	private final String BILLING_ADDRESS_STREET         = "Nonsense Street building";

	private final String BILLING_ADDRESS_STATE          = "Iowa City, Iowa 55555";

	private final String BILLING_ADDRESS_COUNTRY        = "United States";

	private final String BILLING_ADDRESS_HOME_PHONE     = "319-5555-5555";

	private final String BILLING_ADDRESS_MOBILE_PHONE   = "319-9999-5555";



	public AddressesVerificationPoints(WebDriver driver) {

		this.driver = driver;

		this.confirmInformationsAppObject = new AddressesAppObject(driver);

	}
	
	
	public boolean verifyDeliveryAddressCompleteName() {
		boolean aux = false;

		WebElement element = this.confirmInformationsAppObject.getDeliveryAddressCompleteNameField();		
		
		NavigationTools.highLightElement(this.driver, element);

		if(element.getText().equalsIgnoreCase(this.DELIVERY_ADDRESS_COMPLETE_NAME)) {			
			Report.log(Status.PASS,"The field with complete name was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;
		}else {
			Report.log(Status.FAIL,"The field with complete name wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}
		
		NavigationTools.endHighLightElement(this.driver, element);

		return aux;
	}
	
	
	public boolean verifyDeliveryAddressCompany() {
		boolean aux = false;

		WebElement element = this.confirmInformationsAppObject.getDeliveryAddressCompanyField();
		
		NavigationTools.highLightElement(this.driver, element);

		if(element.getText().equalsIgnoreCase(this.DELIVERY_ADDRESS_COMPANY)) {			
			Report.log(Status.PASS,"The field with company in Delivery Address was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;
		}else {
			Report.log(Status.FAIL,"The field with company in Delivery Address wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}
		
		NavigationTools.endHighLightElement(this.driver, element);

		return aux;
	}
	
	public boolean verifyDeliveryAddressStreet() {
		boolean aux = false;

		WebElement element = this.confirmInformationsAppObject.getDeliveryAddressStreetField();
		
		NavigationTools.highLightElement(this.driver, element);

		if(element.getText().equalsIgnoreCase(this.DELIVERY_ADDRESS_STREET)) {			
			Report.log(Status.PASS,"The field with street in Delivery Address was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;
		}else {
			Report.log(Status.FAIL,"The field with street in Delivery Address wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}
		
		NavigationTools.endHighLightElement(this.driver, element);

		return aux;
	}
	
	
	public boolean verifyDeliveryAddressState() {
		boolean aux = false;

		WebElement element = this.confirmInformationsAppObject.getDeliveryAddressStateField();
		
		NavigationTools.highLightElement(this.driver, element);

		if(element.getText().equalsIgnoreCase(this.DELIVERY_ADDRESS_STATE)) {			
			Report.log(Status.PASS,"The field with State in Delivery Address was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;
		}else {
			Report.log(Status.FAIL,"The field with State in Delivery Address wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}
		
		NavigationTools.endHighLightElement(this.driver, element);

		return aux;
	}
	
	
	public boolean verifyDeliveryAddressCountry() {
		boolean aux = false;

		WebElement element = this.confirmInformationsAppObject.getDeliveryAddressCountryField();
		
		NavigationTools.highLightElement(this.driver, element);

		if(element.getText().equalsIgnoreCase(this.DELIVERY_ADDRESS_COUNTRY)) {			
			Report.log(Status.PASS,"The field with Country in Delivery Address was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;
		}else {
			Report.log(Status.FAIL,"The field with Country in Delivery Address wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}
		
		NavigationTools.endHighLightElement(this.driver, element);

		return aux;
	}
	
	
	public boolean verifyDeliveryAddressHomePhone() {
		boolean aux = false;

		WebElement element = this.confirmInformationsAppObject.getDeliveryAddressHomePhoneField();
		
		NavigationTools.highLightElement(this.driver, element);

		if(element.getText().equalsIgnoreCase(this.DELIVERY_ADDRESS_HOME_PHONE)) {			
			Report.log(Status.PASS,"The field with Home phone in Delivery Address was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;
		}else {
			Report.log(Status.FAIL,"The field with Home phone in Delivery Address wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}
		
		NavigationTools.endHighLightElement(this.driver, element);

		return aux;
	}
	
	
	public boolean verifyDeliveryAddressMobilePhone() {
		boolean aux = false;

		WebElement element = this.confirmInformationsAppObject.getDeliveryAddressMobilePhoneField();
		
		NavigationTools.highLightElement(this.driver, element);

		if(element.getText().equalsIgnoreCase(this.DELIVERY_ADDRESS_MOBILE_PHONE)) {			
			Report.log(Status.PASS,"The field with Mobile phone in Delivery Address was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;
		}else {
			Report.log(Status.FAIL,"The field with Mobile phone in Delivery Address wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}
		
		NavigationTools.endHighLightElement(this.driver, element);

		return aux;
	}
	
	
	public boolean verifyBillingAddressCompleteName() {
		boolean aux = false;

		WebElement element = this.confirmInformationsAppObject.getBillingAddressCompleteNameField();
		
		NavigationTools.highLightElement(this.driver, element);

		if(element.getText().equalsIgnoreCase(this.BILLING_ADDRESS_COMPLETE_NAME)) {			
			Report.log(Status.PASS,"The field with complete name in Billing Address was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;
		}else {
			Report.log(Status.FAIL,"The field with complete name in Billing Address wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}
		
		NavigationTools.endHighLightElement(this.driver, element);

		return aux;
	}
	
	
	public boolean verifyBillingAddressCompany() {
		boolean aux = false;

		WebElement element = this.confirmInformationsAppObject.getBillingAddressCompanyField();
		
		NavigationTools.endHighLightElement(this.driver, element);

		if(element.getText().equalsIgnoreCase(this.BILLING_ADDRESS_COMPANY)) {			
			Report.log(Status.PASS,"The field with company in Billing Address was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;
		}else {
			Report.log(Status.FAIL,"The field with company in Billing Address wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}

		return aux;
	}
	
	public boolean verifyBillingAddressStreet() {
		boolean aux = false;

		WebElement element = this.confirmInformationsAppObject.getBillingAddressStreetField();
		
		NavigationTools.highLightElement(this.driver, element);

		if(element.getText().equalsIgnoreCase(this.BILLING_ADDRESS_STREET)) {			
			Report.log(Status.PASS,"The field with street in Billing Address was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;
		}else {
			Report.log(Status.FAIL,"The field with street in Billing Address wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}
		
		NavigationTools.endHighLightElement(this.driver, element);

		return aux;
	}
	
	
	public boolean verifyBillingAddressState() {
		boolean aux = false;

		WebElement element = this.confirmInformationsAppObject.getBillingAddressStateField();
		
		NavigationTools.highLightElement(this.driver, element);

		if(element.getText().equalsIgnoreCase(this.BILLING_ADDRESS_STATE)) {			
			Report.log(Status.PASS,"The field with State in Billing Address was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;
		}else {
			Report.log(Status.FAIL,"The field with State in Billing Address wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}
		
		NavigationTools.endHighLightElement(this.driver, element);

		return aux;
	}
	
	
	public boolean verifyBillingAddressCountry() {
		boolean aux = false;

		WebElement element = this.confirmInformationsAppObject.getBillingAddressCountryField();
		
		NavigationTools.highLightElement(this.driver, element);

		if(element.getText().equalsIgnoreCase(this.BILLING_ADDRESS_COUNTRY)) {			
			Report.log(Status.PASS,"The field with Country in Billing Address was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;
		}else {
			Report.log(Status.FAIL,"The field with Country in Billing Address wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}
		
		NavigationTools.endHighLightElement(this.driver, element);

		return aux;
	}
	
	
	public boolean verifyBillingAddressHomePhone() {
		boolean aux = false;

		WebElement element = this.confirmInformationsAppObject.getBillingAddressHomePhoneField();
		
		NavigationTools.highLightElement(this.driver, element);

		if(element.getText().equalsIgnoreCase(this.BILLING_ADDRESS_HOME_PHONE)) {			
			Report.log(Status.PASS,"The field with Home phone in Billing Address was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;
		}else {
			Report.log(Status.FAIL,"The field with Home phone in Billing Address wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}
		
		NavigationTools.endHighLightElement(this.driver, element);

		return aux;
	}
	
	
	public boolean verifyBillingAddressMobilePhone() {
		boolean aux = false;

		WebElement element = this.confirmInformationsAppObject.getBillingAddressMobilePhoneField();
		
		NavigationTools.highLightElement(this.driver, element);

		if(element.getText().equalsIgnoreCase(this.BILLING_ADDRESS_MOBILE_PHONE)) {			
			Report.log(Status.PASS,"The field with Mobile phone in Billing Address was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;
		}else {
			Report.log(Status.FAIL,"The field with Mobile phone in Billing Address wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}
		
		NavigationTools.endHighLightElement(this.driver, element);

		return aux;
	}
	

}
