package guterres.adriano.ressources;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class NavigationTools {

	public static void moveToElementByXpath(WebDriver driver, String xpath) {	

		WebElement element = driver.findElement(By.xpath(xpath));
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();		
	}	
 
}
