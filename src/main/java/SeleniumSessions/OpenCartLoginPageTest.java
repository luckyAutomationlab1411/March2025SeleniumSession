package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartLoginPageTest {

	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtil brUtil= new BrowserUtil();
		WebDriver driver= brUtil.initDriver("Chrome");
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String title= brUtil.getPageTitle();
		VerificationUtil.verifyEquals(title, "Account Login");
		
		By email= By.id("input-email");
	    By password = By.id("input-password");
	    
	    ElementUtil eleUtil= new ElementUtil(driver);
	    eleUtil.doSendKeys(email, "tom@gmail.com");
	    eleUtil.doSendKeys(password, "tom@123");
	    
	    Thread.sleep(5000);
	    
	    brUtil.quitBrowser();

	}

}
