package guterres.adriano.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import guterres.adriano.appobjects.AddFirstProductAppObject;

public class AddFirstProductTask {
	
	private AddFirstProductAppObject selectFirstProductAppObject;
	
	
	public AddFirstProductTask(WebDriver driver) {
		this.selectFirstProductAppObject = new AddFirstProductAppObject(driver);
		
	}
	
	
	public void moveTheMouseFirstProduct() {
		this.selectFirstProductAppObject.getAddToCartFirstProductButton();
	}
	
	
	public void clickAddToCartFirstButton() {
		
		
		this.selectFirstProductAppObject.getAddToCartFirstProductButton().click();
	}
	
	public void clickcProceedToCheckoutButton() {
		WebElement proceedButton = selectFirstProductAppObject.getProceedToCheckoutButton();
		
		proceedButton.click();
	}	

}
