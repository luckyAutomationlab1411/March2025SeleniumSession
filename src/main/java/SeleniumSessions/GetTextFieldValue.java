package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFieldValue {

	static WebDriver driver;
	
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        
		//driver.findElement(By.id("input-email")).sendKeys("tom@gmail.c om");
		//driver.findElement(By.id("input-email")).getDomProperty("value");//tom@gmail.com
		
		By emailId= By.id("input-email");
		getElement(emailId).sendKeys("tom@gmail.com");
		String text=  getElementDOMPropertyValue(emailId, "value");
		System.out.println(text);
		
		String placeHolderVal= getElementDOMAtrributeValue(emailId, "placeholder");
		System.out.println(placeHolderVal);
	}
	
	public static String getElementDOMAtrributeValue(By locator, String attrName) {
		return getElement(locator).getDomAttribute(attrName);
	}
	
	public static String getElementDOMPropertyValue(By locator, String propName) {
		return getElement(locator).getDomProperty(propName);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
