package guterres.adriano.verificationpoints;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import com.aventstack.extentreports.Status;

import guterres.adriano.appobjects.*;
import guterres.adriano.ressources.NavigationTools;
import guterres.adriano.ressources.Report;
import guterres.adriano.ressources.ScreenShot;

public class AddFirstProductVerificationPoints {

	private AddFirstProductAppObject selectAppObject;

	private WebDriver driver;


	private final String PRODUCT_TITLE    = "Faded Short Sleeve T-shirts";
	
	private final String PRODUCT_QUANTITY = "1";
	
	private final String TOTAL_PRODUCT    = "$16.51";
	
	private final String TOTAL_SHIPPING   = "$2.00";
	
	private final String TOTAL            = "$18.51";



	public AddFirstProductVerificationPoints(WebDriver driver) {		
		this.driver = driver;
		this.selectAppObject = new AddFirstProductAppObject(driver);

	}


	public boolean verifySelectFirstProduct() {
		boolean aux = false;		

		WebElement element = this.selectAppObject.getAddToCartFirstProductButton();
		
		NavigationTools.highLightElement(this.driver, element);

		if(element.isEnabled()) {
			Report.log(Status.PASS, "the first product was highlighted correctly.", ScreenShot.capture(this.driver));		
			aux = true;
		}else {		
			Report.log(Status.FAIL, "the first product wasn't highlighted correctly.", ScreenShot.capture(this.driver));
		}	
		
		NavigationTools.endHighLightElement(this.driver, element);

		return aux;
	}

	public boolean verifyProceedProduct() {

		boolean aux = false;				

		WebDriverWait wait = new WebDriverWait(driver, 10);

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a")));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[2]/div/div/div/div[1]/ul/li[3]/div/a/img")));
		
		NavigationTools.highLightElement(this.driver, element);

		if(element.isEnabled()) {
			Report.log(Status.PASS, "The product was selected correctly", ScreenShot.capture(this.driver));		
			aux = true;
		}else {		
			Report.log(Status.FAIL, "The product wasn't selected correctly", ScreenShot.capture(this.driver));
		}	
		
		NavigationTools.endHighLightElement(this.driver, element);

		return aux;
	}



	public boolean verifyProductTitle() {

		boolean aux = false;		

		WebElement element = this.selectAppObject.getProductTitleLabel();
		
		NavigationTools.highLightElement(this.driver, element);

		if(element.getText().equalsIgnoreCase(this.PRODUCT_TITLE)) {
			Report.log(Status.PASS, "The product title was corretly.", ScreenShot.capture(this.driver));		
			aux = true;
		}else {		
			Report.log(Status.FAIL, "The product title wasn't corretly.", ScreenShot.capture(this.driver));
		}	
		
		NavigationTools.endHighLightElement(this.driver, element);

		return aux;
	}
	
	public boolean verifyProductQuantity() {

		boolean aux = false;		

		WebElement element = this.selectAppObject.getProductQuantityLabel();
		
		NavigationTools.highLightElement(this.driver, element);
		
		if(element.getText().equalsIgnoreCase(this.PRODUCT_QUANTITY)) {
			Report.log(Status.PASS, "The product quantity was corretly.", ScreenShot.capture(this.driver));		
			aux = true;
		}else {		
			Report.log(Status.FAIL, "The product quantity wasn't corretly.", ScreenShot.capture(this.driver));
		}	
		
		NavigationTools.endHighLightElement(this.driver, element);

		return aux;
	}
	
	public boolean verifyProductTotalProduct() {

		boolean aux = false;		

		WebElement element = this.selectAppObject.getTotalProductsLabel();
		
		NavigationTools.highLightElement(this.driver, element);

		if(element.getText().equalsIgnoreCase(this.TOTAL_PRODUCT)) {
			Report.log(Status.PASS, "The total products was corretly.", ScreenShot.capture(this.driver));		
			aux = true;
		}else {		
			Report.log(Status.FAIL, "The total products wasn't corretly.", ScreenShot.capture(this.driver));
		}	
		
		NavigationTools.endHighLightElement(this.driver, element);

		return aux;
	}
	

	public boolean verifyProductShippingProduct() {

		boolean aux = false;		

		WebElement element = this.selectAppObject.getTotalShippingLabel();
		
		NavigationTools.highLightElement(this.driver, element);

		if(element.getText().equalsIgnoreCase(this.TOTAL_SHIPPING)) {
			Report.log(Status.PASS, "The total shipping was corretly.", ScreenShot.capture(this.driver));		
			aux = true;
		}else {		
			Report.log(Status.FAIL, "The total shipping wasn't corretly.", ScreenShot.capture(this.driver));
		}	
		
		NavigationTools.endHighLightElement(this.driver, element);

		return aux;
	}
	
	public boolean verifyTotalProduct() {

		boolean aux = false;		

		WebElement element = this.selectAppObject.getTotalLabel();
		
		NavigationTools.highLightElement(this.driver, element);

		if(element.getText().equalsIgnoreCase(this.TOTAL)) {
			Report.log(Status.PASS, "The total price was corretly.", ScreenShot.capture(this.driver));		
			aux = true;
		}else {		
			Report.log(Status.FAIL, "The total price wasn't corretly.", ScreenShot.capture(this.driver));
		}	
		
		NavigationTools.endHighLightElement(this.driver, element);

		return aux;
	}
	
}
