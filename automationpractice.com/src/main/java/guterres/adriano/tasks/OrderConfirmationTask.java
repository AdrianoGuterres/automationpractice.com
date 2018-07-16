package guterres.adriano.tasks;

import org.openqa.selenium.WebDriver;

import guterres.adriano.appobjects.OrderConfirmationAppObjects;

public class OrderConfirmationTask {
	
	private OrderConfirmationAppObjects orderConfirmationAppObjects;
	
	public OrderConfirmationTask(WebDriver driver) {
		this.orderConfirmationAppObjects = new OrderConfirmationAppObjects(driver);		
	}
	
	public void clicBackToOrdersButton() {
		this.orderConfirmationAppObjects.getBackToOrdersButton().click();		
	}

}
