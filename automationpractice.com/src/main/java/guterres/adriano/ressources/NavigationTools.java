package guterres.adriano.ressources;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

public class NavigationTools {

	public static void moveToElementByXpath(WebDriver driver, String xpath) {	

		WebElement element = driver.findElement(By.xpath(xpath));
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();		
	}	

	
	public static WebElement waitForClickability(WebDriver driver, By locator) {
		
		WebElement element = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(locator));

		return element;
	}



}
