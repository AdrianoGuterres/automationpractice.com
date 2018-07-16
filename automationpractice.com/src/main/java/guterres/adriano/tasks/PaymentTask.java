package guterres.adriano.tasks;

import org.openqa.selenium.WebDriver;

import guterres.adriano.appobjects.PaymentAppObject;

public class PaymentTask {
	
	private PaymentAppObject confirmOrderAndPaymentAppObject;

	public PaymentTask(WebDriver driver) {
		this.confirmOrderAndPaymentAppObject = new PaymentAppObject(driver);		
	}
	
	public void clickPayBankWire() {
		
		this.confirmOrderAndPaymentAppObject.getPayByBankWireButton().click();
	}
}
