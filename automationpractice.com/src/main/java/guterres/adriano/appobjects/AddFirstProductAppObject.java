package guterres.adriano.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import guterres.adriano.ressources.NavigationTools;


public class AddFirstProductAppObject {
	private WebDriver driver;

	public AddFirstProductAppObject(WebDriver driver) {  
		this.driver = driver;		

	}

	public WebElement getAddToCartFirstProductButton() {

		NavigationTools.moveToElementByXpath(driver, "//*[@id=\"homefeatured\"]/li[1]");
		
		WebElement element = NavigationTools.waitForClickability(this.driver, By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]"));
		return element;
	}

	public WebElement getProceedToCheckoutButton() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span"));
		return element;
	}	
	
	public WebElement getProductTitleLabel() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.id("layer_cart_product_title"));			
		return element;				
	}
	
	public WebElement getProductQuantityLabel() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.id("layer_cart_product_quantity"));
		return element;				
	}
	
	public WebElement getTotalProductsLabel() {		
		WebElement element = NavigationTools.waitForClickability(this.driver, By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[1]/span"));
		return element;				
	}
	
	public WebElement getTotalShippingLabel() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[2]/span"));
		return element;				
	}
	
	public WebElement getTotalLabel() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[3]/span"));
		return element;				
	}



}
