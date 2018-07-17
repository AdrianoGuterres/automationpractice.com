package guterres.adriano.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import guterres.adriano.ressources.NavigationTools;

public class AddressesAppObject {
	
	private WebDriver driver;
	
	public AddressesAppObject(WebDriver driver) {
		this.driver = driver;		
	}
	
	public WebElement getDeliveryAddressCompleteNameField() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.xpath("//*[@id=\"address_delivery\"]/li[2]"));
		return element;
	}
	
	public WebElement getDeliveryAddressCompanyField() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.xpath("//*[@id=\"address_delivery\"]/li[3]"));
		return element;		
	}
	
	public WebElement getDeliveryAddressStreetField() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.xpath("//*[@id=\"address_delivery\"]/li[4]"));
		return element;
	}
	
	public WebElement getDeliveryAddressStateField() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.xpath("//*[@id=\"address_delivery\"]/li[5]"));
		return element;
	}
	
	public WebElement getDeliveryAddressCountryField() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.xpath("//*[@id=\"address_delivery\"]/li[6]"));
		return element;
	}
	
	public WebElement getDeliveryAddressHomePhoneField() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.xpath("//*[@id=\"address_delivery\"]/li[7]"));
		return element;
	}
	
	public WebElement getDeliveryAddressMobilePhoneField() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.xpath("//*[@id=\"address_delivery\"]/li[8]"));
		return element;
	}
	
	
	
	
	
	public WebElement getBillingAddressCompleteNameField() {
		WebElement element = NavigationTools.waitForClickability(this.driver,By.xpath("//*[@id=\"address_invoice\"]/li[2]"));
		return element;
	}
	
	public WebElement getBillingAddressCompanyField() {
		WebElement element = NavigationTools.waitForClickability(this.driver,By.xpath("//*[@id=\"address_invoice\"]/li[3]"));
		return element;
		
	}
	
	public WebElement getBillingAddressStreetField() {
		WebElement element = NavigationTools.waitForClickability(this.driver,By.xpath("//*[@id=\"address_invoice\"]/li[4]"));
		return element;
	}
	
	public WebElement getBillingAddressStateField() {
		WebElement element = NavigationTools.waitForClickability(this.driver,By.xpath("//*[@id=\"address_invoice\"]/li[5]"));
		return element;
	}
	
	public WebElement getBillingAddressCountryField() {
		WebElement element = NavigationTools.waitForClickability(this.driver,By.xpath("//*[@id=\"address_invoice\"]/li[6]"));
		return element;
	}
	
	public WebElement getBillingAddressHomePhoneField() {
		WebElement element = NavigationTools.waitForClickability(this.driver,By.xpath("//*[@id=\"address_invoice\"]/li[7]"));
		return element;
	}
	
	public WebElement getBillingAddressMobilePhoneField() {
		WebElement element = NavigationTools.waitForClickability(this.driver,By.xpath("//*[@id=\"address_invoice\"]/li[8]"));
		return element;
	}
	

	public WebElement getProceedToCheckoutButton() {	
		WebElement element = NavigationTools.waitForClickability(this.driver,By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
		return element;
	}
	
	
	
	

}
