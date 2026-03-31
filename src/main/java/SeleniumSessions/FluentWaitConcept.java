package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		// Wait(I) : until()
		// FluentWait (C): until(){} + other methods
		// WebDriverWait (c) : no methods + can inherit from FluentWait

		// Default polling time is : 500ms

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com");

		By username = By.name("username");

		// wait is written with fluent wait features

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class)
				.withMessage("=====ELEMENT IS NOT PRESENT ON THE PAGE=====");

		WebElement usernameEle = wait.until(ExpectedConditions.visibilityOfElementLocated(username));
		usernameEle.sendKeys("uiautomation");

		// wait is written with fluent wait features
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 * wait.pollingEvery(Duration.ofSeconds(2))
		 * .ignoring(NoSuchElementException.class)
		 * .ignoring(StaleElementReferenceException.class)
		 * .withMessage("======Element not Present on the Page======");
		 * 
		 * WebElement usernameEle =
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(username));
		 * usernameEle.sendKeys("uiautomation");
		 */

	}

	public static WebElement waitForElementVisibleWithFluentWait(By locator, int timeout, int pollingtime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofSeconds(pollingtime)).ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class)
				.withMessage("=====ELEMENT IS NOT PRESENT ON THE PAGE=====");

		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}

}
