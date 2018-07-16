package guterres.adriano.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import guterres.adriano.appobjects.ConfirmOrderAppObject;

public class ConfirmOrderTasks {
	
	private ConfirmOrderAppObject confirmOrderAppObject;
	
	private WebDriver driver;
	
	public ConfirmOrderTasks(WebDriver driver) {
		this.driver = driver;
		
		this.confirmOrderAppObject = new ConfirmOrderAppObject(this.driver);		
	}
	
	
	public void clickIConfirmMyOrderButton() {
		WebElement element = this.confirmOrderAppObject.getIconfirmMyOrderButton();
		element.click();
	}

}
