package guterres.adriano.appobjects;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import guterres.adriano.ressources.NavigationTools;

public class PaymentAppObject {

	private WebDriver driver;

	public PaymentAppObject(WebDriver driver) {
		this.driver = driver;		
	}
	
	public WebElement getProductNameField() {

		WebElement table = this.driver.findElement(By.cssSelector("#cart_summary > tbody"));	

		ArrayList<WebElement> td = new ArrayList<WebElement>();
		td.addAll( table.findElements(By.cssSelector("td")));	

		return td.get(1);
	}	

	public WebElement getInStockField() {
		WebElement table = this.driver.findElement(By.cssSelector("#cart_summary > tbody"));	

		ArrayList<WebElement> td = new ArrayList<WebElement>();
		td.addAll( table.findElements(By.cssSelector("td")));	

		return td.get(2);
	}

	public WebElement getUnitPriceField() {
		WebElement table = this.driver.findElement(By.cssSelector("#cart_summary > tbody"));	

		ArrayList<WebElement> td = new ArrayList<WebElement>();
		td.addAll( table.findElements(By.cssSelector("td")));		
		
		return td.get(3);
	}	


	public WebElement getQuantityImput() {
		WebElement table = this.driver.findElement(By.cssSelector("#cart_summary > tbody"));	

		ArrayList<WebElement> td = new ArrayList<WebElement>();
		td.addAll( table.findElements(By.cssSelector("td")));		

		return td.get(4);
	}	


	public WebElement getPriceTotaPerProductlField() {
		WebElement table = this.driver.findElement(By.cssSelector("#cart_summary > tbody"));	

		ArrayList<WebElement> td = new ArrayList<WebElement>();
		td.addAll( table.findElements(By.cssSelector("td")));		

		return td.get(5);
	}		

	public WebElement getTotalPriceAllProductField() {		
		WebElement element = NavigationTools.waitForClickability(this.driver, By.id("total_product"));		
		return element;
	}


	public WebElement getTotalShipingField() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.id("total_shipping"));
		return element;
	}	


	public WebElement getTotalPriceOrderField() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.id("total_price"));
		return element;
	}


	public WebElement getPayByBankWireButton() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.className("payment_module"));
		return element;
	}		

}
