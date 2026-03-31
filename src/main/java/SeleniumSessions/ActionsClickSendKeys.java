package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickSendKeys {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        
		By email = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//input[@value='Login']");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(driver.findElement(email), "Lucky@gmail.com").perform();
		Thread.sleep(2000);
		act.sendKeys(driver.findElement(password), "Lucky@123").perform();
		Thread.sleep(2000);
		act.click(driver.findElement(loginBtn)).perform();
		
		//click = move to element + click on middle of the element
		//sendKeys = click + sendKeys
		//sendKeys = move to element + click on middle of the element + click

		}
	
	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}
	
	public static void doActionsSendKeys(By locator , String Value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), Value);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
