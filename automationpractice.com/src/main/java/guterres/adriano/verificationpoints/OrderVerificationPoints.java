package guterres.adriano.verificationpoints;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

import guterres.adriano.appobjects.OrderAppObject;
import guterres.adriano.ressources.Report;
import guterres.adriano.ressources.ScreenShot;

public class OrderVerificationPoints{
	
	
	private final String ORDER_STATUS     = "Your order on My Store is complete.";
	
	private final String ORDER_AMOUNT     = "$18.51";
	
	private final String ORDER_NAME_OWNER = "Pradeep Macharla";
	
	
	
	
	private WebDriver driver;
	
	private OrderAppObject confirmationAppObject;
	
	public OrderVerificationPoints(WebDriver driver) {
		this.driver = driver;
		this.confirmationAppObject = new OrderAppObject(this.driver);		
	}
	
	public boolean verifyOrderStatus() {
		boolean aux = false;
		
		WebElement nameOfProduct = this.confirmationAppObject.getOrderStatusField();

		if(nameOfProduct.getText().equalsIgnoreCase(this.ORDER_STATUS)) {
			Report.log(Status.PASS, "Order status is successful.", ScreenShot.capture(this.driver));
			aux = true;
		}else {
			Report.log(Status.FAIL, "Order status isn't successful.", ScreenShot.capture(this.driver));			
		}
		
		return aux;
	}
	
	public boolean verifyOrderNameOwner() {
		boolean aux = false;
		
		WebElement nameOfProduct = this.confirmationAppObject.getNameAccountOnnerField();

		if(nameOfProduct.getText().equalsIgnoreCase(this.ORDER_NAME_OWNER)) {
			Report.log(Status.PASS, "The name the owner is correct.", ScreenShot.capture(this.driver));
			aux = true;
		}else {
			Report.log(Status.FAIL, "The name the owner isn't correct.", ScreenShot.capture(this.driver));			
		}
		
		return aux;
	}
	
	public boolean verifyOrderAmount() {
		boolean aux = false;
		
		WebElement nameOfProduct = this.confirmationAppObject.getAmountField();

		if(nameOfProduct.getText().equalsIgnoreCase(this.ORDER_AMOUNT)) {
			Report.log(Status.PASS, "The amount of this order is correct.", ScreenShot.capture(this.driver));
			aux = true;
		}else {
			Report.log(Status.FAIL, "The amount of this order isn't correct.", ScreenShot.capture(this.driver));			
		}
		
		return aux;
	}

}
