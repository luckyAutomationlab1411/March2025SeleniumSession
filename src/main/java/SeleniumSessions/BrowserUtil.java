package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {
	
	WebDriver driver;
	
	public WebDriver initDriver(String browserName) {
		System.out.println("browser name : "+ browserName);
		
		switch(browserName.trim().toLowerCase()) {
		case "chrome":
		     driver= new ChromeDriver();
		     break;
		case "edge":
		     driver= new EdgeDriver();
		     break;
		case "firefox":
		     driver= new FirefoxDriver();
		     break;
		case "safari":
		   driver= new SafariDriver();
		   break;
		default:
			System.out.println("Please pass the right browserName: "+ browserName);
			throw new MyExceptions("===Invalid browser===");
			}
		return driver;
	}
	
	public void launchUrl(String url) {
		System.out.println("application url : "+ url);
		if(url == null) {
			throw new MyExceptions("===invalid browser==URL can not be null");
		}
		if(url.indexOf("http") !=0) {
		   throw new MyExceptions("===invalid app url: http(s) is missing");
		}
		driver.get(url);
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}
	
	public void quitBrowser() {
		 driver.quit();
	}
	

}
