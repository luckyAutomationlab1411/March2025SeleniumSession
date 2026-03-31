package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveToElementLevel4BigBasket {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {


		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		
		By shopByCategory = By.xpath("(//span[text()='Shop by'])[2]");
		By beverages = By.linkText("Beverages");
		By tea = By.linkText("Tea");
		By greenTea = By.linkText("Green Tea");
		
		/*
		 * driver.findElement(shopByCategory).click(); Thread.sleep(2000);
		 * 
		 * Actions act = new Actions(driver);
		 * act.moveToElement(driver.findElement(beverages)).perform();
		 * Thread.sleep(2000); act.moveToElement(driver.findElement(tea)).perform();
		 * Thread.sleep(2000); driver.findElement(greenTea).click();
		 */
		
		//menuSubmenuHandlingLevel4(shopByCategory, beverages, tea, greenTea);
		ElementUtil eleUtil =  new ElementUtil(driver);
		eleUtil.menuSubmenuHandlingLevel4(shopByCategory, beverages, tea, greenTea, "click");

	}
	
	public static void menuSubmenuHandlingLevel4(By menuLevel1 , By menuLevel2 , By menuLevel3 , By menuLevel4) throws InterruptedException {
		Actions act = new Actions(driver);
		driver.findElement(menuLevel1).click();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(menuLevel2)).perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(menuLevel3)).perform();
		Thread.sleep(2000);
		driver.findElement(menuLevel4).click();
	}
	
	

}
