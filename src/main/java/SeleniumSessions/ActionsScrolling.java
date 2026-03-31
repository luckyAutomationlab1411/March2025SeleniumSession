package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.get("https://www.amazon.co.in");
		
		Actions act = new Actions(driver);
		
		//act.sendKeys(Keys.PAGE_DOWN).perform();//it will do partial scroll
		
		//Thread.sleep(2000);
		
		//act.sendKeys(Keys.PAGE_UP).perform();
		
		//go to the footer of the page.
		//Windows:CTRL+arrow doen/up
		
		//act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();
		
		//Thread.sleep(2000);
		
		//act.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).perform();
		
		//scroll to the element
		
		//WebElement openCart = driver.findElement(By.linkText("OpenCart"));
		//act.scrollToElement(openCart).click(openCart).perform();
		
		Thread.sleep(2000);
		
		act.
		     scrollToElement(driver.findElement(By.linkText("Careers")))
		        .click(driver.findElement(By.linkText("Help")))
		              .perform();
	

	}

}
