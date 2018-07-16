package guterres.adriano.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthenticationAppObject {
	
	private WebDriver driver;
	
	public AuthenticationAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getEmailAdressField() {		
				
		WebElement element = this.driver.findElement(By.id("email_create"));		
		return element;
	}
	
	
	public WebElement getCreateAccountButton() {
		WebElement element = this.driver.findElement(By.id("SubmitCreate"));
		return element;
	}

}
