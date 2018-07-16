package guterres.adriano.tasks;

import org.openqa.selenium.WebDriver;

import guterres.adriano.appobjects.AuthenticationAppObject;

public class AuthenticationTask {
	
	private AuthenticationAppObject createAccountAppObject;
	
	
	public AuthenticationTask(WebDriver driver) {		
		this.createAccountAppObject = new AuthenticationAppObject(driver);		
	}
	
	
	public void fillEmailField(String email) {	
		
		this.createAccountAppObject.getEmailAdressField().sendKeys(email);		
	}
	
		
	public void clickButtonCreateAccount() {		
		this.createAccountAppObject.getCreateAccountButton().click();		
	}
	
	
	

}
