package guterres.adriano.tasks;

import org.openqa.selenium.WebDriver;

import guterres.adriano.appobjects.ShippingAppObject;

public class ShippingTasks {
	
	private ShippingAppObject confirmShippingAppObject;
	
	private WebDriver driver;
	
	public ShippingTasks(WebDriver driver) {
		this.driver = driver;				
		this.confirmShippingAppObject = new ShippingAppObject(this.driver);
	}
	
	
	public void clickDeliveryRadioButton() {
		this.confirmShippingAppObject.getChooiseDeliveryRadioButton().click();
	}
	
	
	public void clickAgreeTermsCheckbox() {		
		this.confirmShippingAppObject.getIAgreeTernsCheckBox().click();
	}
	
	
	
	public void clickProceedCheckout() {
		this.confirmShippingAppObject.getProceedCheckoutButton().click();
	}

}
