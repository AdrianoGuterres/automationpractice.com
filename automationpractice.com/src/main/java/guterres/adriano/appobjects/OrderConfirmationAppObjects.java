package guterres.adriano.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderConfirmationAppObjects {
	
	private WebDriver driver;
	
	public OrderConfirmationAppObjects(WebDriver driver) {
		this.driver = driver;		
	}
	
		
	public WebElement getConfirmationLabel() {
		WebElement element = this.driver.findElement(By.className("cheque-indent"));
		return element;
	}
	
	public WebElement getBackToOrdersButton() {		
		WebElement element = new WebDriverWait(this.driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"center_column\"]/p/a")));
		return element;
	}

}
