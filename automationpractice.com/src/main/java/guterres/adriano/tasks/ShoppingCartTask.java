package guterres.adriano.tasks;

import org.openqa.selenium.WebDriver;

import guterres.adriano.appobjects.ShoppingCartAppObject;

public class ShoppingCartTask {
	
	private ShoppingCartAppObject shoppingCartAppObject;
	
	public ShoppingCartTask(WebDriver driver) {
		
		this.shoppingCartAppObject = new ShoppingCartAppObject(driver);				
	}
	
	
	public void clickProceedCheckoutButton() {
		this.shoppingCartAppObject.getProceedCheckoutButton().click();
	}

}
