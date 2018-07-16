package guterres.adriano.verificationpoints;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

import guterres.adriano.appobjects.PaymentAppObject;
import guterres.adriano.ressources.Report;
import guterres.adriano.ressources.ScreenShot;

public class PaymentVerificationPoints {
	
	private PaymentAppObject paymentAppObject;
	
	private WebDriver driver;
	

	private final String PRODUCT_TITLE                      = "Faded Short Sleeve T-shirts";
	
	private final String PRODUCT_IN_STOCK                   = "In stock";
	
	private final String PRODUCT_UNIT_PRICE                 = "$16.51";
	
	private final String PRODUCT_QUANTITY                   = "1";
	
	private final String PRODUCT_TOTAL_PRICE_PER_PRODUCT    = "$16.51";
	
	private final String PRODUCT_TOTAL_PRICE_ALL_PRODUCTS   = "$16.51";
	
	private final String PRODUCT_SHIPPING_PRICE             = "$2.00";
	
	private final String PRODUCT_PRICE_TOTAL_ORDER          = "$18.51";
	
	
	
	public PaymentVerificationPoints(WebDriver driver) {
		this.driver = driver;
		this.paymentAppObject = new PaymentAppObject(this.driver);		
	}
	
	
	public boolean verifyProductTitle() {
		boolean aux = false;
		
		WebElement element = this.paymentAppObject.getProductNameField();
		
		System.out.println(element.getText());

		if(element.getText().equalsIgnoreCase(this.PRODUCT_TITLE)) {
			Report.log(Status.PASS, "The title of product is correct.", ScreenShot.capture(this.driver));
			aux = true;
		}else {
			Report.log(Status.FAIL, "The title of product isn't correct.", ScreenShot.capture(this.driver));			
		}		
		return aux;		
	}
	
	
	public boolean verifyInStock() {
		boolean aux = false;
		
		WebElement element = this.paymentAppObject.getInStockField();

		if(element.getText().equalsIgnoreCase(this.PRODUCT_IN_STOCK)) {
			Report.log(Status.PASS, "The product it isn in stock.", ScreenShot.capture(this.driver));
			aux = true;
		}else {
			Report.log(Status.FAIL, "The product it isn't in stock ok.", ScreenShot.capture(this.driver));			
		}		
		return aux;
	}		
	
	public boolean verifyProductUnitPrice() {
		boolean aux = false;
		
		WebElement element = this.paymentAppObject.getUnitPriceField();

		if(element.getText().equalsIgnoreCase(PRODUCT_UNIT_PRICE)) {
			Report.log(Status.PASS, "The product price is corect.", ScreenShot.capture(this.driver));
			aux = true;
		}else {
			Report.log(Status.FAIL, "The product price isn't corect.", ScreenShot.capture(this.driver));			
		}		
		return aux;
	}
	
	public boolean verifyProductQuantity() {
		boolean aux = false;
		
		WebElement element = this.paymentAppObject.getQuantityImput();

		if(element.getAttribute("value").equalsIgnoreCase(this.PRODUCT_QUANTITY)) {
			Report.log(Status.PASS, "The quantity is corect.", ScreenShot.capture(this.driver));
			aux = true;
		}else {
			Report.log(Status.FAIL, "The quantity isn't corect.", ScreenShot.capture(this.driver));			
		}		
		return aux;
	}
	
	
		
	public boolean verifyPriceTotalPerProduct() {
		boolean aux = false;
		
		WebElement element = this.paymentAppObject.getPriceTotaPerProductlField();

		if(element.getText().equalsIgnoreCase(this.PRODUCT_TOTAL_PRICE_PER_PRODUCT)) {
			Report.log(Status.PASS, "The total price per product is corect.", ScreenShot.capture(this.driver));
			aux = true;
		}else {
			Report.log(Status.FAIL, "The total price per product isn't corect.", ScreenShot.capture(this.driver));			
		}		
		return aux;		
	}
	
	public boolean verifyPriceTotalAllProducts() {
		boolean aux = false;
		
		WebElement element = this.paymentAppObject.getTotalPriceAllProductField();

		if(element.getText().equalsIgnoreCase(this.PRODUCT_TOTAL_PRICE_ALL_PRODUCTS)) {
			Report.log(Status.PASS, "The price of all products is corect.", ScreenShot.capture(this.driver));
			aux = true;
		}else {
			Report.log(Status.FAIL, "The price of all products isn't corect.", ScreenShot.capture(this.driver));			
		}		
		return aux;		
	}	
	
	public boolean verifyShippingPrice() {
		boolean aux = false;
		
		WebElement element = this.paymentAppObject.getTotalShipingField();

		if(element.getText().equalsIgnoreCase(this.PRODUCT_SHIPPING_PRICE)) {
			Report.log(Status.PASS, "The shiping price is corect.", ScreenShot.capture(this.driver));
			aux = true;
		}else {
			Report.log(Status.FAIL, "The shiping price isn't corect.", ScreenShot.capture(this.driver));			
		}			
		return aux;
	}		
		
	public boolean verifyTotalPriceTotalOrder() {
		boolean aux = false;
		
		WebElement element = this.paymentAppObject.getTotalPriceOrderField();

		if(element.getText().equalsIgnoreCase(this.PRODUCT_PRICE_TOTAL_ORDER)) {
			Report.log(Status.PASS, "The total price wih shiping and tax is corect.", ScreenShot.capture(this.driver));
		}else {
			Report.log(Status.FAIL, "The total price wih shiping and tax isn't corect.", ScreenShot.capture(this.driver));			
		}				
		return aux;
	}		

}
