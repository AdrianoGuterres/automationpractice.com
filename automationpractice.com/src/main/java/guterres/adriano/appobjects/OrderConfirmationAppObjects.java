package guterres.adriano.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import guterres.adriano.ressources.NavigationTools;

public class OrderConfirmationAppObjects {
	
	private WebDriver driver;
	
	public OrderConfirmationAppObjects(WebDriver driver) {
		this.driver = driver;		
	}
	
		
	public WebElement getConfirmationLabel() {
		WebElement element = NavigationTools.waitForClickability(this.driver,By.className("cheque-indent"));
		return element;
	}
	
	public WebElement getBackToOrdersButton() {		
		WebElement element = NavigationTools.waitForClickability(this.driver, By.xpath("//*[@id=\"center_column\"]/p/a"));
		return element;
	}

}
