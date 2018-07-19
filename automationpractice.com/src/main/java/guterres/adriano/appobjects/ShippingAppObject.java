package guterres.adriano.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import guterres.adriano.ressources.NavigationTools;

public class ShippingAppObject {
	private WebDriver driver;

	public ShippingAppObject(WebDriver driver) {
		this.driver = driver;		
	}

	public WebElement getAliasAddress() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.xpath("//*[@id=\"form\"]/div/div[2]/p"));
		return element;
	} 


	public WebElement getChooiseDeliveryRadioButton() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.xpath("//*[@id=\"form\"]/div/div[2]/div[1]/div/div/table/tbody/tr/td[1]"));
		return element;
	}

	public WebElement getPriceShippingField() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/form/div/div[2]/div[1]/div/div/table/tbody/tr/td[4]"));
		return element;
	}

	public WebElement getIAgreeTernsCheckBox() {
		WebElement element = NavigationTools.waitForClickability(this.driver, By.xpath("//*[@id=\"form\"]/div/p[2]/label"));
		return element;
	}	

	public WebElement getProceedCheckoutButton() {		
		WebElement element = NavigationTools.waitForClickability(this.driver, By.cssSelector("button.button:nth-child(4)"));
		return element;
	}

}
