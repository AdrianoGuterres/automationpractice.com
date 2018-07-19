package guterres.adriano.verificationpoints;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

import guterres.adriano.appobjects.AuthenticationAppObject;
import guterres.adriano.ressources.NavigationTools;
import guterres.adriano.ressources.Report;
import guterres.adriano.ressources.ScreenShot;

public class AuthenticationVerificationPoints {
	
	private AuthenticationAppObject createAccountAppObject;
	
	private WebDriver driver;
		
	
	
	public AuthenticationVerificationPoints(WebDriver driver) {
		
		this.driver = driver;		
		this.createAccountAppObject = new AuthenticationAppObject(this.driver);		
	}
	
	
	public boolean verifyUserEmail() {
		boolean aux = false;

		WebElement element = this.createAccountAppObject.getEmailAdressField();
		
		NavigationTools.highLightElement(this.driver, element);

		if(element.getText() != null) {			
			Report.log(Status.PASS,"The 'Email' field was filled in correctly", ScreenShot.capture(this.driver));		
			aux = true;
		}else {
			Report.log(Status.FAIL,"The 'Email' field wasn't filled in correctly", ScreenShot.capture(this.driver));	
		}
		
		NavigationTools.endHighLightElement(this.driver, element);
		
		return aux;
	}

}
