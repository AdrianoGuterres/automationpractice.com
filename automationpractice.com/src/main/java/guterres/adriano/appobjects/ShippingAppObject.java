package guterres.adriano.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShippingAppObject {
	private WebDriver driver;

	public ShippingAppObject(WebDriver driver) {
		this.driver = driver;		
	}

	public WebElement getAliasAddress() {
		return this.driver.findElement(By.xpath("//*[@id=\"form\"]/div/div[2]/p"));
	}
	
	
	public WebElement getChooiseDeliveryRadioButton() {

		WebElement element = this.driver.findElement(By.xpath("//*[@id=\"form\"]/div/div[2]/div[1]/div/div/table/tbody/tr/td[1]"));

		return element;
	}

	public WebElement getPriceShippingField() {

		WebElement element = this.driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/form/div/div[2]/div[1]/div/div/table/tbody/tr/td[4]"));
		return element;
	}

	public WebElement getIAgreeTernsCheckBox() {
				
		WebElement element = new  WebDriverWait(this.driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form\"]/div/p[2]/label")));
		
		return element;
	}
	
	

	public WebElement getProceedCheckoutButton() {
		
		WebElement element = this.driver.findElement(By.cssSelector("button.button:nth-child(4)"));
		return element;
	}

}
