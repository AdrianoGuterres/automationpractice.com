package guterres.adriano.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import guterres.adriano.ressources.NavigationTools;

public class ShoppingCartAppObject {

	private WebDriver driver;

	public ShoppingCartAppObject(WebDriver driver) {  
		this.driver = driver;

	}

	public WebElement getProductTitleLabel() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[2]/p/a"));
		return element;
	}		

	public WebElement getInStockField() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[3]/span")) ;
		return element;
	}	
	
	public WebElement getUnitPriceField() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[4]/span/span"));
		return element;
	}		
	
	public WebElement getQuantityField() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[5]/input[2]"));
		return element;
	}
		
	public WebElement getTotalPricePerProductField() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[6]"));
		return element;
	}	
	
	public WebElement getTotalPriceAllProductField() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.id("total_product"));
		return element;
	}
	
	public WebElement getTotalShipingField() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.id("total_shipping"));
		return element;
	}
	
	public WebElement getTotalPriceWhithoutTaxField() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.id("total_price_without_tax"));
		return element;		
	}
	
	public WebElement getTotalTaxField() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.xpath("//*[@id=\"total_tax\"]"));	
		return element;
	}
		
	public WebElement getTotalPriceField() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.id("total_price"));
		return element;
	}	
	
	public WebElement getProceedCheckoutButton() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/p[2]/a[1]"));
		return element;
	}

}
