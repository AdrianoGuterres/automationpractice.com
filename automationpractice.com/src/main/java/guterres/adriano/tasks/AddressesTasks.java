package guterres.adriano.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import guterres.adriano.appobjects.AddressesAppObject;

public class AddressesTasks {
	
	private AddressesAppObject confirmInformationsAppObject;
	
	WebDriver driver;
	
	public AddressesTasks(WebDriver driver) {
		
		this.driver = driver;
		
		this.confirmInformationsAppObject = new AddressesAppObject(driver);
		
	}
	
	public void clickProceedToCheckoutButton() {
		WebElement element = this.confirmInformationsAppObject.getProceedToCheckoutButton();
		
		element.click();
	}

}
