package guterres.adriano.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import guterres.adriano.ressources.NavigationTools;

public class OrderAppObject {
	private WebDriver driver;
	
	public OrderAppObject(WebDriver driver) {
		this.driver = driver;		
	}
	
	public WebElement getOrderStatusField() {
		WebElement element = NavigationTools.waitForClickability(this.driver,By.xpath("//*[@id=\"center_column\"]/div/p/strong"));
		return element;
	}
	
	public WebElement getAmountField() {
		WebElement element = NavigationTools.waitForClickability(this.driver,By.xpath("//*[@id=\"center_column\"]/div/span/strong"));
		return element;
	}
	
	public WebElement getNameAccountOnnerField() {
		WebElement element = NavigationTools.waitForClickability(this.driver,By.xpath("//*[@id=\"center_column\"]/div/strong[1]"));
		return element;
	}
	
	public WebElement getBackToOrdersButton() {
		WebElement element = NavigationTools.waitForClickability(this.driver,By.xpath("//*[@id=\"center_column\"]/p/a"));
		return element;
	}

}
