package guterres.adriano.verificationpoints;

import org.openqa.selenium.*;

import com.aventstack.extentreports.Status;

import guterres.adriano.appobjects.ShippingAppObject;
import guterres.adriano.ressources.*;

public class ShippingVerificationPoints {
	
	private ShippingAppObject confirmShippingAppObject;
	
	private WebDriver driver;
	
	
	private final String ALIAS_ADDRESS  = "Choose a shipping option for this address: Mi casa";
	
	private final boolean I_AGREE_TERMS = true;
	
	private final boolean I_AGREE_DELIVERY = true;
	
	private final String PRICE_SHIPPING = "$2.00";	
	
	
	public ShippingVerificationPoints(WebDriver driver) {
		this.driver = driver;		
		this.confirmShippingAppObject = new ShippingAppObject(this.driver);
		
	}
	
	public boolean verifyAliasAddress() {
		boolean aux = false;
		
		WebElement element = this.confirmShippingAppObject.getAliasAddress();
		
		NavigationTools.highLightElement(this.driver, element);
		
		if(element.getText().equalsIgnoreCase(this.ALIAS_ADDRESS)) {
			Report.log(Status.PASS,"The field with Alias Address was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;			
		}else {
			Report.log(Status.FAIL,"The field with Alias Address wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}		
		
		NavigationTools.endHighLightElement(this.driver, element);
		
		return aux;		
	}	
	
	public boolean verifyDeliveryChooise() {
		boolean aux = false;
		
		WebElement element = this.confirmShippingAppObject.getChooiseDeliveryRadioButton();
		
		if(element.isEnabled() == this.I_AGREE_DELIVERY) {
			Report.log(Status.PASS,"The delivery is select correctly", ScreenShot.capture(this.driver));		
			aux = true;			
		}else {
			Report.log(Status.FAIL,"The delivery isn't select correctly", ScreenShot.capture(this.driver));	
		}		
		return aux;		
	}
	
	
	public boolean verifyPriceShipping() {
		boolean aux = false;
		
		WebElement element = this.confirmShippingAppObject.getPriceShippingField();
		
		NavigationTools.highLightElement(this.driver, element);
		
		if(element.getText().equalsIgnoreCase(this.PRICE_SHIPPING)) {
			Report.log(Status.PASS,"The field with price shipping was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;			
		}else {
			Report.log(Status.FAIL,"The field with price shipping wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}		
		
		NavigationTools.endHighLightElement(this.driver, element);
		return aux;		
	}
	
	public boolean verifyIAgreeTerms() {
		boolean aux = false;
		
		WebElement element = this.confirmShippingAppObject.getIAgreeTernsCheckBox();
		
		if(element.isEnabled() == this.I_AGREE_TERMS) {
			Report.log(Status.PASS,"The checkbox with 'I agree terms...' was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;			
		}else {
			Report.log(Status.FAIL,"The checkbox with 'I agree terms...' wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}		
		return aux;		
	}

}
