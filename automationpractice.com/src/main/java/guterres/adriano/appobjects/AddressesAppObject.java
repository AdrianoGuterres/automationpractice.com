package guterres.adriano.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressesAppObject {
	
	private WebDriver driver;
	
	public AddressesAppObject(WebDriver driver) {
		this.driver = driver;		
	}
	
	public WebElement getDeliveryAddressCompleteNameField() {
		return this.driver.findElement(By.xpath("//*[@id=\"address_delivery\"]/li[2]"));
	}
	
	public WebElement getDeliveryAddressCompanyField() {
		return this.driver.findElement(By.xpath("//*[@id=\"address_delivery\"]/li[3]"));
	}
	
	public WebElement getDeliveryAddressStreetField() {
		return this.driver.findElement(By.xpath("//*[@id=\"address_delivery\"]/li[4]"));
	}
	
	public WebElement getDeliveryAddressStateField() {
		return this.driver.findElement(By.xpath("//*[@id=\"address_delivery\"]/li[5]"));
	}
	
	public WebElement getDeliveryAddressCountryField() {
		return this.driver.findElement(By.xpath("//*[@id=\"address_delivery\"]/li[6]"));
	}
	
	public WebElement getDeliveryAddressHomePhoneField() {
		return this.driver.findElement(By.xpath("//*[@id=\"address_delivery\"]/li[7]"));
	}
	
	public WebElement getDeliveryAddressMobilePhoneField() {
		return this.driver.findElement(By.xpath("//*[@id=\"address_delivery\"]/li[8]"));
	}
	
	
	
	
	
	public WebElement getBillingAddressCompleteNameField() {
		return this.driver.findElement(By.xpath("//*[@id=\"address_invoice\"]/li[2]"));
	}
	
	public WebElement getBillingAddressCompanyField() {
		return this.driver.findElement(By.xpath("//*[@id=\"address_invoice\"]/li[3]"));
	}
	
	public WebElement getBillingAddressStreetField() {
		return this.driver.findElement(By.xpath("//*[@id=\"address_invoice\"]/li[4]"));
	}
	
	public WebElement getBillingAddressStateField() {
		return this.driver.findElement(By.xpath("//*[@id=\"address_invoice\"]/li[5]"));
	}
	
	public WebElement getBillingAddressCountryField() {
		return this.driver.findElement(By.xpath("//*[@id=\"address_invoice\"]/li[6]"));
	}
	
	public WebElement getBillingAddressHomePhoneField() {
		return this.driver.findElement(By.xpath("//*[@id=\"address_invoice\"]/li[7]"));
	}
	
	public WebElement getBillingAddressMobilePhoneField() {
		return this.driver.findElement(By.xpath("//*[@id=\"address_invoice\"]/li[8]"));
	}
	

	public WebElement getProceedToCheckoutButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));		
	}
	
	
	
	

}
