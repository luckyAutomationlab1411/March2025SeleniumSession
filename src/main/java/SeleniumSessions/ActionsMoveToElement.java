package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveToElement {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		/*
		 * WebElement addOns = driver.findElement(By.xpath("//div[text()='Add-ons']"));
		 * 
		 * Actions act = new Actions(driver);
		 * 
		 * //1. act.moveToElement(addOns).perform();
		 * 
		 * //2 //act.moveToElement(addOns).build().perform();
		 * 
		 * Thread.sleep(2000);
		 * 
		 * //driver.findElement(By.xpath("//div[text()='Visa Services']")).click();
		 * 
		 * driver.findElement(By.xpath("//div[text()='Taxi']")).click();
		 */
		
		
		By parentMenu = By.xpath("//div[text()='SpiceClub']");
		By childMenu = By.xpath("//div[text()='Credit Cards']");
		
		menuSubmenuHandling(parentMenu, childMenu);

	}
	
	public static void menuSubmenuHandling(By parentMenu , By childMenu) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentMenu)).perform();
		Thread.sleep(2000);
		getElement(childMenu).click();
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
