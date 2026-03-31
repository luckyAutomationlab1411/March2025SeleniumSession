package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		

         //Create a WebElement + perform action(click, sendKeys, getText, isDisplayed)
		
		//1st:-----
		//driver.findElement(By.id("input-email")).sendKeys("tom@gmail.com");
		//driver.findElement(By.id("input-password")).sendKeys("tom@123");// findElement is coming from SearchContext(I)
		
		//2nd:-----
		//WebElement emailEle= driver.findElement(By.id("input-email"));
		//WebElement pwdEle= driver.findElement(By.id("input-password"));
		
		//emailEle.sendKeys("tom@gmail.com");
		//pwdEle.sendKeys("tom@123");
		
		//3rd:By locator-----
		//By email= By.id("input-email");
		//By password = By.id("input-password");
		
		//WebElement emailEle= driver.findElement(email);
		//WebElement pwdEle= driver.findElement(password);
		
		//emailEle.sendKeys("tom@gmail.com");
		//pwdEle.sendKeys("tom@123");
		
		//4th: By locator + generic Util(Method)
		//By email= By.id("input-email");
		//By password = By.id("input-password");
		
		//getElement(email).sendKeys("tom@gmail.com");
		//getElement(password).sendKeys("tom@123");
		
		//5th:By locator + generic Util(Method) , sendKeys
		//By email= By.id("input-email");
		//By password = By.id("input-password");
		
		//doSendKeys(email, "tom@gmail.com");
		//doSendKeys(password, "tom@123");
		
		//6th:locator + generic Util(Method)- getElemet(), doSendKeys() in ElemetUtil class
		By email= By.id("input-email");
	    By password = By.id("input-password");
	    
	    ElementUtil eleUtil= new ElementUtil(driver);
	    eleUtil.doSendKeys(email, "tom@gmail.com");
	    eleUtil.doSendKeys(password, "tom@123");

	}
	
	/* for 5th approach
	 * public static WebElement getElement(By locator) { return
	 * driver.findElement(locator); }
	 * 
	 * public static void doSendKeys(By locator, String value) {
	 * getElement(locator).sendKeys(value); }
	 */

}
