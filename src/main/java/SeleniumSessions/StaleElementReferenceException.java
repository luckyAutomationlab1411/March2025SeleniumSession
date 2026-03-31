package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");//DOM V1
		
		By emailId = By.id("input-email");
		
		//DOM V1
		WebElement usernameEle = driver.findElement(emailId);
		
		//DOM V1
		usernameEle.sendKeys("lucky@gmail.com");
		
        driver.navigate().refresh();//back and forward ,internal refresh
        
        //recreate the element
        usernameEle = driver.findElement(emailId);
        
        //DOM V2 --> DOM V2
        usernameEle.sendKeys("tom@gmail.com");
	}

}
