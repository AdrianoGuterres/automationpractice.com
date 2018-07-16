package guterres.adriano.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentAppObject {

	private WebDriver driver;

	public PaymentAppObject(WebDriver driver) {
		this.driver = driver;		
	}

	public WebElement getProductNameField() {
		WebElement element = driver.findElement(By.className("product-name")); 

		return element; 
	}	

	public WebElement getInStockField() {

		WebElement element = new WebDriverWait(this.driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"product_1_1_0_82569\"]/td[3]/span")));

		return element;
	}

	public WebElement getUnitPriceField() {
		WebElement aux = driver.findElement(By.xpath("//*[@id=\"product_price_1_1_82071\"]/span"));
		return aux;
	}	


	public WebElement getQuantityImput() {
		WebElement aux = driver.findElement(By.xpath("//*[@id=\"product_1_1_0_82071\"]/td[5]/span"));
		return aux;		
	}	


	public WebElement getPriceTotaPerProductlField() {
		WebElement aux = driver.findElement(By.id("total_product_price_1_1_82071"));
		return aux;
	}

	public WebElement getTotalPriceAllProductField() {		
		WebElement aux = driver.findElement(By.id("total_product"));
		return aux;
	}


	public WebElement getTotalShipingField() {
		WebElement element = driver.findElement(By.id("total_shipping"));
		return element;
	}	


	public WebElement getTotalPriceOrderField() {
		WebElement aux = driver.findElement(By.id("total_price"));
		return aux;		
	}


	public WebElement getPayByBankWireButton() {
		WebElement element = new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(By.className("payment_module")));
		return element;
	}		

}
