package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCustomSendKeys {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By firstname= By.id("input-firstname");
		ElementUtil eleUtil= new ElementUtil(driver);
		eleUtil.doMultipleSendKeys(firstname, "Naveen"," ","Automation"," ","labs"," ","Lucky");
		
		//sendKeys
		//Single value-allowed
		//multiple values-allowed
		//String, SB, SBF-allowed
		//space-allowed
		//null-not allowed

	}

}
