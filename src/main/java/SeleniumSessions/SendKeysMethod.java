package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//String emailID= "naveen@gmail.com";
		//StringBuilder emailBuilder= new StringBuilder("tom@gmail.com");
		//StringBuffer emailBuffer= new StringBuffer("test@gmail.com");
		
		//driver.findElement(By.id("input-email")).sendKeys(emailBuilder,emailBuffer,emailID);
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		String intialName= "Naveen ";
		String middleName= "AutomationLabs ";
		String lastName= "Labs ";
		
		driver.findElement(By.id("input-firstname")).sendKeys(intialName," ",middleName," ",lastName);
		
		//null is not allowed
		//driver.findElement(By.id("input-lastname")).sendKeys(null);	// it will throw IllegalArgumentException
		By lastname= By.id("input-lastname");
		ElementUtil eleUtil= new ElementUtil(driver);
		eleUtil.doSendKeys(lastname, null);
		

	}

}
