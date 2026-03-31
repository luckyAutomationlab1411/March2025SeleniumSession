package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {
	
	static WebDriver driver;

	public static void main(String[] args) {


		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//boolean flag= 5443
		//System.out.println(flag);
		
		By email= By.id("input-email");
		boolean flag=isElementDisplayed(email);
		System.out.println(flag);

	}
	
	public static boolean isElementDisplayed(By locator) {
		try {
		    return getElement(locator).isDisplayed();
		}catch(NoSuchElementException e) {
			System.out.println("Element is not displayed on the page "+ locator);
			return false;
		}
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
