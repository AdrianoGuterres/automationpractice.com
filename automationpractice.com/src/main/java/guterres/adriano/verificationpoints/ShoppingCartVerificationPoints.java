package guterres.adriano.verificationpoints;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

import guterres.adriano.appobjects.ShoppingCartAppObject;
import guterres.adriano.ressources.*;

public class ShoppingCartVerificationPoints {
	
	private WebDriver driver;
	private ShoppingCartAppObject shoppingCartAppObjects;	
	
	
	private final String PRODUCT_TITLE                       = "Faded Short Sleeve T-shirts";
	
	private final String PRODUCT_IN_STOCK                    = "In stock";
	
	private final String PRODUCT_UNIT_PRICE                  = "$16.51";
	
	private final String PRODUCT_QUANTITY                    = "1";
	
	private final String PRODUCT_TOTAL_PRICE_PER_PRODUCT     = "$16.51";
	
	private final String PRODUCT_TOTAL_PRICE_ALL_PRODUCT     = "$16.51";
	
	private final String PRODUCT_SHIPPING_PRICE              = "$2.00";
	
	private final String PRODUCT_TOTAL_PRICE_WITHOUT_TAX     = "$18.51";	
	
	private final String PRODUCT_TOTAL_TAX                   = "$0.00";
	
	private final String PRODUCT_PRICE_WITH_SHIPPING_AND_TAX = "$18.51";
		
	
	public ShoppingCartVerificationPoints(WebDriver driver) {
		
		this.driver = driver;
		
		this.shoppingCartAppObjects = new ShoppingCartAppObject(this.driver);					
	}
	
	
	public boolean verifyProductTitle() {
		boolean aux = false;
		
		WebElement nameOfProduct = this.shoppingCartAppObjects.getProductTitleLabel();

		if(nameOfProduct.getText().equalsIgnoreCase(this.PRODUCT_TITLE)) {
			Report.log(Status.PASS, "Name of product ok.", ScreenShot.capture(this.driver));
			aux = true;
		}else {
			Report.log(Status.FAIL, "The name of product isn't ok.", ScreenShot.capture(this.driver));			
		}		
		return aux;		
	}
	
	
	public boolean verifyInStock() {
		boolean aux = false;
		
		WebElement nameOfProduct0 = this.shoppingCartAppObjects.getInStockField();

		if(nameOfProduct0.getText().equalsIgnoreCase(this.PRODUCT_IN_STOCK)) {
			Report.log(Status.PASS, "The product it isn in stock.", ScreenShot.capture(this.driver));
			aux = true;
		}else {
			Report.log(Status.FAIL, "The product it isn't in stock ok.", ScreenShot.capture(this.driver));			
		}		
		return aux;
	}	
	
	
	public boolean verifyProductUnitPrice() {
		boolean aux = false;
		
		WebElement priceOfProduct0 = this.shoppingCartAppObjects.getUnitPriceField();

		if(priceOfProduct0.getText().equalsIgnoreCase(PRODUCT_UNIT_PRICE)) {
			Report.log(Status.PASS, "The product price is corect.", ScreenShot.capture(this.driver));
			aux = true;
		}else {
			Report.log(Status.FAIL, "The product price isn't corect.", ScreenShot.capture(this.driver));			
		}		
		return aux;
	}
	
	public boolean verifyProductQuantity() {
		boolean aux = false;
		
		WebElement quantityProduct = shoppingCartAppObjects.getQuantityField();

		if(quantityProduct.getAttribute("value").equalsIgnoreCase(this.PRODUCT_QUANTITY)) {
			Report.log(Status.PASS, "The quantity is corect.", ScreenShot.capture(this.driver));
			aux = true;
		}else {
			Report.log(Status.FAIL, "The quantity isn't corect.", ScreenShot.capture(this.driver));			
		}		
		return aux;
	}
	
	
	public boolean verifyTotalPricePerProducts() {
		boolean aux = false;
		
		WebElement totalPriceProducts = this.shoppingCartAppObjects.getTotalPricePerProductField();

		if(totalPriceProducts.getText().equalsIgnoreCase(this.PRODUCT_TOTAL_PRICE_PER_PRODUCT)) {
			Report.log(Status.PASS, "The total price per product is correct.", ScreenShot.capture(this.driver));
			aux = true;
		}else {
			Report.log(Status.FAIL, "The total price per product isn't corect.", ScreenShot.capture(this.driver));			
		}		
		return aux;
	}
	
	public boolean verifyPriceTotalAllProduct() {
		boolean aux = false;
		
		WebElement totalPriceProduct = this.shoppingCartAppObjects.getTotalPriceAllProductField();

		if(totalPriceProduct.getText().equalsIgnoreCase(this.PRODUCT_TOTAL_PRICE_ALL_PRODUCT)) {
			Report.log(Status.PASS, "the total price for all products is correct.", ScreenShot.capture(this.driver));
			aux = true;
		}else {
			Report.log(Status.FAIL, "the total price for all products isn't corect.", ScreenShot.capture(this.driver));			
		}		
		return aux;		
	}	
	
	public boolean verifyShipingPrice() {
		boolean aux = false;
		
		WebElement TotalShipingLabel = this.shoppingCartAppObjects.getTotalShipingField();

		if(TotalShipingLabel.getText().equalsIgnoreCase(this.PRODUCT_SHIPPING_PRICE)) {
			Report.log(Status.PASS, "The shiping price is corect.", ScreenShot.capture(this.driver));
			aux = true;
		}else {
			Report.log(Status.FAIL, "The shiping price isn't corect.", ScreenShot.capture(this.driver));			
		}				
		return aux;
	}	
	
	public boolean verifyTotalPriceWithoutTax() {
		boolean aux = false;
		
		WebElement TotalPriceWhithoutTaxLabel = this.shoppingCartAppObjects.getTotalPriceWhithoutTaxField();

		if(TotalPriceWhithoutTaxLabel.getText().equalsIgnoreCase(this.PRODUCT_TOTAL_PRICE_WITHOUT_TAX)) {
			Report.log(Status.PASS, "The total price without tax is corect.", ScreenShot.capture(this.driver));
			aux = true;
		}else {
			Report.log(Status.FAIL, "The total price without tax isn't corect.", ScreenShot.capture(this.driver));			
		}			
		return aux;
	}
	
	public boolean verifyTotalTax() {
		boolean aux = false;
		
		WebElement TotalTaxLabel = this.shoppingCartAppObjects.getTotalTaxField();

		if(TotalTaxLabel.getText().equalsIgnoreCase(this.PRODUCT_TOTAL_TAX)) {
			Report.log(Status.PASS, "The total tax is corect.", ScreenShot.capture(this.driver));
			aux = true;
		}else {
			Report.log(Status.FAIL, "The total tax isn't corect.", ScreenShot.capture(this.driver));			
		}				
		return aux;
	}
	
	public boolean verifyTotalPriceWithShipingAndTax() {
		boolean aux = false;
		
		WebElement TotalPrice = this.shoppingCartAppObjects.getTotalPriceField();

		if(TotalPrice.getText().equalsIgnoreCase(this.PRODUCT_PRICE_WITH_SHIPPING_AND_TAX)) {
			Report.log(Status.PASS, "The total price wih shiping and tax is corect.", ScreenShot.capture(this.driver));
		}else {
			Report.log(Status.FAIL, "The total price wih shiping and tax isn't corect.", ScreenShot.capture(this.driver));			
		}
				
		return aux;
	}	
	

}
