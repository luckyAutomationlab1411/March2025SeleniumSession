package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaitConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		//WebdriverWait(C) --> extends --> FluentWait(C)[until(){} + indv methods]-- implements-->Wait(I) - until();
		//[no methods]
		
		//explicitly wait
		  //1.can be applied for a specific element on the basis of some condition.
		  //2.no need to apply as a global wait.
		  //3.it can be applied for all the non web elements: alerts, url, title, windows
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//input[@value='Login']");
		
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 * WebElement emailEle =
		 * wait.until(ExpectedConditions.presenceOfElementLocated(email));
		 * emailEle.sendKeys("naveen@open.com");
		 * 
		 * driver.findElement(password).sendKeys("test@123");
		 * driver.findElement(loginBtn).click();
		 */
		
		waitForElementVisible(email, 10).sendKeys("naveen@gmail.com");
		getElement(password).sendKeys("test@123");
		getElement(loginBtn).click();
		

	}
	
	/*
	 * An expectation for checking that an element is present on the DOM of a page.
	 * This/ does not necessarily mean that the element is visible.
	 * 
	 * Parameters:
	 */
	
	public static WebElement waitForElementPresent(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	/*
	 * An expectation for checking that an element is present on the DOM of a page
	 * and visible. Visibility means that the element is not only displayed but also
	 * has a height and width that is greater than 0.
	 */
	
	public static WebElement waitForElementVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}

