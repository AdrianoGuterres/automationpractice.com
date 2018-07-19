package guterres.adriano.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

import guterres.adriano.ressources.NavigationTools;
import guterres.adriano.ressources.Report;
import guterres.adriano.ressources.ScreenShot;

public class BankWirePaymentAppObject {

	private WebDriver driver;

	public BankWirePaymentAppObject(WebDriver driver) {
		this.driver = driver;		
	}

	public WebElement getIConfirmMyOrderButton() {

		Report.log(Status.INFO, "Confirmation page", ScreenShot.capture(this.driver));

	//	WebElement element = new WebDriverWait(this.driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cart_navigation\"]/button/span")));
		WebElement element = NavigationTools.waitForClickability(this.driver, By.xpath("//*[@id=\"cart_navigation\"]/button/span"));
		return element;
	}


	public WebElement getMethodPaymentLabel() {

		//WebElement element = new WebDriverWait(this.driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"center_column\"]/form/div/h3")));

		WebElement element = NavigationTools.waitForClickability(this.driver,By.xpath("//*[@id=\"center_column\"]/form/div/h3"));
		return element;
	}

}
