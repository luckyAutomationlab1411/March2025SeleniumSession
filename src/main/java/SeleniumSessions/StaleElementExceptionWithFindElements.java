package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementExceptionWithFindElements {

	static WebDriver driver;
	
	//if your element or elements is getting stale, you should re-initialize the element/elements.
	
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		
		Thread.sleep(5000);
		
		JavaScriptUtil js =new JavaScriptUtil(driver);
		js.scrollPageDown();
		
		Thread.sleep(5000);
		
		//DOM V1
		List<WebElement> footerList = driver.findElements(By.xpath("//footer//a"));
		System.out.println(footerList.size());
		
		for(int i=2; i<=8; i++) {
			footerList.get(i).click();
			driver.navigate().back();
			//DOM V2
			footerList = driver.findElements(By.xpath("//footer//a"));
			
		}
	}

}
