package guterres.adriano.verificationpoints;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

import guterres.adriano.appobjects.BankWirePaymentAppObject;
import guterres.adriano.ressources.Report;
import guterres.adriano.ressources.ScreenShot;

public class BankWirePaymentVerificationPoints {

	private WebDriver driver;

	private BankWirePaymentAppObject bankWirePaymentAppObject;
	
	private final String PAYMENT_METHOD = "BANK-WIRE PAYMENT.";
	
	

	public BankWirePaymentVerificationPoints(WebDriver driver) {
		this.driver = driver;
		this.bankWirePaymentAppObject = new BankWirePaymentAppObject(this.driver);		
	}

	public boolean verifyPaymentMethod() {		
		boolean aux = false;

		WebElement element = this.bankWirePaymentAppObject.getMethodPaymentLabel();

		if(element.getText().equalsIgnoreCase(this.PAYMENT_METHOD)) {
			Report.log(Status.PASS, "The payment is correct.", ScreenShot.capture(this.driver));
			aux = true;
		}else {
			Report.log(Status.FAIL, "The payment isn't correct.", ScreenShot.capture(this.driver));			
		}

		return aux;

	}

}
