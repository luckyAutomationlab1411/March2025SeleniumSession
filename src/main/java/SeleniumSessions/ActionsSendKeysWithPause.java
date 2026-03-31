package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeysWithPause {
	
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//WebElement firstName = driver.findElement(By.id("input-firstname"));
		
		//Actions act = new Actions(driver);
		
		//String name = "Naveen Automation lab";
		
		//char value[] = name.toCharArray();
		
		//for(char ch: value) {
			//act.sendKeys(firstName, String.valueOf(ch)).pause(500).perform();
		//}
		
		By firstName = By.id("input-firstname");
		
		doSendKeysWithPause(firstName, "Lucky Automation Labs", 200);

		

	}
	
	public static void doSendKeysWithPause(By locator, String value , long pauseTime) {
		Actions act = new Actions(driver);
		
		char ch[] = value.toCharArray();
		
		for(char c : ch) {
			act.
			  sendKeys(getElement(locator), String.valueOf(c)).
			     pause(pauseTime).
			        perform();
			}
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
