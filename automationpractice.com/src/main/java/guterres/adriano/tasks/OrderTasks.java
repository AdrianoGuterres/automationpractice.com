package guterres.adriano.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import guterres.adriano.appobjects.OrderAppObject;

public class OrderTasks {
	
	private WebDriver driver;
	
	private OrderAppObject orderConfirmationAppObject;
	
	public OrderTasks(WebDriver driver) {
		this.driver = driver;
		this.orderConfirmationAppObject = new OrderAppObject(this.driver);
	}
	
	public void clickBackToOrdersButton() {
		WebElement element = this.orderConfirmationAppObject.getBackToOrdersButton();
		element.click();
	}

}
