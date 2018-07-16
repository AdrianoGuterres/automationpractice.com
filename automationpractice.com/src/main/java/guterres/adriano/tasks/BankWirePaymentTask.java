package guterres.adriano.tasks;

import org.openqa.selenium.WebDriver;

import guterres.adriano.appobjects.BankWirePaymentAppObject;

public class BankWirePaymentTask {
	
	private BankWirePaymentAppObject bankWirePaymentAppObject;
	
	
	public BankWirePaymentTask(WebDriver driver) {
		this.bankWirePaymentAppObject = new BankWirePaymentAppObject(driver);		
	}
	
	public void IConfirmMyOrderButton() {
		this.bankWirePaymentAppObject.getIConfirmMyOrderButton().click();
	}

}
