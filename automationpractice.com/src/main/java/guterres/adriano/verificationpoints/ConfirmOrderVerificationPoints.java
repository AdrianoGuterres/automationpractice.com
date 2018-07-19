package guterres.adriano.verificationpoints;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

import guterres.adriano.appobjects.ConfirmOrderAppObject;
import guterres.adriano.ressources.NavigationTools;
import guterres.adriano.ressources.Report;
import guterres.adriano.ressources.ScreenShot;

public class ConfirmOrderVerificationPoints {
	
	private ConfirmOrderAppObject confirmOrderAppObject;
	
	private WebDriver driver;
	
	
	private final String PAYMENT_TYPE =  "Bank-wire payment.";
	
				
	public ConfirmOrderVerificationPoints(WebDriver driver) {
		
		this.driver = driver;
		
		this.confirmOrderAppObject = new ConfirmOrderAppObject(this.driver);
		
	}
	
	public boolean verifyPaymentType() {
		boolean aux = false;
		
		WebElement element = this.confirmOrderAppObject.getTipePaymentField();
		
		NavigationTools.highLightElement(this.driver, element);

		if(element.getText().equalsIgnoreCase(this.PAYMENT_TYPE)) {
			Report.log(Status.PASS, "Payment Type field is correct.", ScreenShot.capture(this.driver));
			aux = true;
		}else {
			Report.log(Status.FAIL, "Payment Type field isn't correct.", ScreenShot.capture(this.driver));			
		}
		
		NavigationTools.highLightElement(this.driver, element);
				
		return aux;
	}	

}
