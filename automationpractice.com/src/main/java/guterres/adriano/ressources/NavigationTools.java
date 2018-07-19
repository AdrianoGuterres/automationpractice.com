package guterres.adriano.ressources;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigationTools {

	public static void moveToElementByXpath(WebDriver driver, By locator) {	

		WebElement element = driver.findElement(locator);
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();		
	}	
	
	public static void moveToElementByXpath(WebDriver driver, String xpath) {	

		WebElement element = driver.findElement(By.xpath(xpath));
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();		
	}	
	
	
	public static void moveToElement(WebDriver driver, WebElement element) {	
		JavascriptExecutor executor =(JavascriptExecutor)driver; 
		
		 executor.executeScript ("arguments [0] .scrollIntoView ();", element);	
	}	


	public static WebElement waitForClickability(WebDriver driver, By locator) {

		WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(locator));

		return element;
	}

	public static void highLightElement(WebDriver driver, WebElement element) {

		JavascriptExecutor executor=(JavascriptExecutor)driver; 

		executor.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 5px solid red;');", element);

	}
	
	public static void endHighLightElement(WebDriver driver, WebElement element) {

		JavascriptExecutor executor=(JavascriptExecutor)driver; 

		executor.executeScript("arguments[0].setAttribute('style','border: solid 0.1px grey; border-collapse: collapse;');", element); 

	}	

}
