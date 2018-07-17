package guterres.adriano.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import guterres.adriano.ressources.NavigationTools;

public class ConfirmOrderAppObject {
	
	private WebDriver driver;
	
	
	public ConfirmOrderAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getTipePaymentField() {
		//return this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/div/h3"));
		
		WebElement element = NavigationTools.waitForClickability(this.driver, By.xpath("//*[@id=\"center_column\"]/form/div/h3"));
		return element;		
	}
	
	public WebElement getIconfirmMyOrderButton() {
		//return this.driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span"));
		WebElement element = NavigationTools.waitForClickability(this.driver, By.xpath("//*[@id=\"center_column\"]/form/div/h3"));
		return element;
	}

}
