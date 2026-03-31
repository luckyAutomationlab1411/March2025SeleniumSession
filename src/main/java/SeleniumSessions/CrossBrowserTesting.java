package SeleniumSessions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTesting {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		String browser= "Opera";
		
		switch(browser.toLowerCase().trim()){
			
		case "chrome":
			driver= new ChromeDriver();
			break;
		case "firefox":
			driver= new FirefoxDriver();
			break;
		case "edge":
			driver= new EdgeDriver();
			break;
		case "safari":
		    driver= new SafariDriver();
		default:
		    System.out.println("Please Pass the Correct Browser name:  "+browser);
		    throw new MyExceptions("Invalid Browser");
		}
		
		driver.get("https://www.google.com");
		String title= driver.getTitle();
		System.out.println("Page Title is :"+title);
		
		if(title.equals("Google")) {
			System.out.println("Title is Correct...PASS");
		}
		else {
			System.out.println("Title is incorrect...FAIL");
		}
		
		String pageUrl= driver.getCurrentUrl();
		System.out.println("Page URL is :"+pageUrl);
		
		if(pageUrl.contains("google")){
			System.out.println("Url is correct...PASS");
		}
		else {
			System.out.println("URL is incorrect...FAIL");
		}
		
		Thread.sleep(5000);
	
		driver.quit();
		
		

	}

}
