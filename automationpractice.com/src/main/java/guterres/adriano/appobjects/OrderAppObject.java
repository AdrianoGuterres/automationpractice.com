package guterres.adriano.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderAppObject {
	private WebDriver driver;
	
	public OrderAppObject(WebDriver driver) {
		this.driver = driver;		
	}
	
	public WebElement getOrderStatusField() {
		return this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/p/strong"));
	}
	
	public WebElement getAmountField() {
		return this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/span/strong"));
	}
	
	public WebElement getNameAccountOnnerField() {
		return this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/strong[1]"));
	}
	
	public WebElement getBackToOrdersButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/p/a"));
	}

}
