package guterres.adriano.testcases;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import guterres.adriano.ressources.AutomaticEmailGeneratorTool;
import guterres.adriano.ressources.DriverSetup;
import guterres.adriano.ressources.Report;
import guterres.adriano.ressources.ScreenShot;
import guterres.adriano.tasks.AddFirstProductTask;
import guterres.adriano.tasks.AddressesTasks;
import guterres.adriano.tasks.AuthenticationTask;
import guterres.adriano.tasks.BankWirePaymentTask;
import guterres.adriano.tasks.CreateAccountFormTask;
import guterres.adriano.tasks.OrderConfirmationTask;
import guterres.adriano.tasks.OrderTasks;
import guterres.adriano.tasks.PaymentTask;
import guterres.adriano.tasks.ShippingTasks;
import guterres.adriano.tasks.ShoppingCartTask;
import guterres.adriano.verificationpoints.AddFirstProductVerificationPoints;
import guterres.adriano.verificationpoints.AddressesVerificationPoints;
import guterres.adriano.verificationpoints.AuthenticationVerificationPoints;
import guterres.adriano.verificationpoints.BankWirePaymentVerificationPoints;
import guterres.adriano.verificationpoints.CreateAccountVerificationPoints;
import guterres.adriano.verificationpoints.OrderVerificationPoints;
import guterres.adriano.verificationpoints.PaymentVerificationPoints;
import guterres.adriano.verificationpoints.ShippingVerificationPoints;
import guterres.adriano.verificationpoints.ShoppingCartVerificationPoints;

public class FirefoxBuyTheFirstProductCorrectlyTestCase {
	private WebDriver driver;

	private AddFirstProductTask      addFirstProductTask;
	private ShoppingCartTask         shoppingCartTask;
	private AuthenticationTask       authenticationTask;
	private CreateAccountFormTask    createAccountFormTask;
	private AddressesTasks           addressesTasks;
	private ShippingTasks            shippingTasks;
	private PaymentTask              paymentTask;
	private BankWirePaymentTask      bankWirePaymentTask;
	private OrderTasks               orderTasks;
	private OrderConfirmationTask    orderConfirmationTask;

	private AddFirstProductVerificationPoints    addFirstProductVerificationPoints;
	private ShoppingCartVerificationPoints       shoppingCartVerificationPoints;
	private AuthenticationVerificationPoints     authenticationVerificationPoints;
	private CreateAccountVerificationPoints      createAccountVerificationPoints;
	private AddressesVerificationPoints          addressesVerificationPoints;
	private ShippingVerificationPoints           shippingVerificationPoints;
	private PaymentVerificationPoints            paymentVerificationPoints;
	private BankWirePaymentVerificationPoints    bankWirePaymentVerificationPoints;
	private OrderVerificationPoints              orderVerificationPoints;

	@Before
	public void setup() {	

		this.driver = DriverSetup.getDriverConfiguredForFirefox("http://automationpractice.com/index.php");

		this.addFirstProductTask   = new AddFirstProductTask(this.driver);
		this.shoppingCartTask      = new ShoppingCartTask(this.driver);
		this.authenticationTask    = new AuthenticationTask(this.driver);
		this.createAccountFormTask = new CreateAccountFormTask(this.driver);
		this.addressesTasks        = new AddressesTasks(this.driver);
		this.shippingTasks         = new ShippingTasks(this.driver);
		this.paymentTask           = new PaymentTask(this.driver);
		this.bankWirePaymentTask   = new BankWirePaymentTask(this.driver);
		this.orderTasks            = new OrderTasks(this.driver);
		this.orderConfirmationTask = new OrderConfirmationTask(this.driver);

		this.addFirstProductVerificationPoints   = new AddFirstProductVerificationPoints(this.driver);
		this.shoppingCartVerificationPoints      = new ShoppingCartVerificationPoints(this.driver);
		this.authenticationVerificationPoints    = new AuthenticationVerificationPoints(this.driver);
		this.createAccountVerificationPoints     = new CreateAccountVerificationPoints(this.driver);
		this.addressesVerificationPoints         = new AddressesVerificationPoints(this.driver);
		this.shippingVerificationPoints          = new ShippingVerificationPoints(this.driver);
		this.paymentVerificationPoints           = new PaymentVerificationPoints(this.driver);	
		this.bankWirePaymentVerificationPoints   = new BankWirePaymentVerificationPoints(this.driver);
		this.orderVerificationPoints             = new OrderVerificationPoints(this.driver);
	}

	@Test
	public void run () {		

		Report.startTest("(Firefox) Test Case 001: Buy the first product correctly");	
		
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		

		Report.log(Status.INFO, "The Homepage has loaded correctly ", ScreenShot.capture(this.driver));


		this.addFirstProductTask.moveTheMouseFirstProduct();		

		this.addFirstProductVerificationPoints.verifySelectFirstProduct();

		this.addFirstProductTask.clickAddToCartFirstButton();		

		this.addFirstProductVerificationPoints.verifyProceedProduct();		
		this.addFirstProductVerificationPoints.verifyProductTitle();				
		this.addFirstProductVerificationPoints.verifyProductQuantity();		
		this.addFirstProductVerificationPoints.verifyProductTotalProduct();		
		this.addFirstProductVerificationPoints.verifyProductShippingProduct();		
		this.addFirstProductVerificationPoints.verifyTotalProduct();		

		this.addFirstProductTask.clickcProceedToCheckoutButton();		

		//------------------------------------------------------------------------------------------------------------------		

		this.shoppingCartVerificationPoints.verifyProductTitle();
		this.shoppingCartVerificationPoints.verifyInStock();
		this.shoppingCartVerificationPoints.verifyProductUnitPrice();
		this.shoppingCartVerificationPoints.verifyProductQuantity();		
		this.shoppingCartVerificationPoints.verifyTotalPricePerProducts();
		this.shoppingCartVerificationPoints.verifyPriceTotalAllProduct();
		this.shoppingCartVerificationPoints.verifyShipingPrice();
		this.shoppingCartVerificationPoints.verifyTotalPriceWithoutTax();
		this.shoppingCartVerificationPoints.verifyTotalTax();		
		this.shoppingCartVerificationPoints.verifyTotalPriceWithShipingAndTax();

		this.shoppingCartTask.clickProceedCheckoutButton();

		//---------------------------------------------------------------

		this.authenticationTask.fillEmailField(AutomaticEmailGeneratorTool.gerarEmail());
		
		this.authenticationVerificationPoints.verifyUserEmail();
		this.authenticationTask.clickButtonCreateAccount();

		//----------------------------------------------------------------
		
		this.createAccountFormTask.fillFormYourPersonalInformation(true, "José", "Silva", "999888", "10", "March", "1993", true, true);		
		
		this.createAccountFormTask.fillFormYourAddress("JoseSilvaLTDA", "Nonsense Street", "building", "Iowa City", "Iowa", "55555", 
												  "United States", "Slipknot's city.", "319-5555-5555", "319-9999-5555", "Mi casa");

		this.createAccountVerificationPoints.verifyCustomerFirstlName();		
		this.createAccountVerificationPoints.verifyCustomerLastName();		
		this.createAccountVerificationPoints.verifyCustomerPassword();		
		this.createAccountVerificationPoints.verifyCustomerDayBirthday();
		this.createAccountVerificationPoints.verifyCustomerMonthBirthday();
		this.createAccountVerificationPoints.verifyCustomerYearBirthday();
		this.createAccountVerificationPoints.verifyCustomerNewsletter();
		this.createAccountVerificationPoints.verifyCustomerOffers();		
		this.createAccountVerificationPoints.verifyAddressFirstName();
		this.createAccountVerificationPoints.verifyAddressLastName();
		this.createAccountVerificationPoints.verifyAddressCompany();
		this.createAccountVerificationPoints.verifyAddressAddress();
		this.createAccountVerificationPoints.verifyAddressAddressLine2();
		this.createAccountVerificationPoints.verifyAddressCity();
		this.createAccountVerificationPoints.verifyAddressState();
		this.createAccountVerificationPoints.verifyAddressPostalCode();
		this.createAccountVerificationPoints.verifyAddressCountry();
		this.createAccountVerificationPoints.verifyAddressAdditionalInformation();
		this.createAccountVerificationPoints.verifyAddressHomePhone();
		this.createAccountVerificationPoints.verifyAddressMobilePhone();
		this.createAccountVerificationPoints.verifyAddressAliasAddress();
		
		this.createAccountFormTask.clickRegisterButton();
		
		//------------------------------------------------------------------------------------
		
		this.addressesVerificationPoints.verifyDeliveryAddressCompleteName();
		this.addressesVerificationPoints.verifyDeliveryAddressCompany();
		this.addressesVerificationPoints.verifyDeliveryAddressStreet();
		this.addressesVerificationPoints.verifyDeliveryAddressState();
		this.addressesVerificationPoints.verifyDeliveryAddressCountry();
		this.addressesVerificationPoints.verifyDeliveryAddressHomePhone();
		this.addressesVerificationPoints.verifyDeliveryAddressMobilePhone();
		
		this.addressesVerificationPoints.verifyBillingAddressCompleteName();
		this.addressesVerificationPoints.verifyBillingAddressCompany();
		this.addressesVerificationPoints.verifyBillingAddressStreet();
		this.addressesVerificationPoints.verifyBillingAddressState();
		this.addressesVerificationPoints.verifyBillingAddressCountry();
		this.addressesVerificationPoints.verifyBillingAddressHomePhone();
		this.addressesVerificationPoints.verifyBillingAddressMobilePhone();
		
		this.addressesTasks.clickProceedToCheckoutButton();
		
		//------------------------------------------------------------------------------------------
		
		this.shippingTasks.clickDeliveryRadioButton();
		this.shippingTasks.clickAgreeTermsCheckbox();
		
		this.shippingVerificationPoints.verifyAliasAddress();
		this.shippingVerificationPoints.verifyPriceShipping();
		this.shippingVerificationPoints.verifyDeliveryChooise();		
		this.shippingVerificationPoints.verifyIAgreeTerms();
		
		this.shippingTasks.clickProceedCheckout();
		
		//-------------------------------------------------------------------------------------------------
		
		
		// Falhando
	    this.paymentVerificationPoints.verifyProductDescription();
		this.paymentVerificationPoints.verifyInStock();
		this.paymentVerificationPoints.verifyProductUnitPrice();
		this.paymentVerificationPoints.verifyProductQuantity();
		this.paymentVerificationPoints.verifyPriceTotalPerProduct();
		
		this.paymentVerificationPoints.verifyPriceTotalAllProducts();
		this.paymentVerificationPoints.verifyShippingPrice();
		this.paymentVerificationPoints.verifyTotalPriceTotalOrder();
		
		this.paymentTask.clickPayBankWire();
		
		//--------------------------------------------------------------------------------------------------------
		
		this.bankWirePaymentVerificationPoints.verifyPaymentMethod();
		this.bankWirePaymentTask.IConfirmMyOrderButton();
		
		//-------------------------------------------------------------------------------------------
		
		this.orderVerificationPoints.verifyOrderNameOwner();
		this.orderVerificationPoints.verifyOrderAmount();
		this.orderVerificationPoints.verifyOrderStatus();
		
		this.orderTasks.clickBackToOrdersButton();
		
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	



		Report.log(Status.INFO, "Order history", ScreenShot.capture(this.driver));
		
	}

	@After
	public void teardown() {
		this.driver.quit();		
	}

}
