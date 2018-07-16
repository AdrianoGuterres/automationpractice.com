package guterres.adriano.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartAppObject {

	private WebDriver driver;

	public ShoppingCartAppObject(WebDriver driver) {  
		this.driver = driver;

	}

	public WebElement getProductTitleLabel() {
		WebElement aux = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[2]/p/a")); 

		return aux; 
	}		

	public WebElement getInStockField() {
		WebElement aux = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[3]/span")) ;

		return aux;
	}	
	
	public WebElement getUnitPriceField() {
		WebElement aux = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[4]/span/span"));
		return aux;
	}		
	
	public WebElement getQuantityField() {
		WebElement aux = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[5]/input[2]"));
		return aux;		
	}
		
	public WebElement getTotalPricePerProductField() {
		WebElement aux = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[6]"));
		return aux;
	}	
	
	public WebElement getTotalPriceAllProductField() {
		WebElement aux = driver.findElement(By.id("total_product"));
		return aux;
	}
	
	public WebElement getTotalShipingField() {
		WebElement aux = driver.findElement(By.id("total_shipping"));
		return aux;
	}
	
	public WebElement getTotalPriceWhithoutTaxField() {
		WebElement aux = driver.findElement(By.id("total_price_without_tax"));
		return aux;
		
	}
	
	public WebElement getTotalTaxField() {
		WebElement aux = driver.findElement(By.xpath("//*[@id=\"total_tax\"]"));		
		return aux;		
	}
		
	public WebElement getTotalPriceField() {
		WebElement aux = driver.findElement(By.id("total_price"));
		return aux;		
	}	
	
	public WebElement getProceedCheckoutButton() {
		WebElement aux = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/p[2]/a[1]"));
		return aux;		
	}

}
