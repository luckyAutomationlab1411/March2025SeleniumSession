package SeleniumSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementUtil {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By links= By.tagName("a");
		By images= By.tagName("img");
		
		int totalLinks= getElementCount(links);
		int totalimages= getElementCount(images);
		
		System.out.println("total link : " + totalLinks);
		System.out.println("total images : " + totalimages);
		
		List<String> actualLinkTextList= getElementTextList(links);
		
		for(String e: actualLinkTextList) {
			System.out.println(e);
		}
		
		if(actualLinkTextList.contains("Login")) {
			System.out.println("login is present --PASS");
		}
		
		if(actualLinkTextList.contains("Register")) {
			System.out.println("Register is present --PASS");
		}
		
		List<String> expList= Arrays.asList("Login", "Register", "Newsletter", "Order History", "About Us");
		
		if(actualLinkTextList.containsAll(expList)) {
			System.out.println("All the imp links are present on the Page");
			
		}

	}
	
	public static List<String> getElementTextList(By locator) {
		List<WebElement> eleList= getElements(locator);
		
		List<String> eleTextList= new ArrayList<String>();//pc=0, vc=10
		
		for(WebElement e : eleList) {
			String text= e.getText();
			if(text.length()!=0) {
				eleTextList.add(text);
			}
		}
		return eleTextList;
	}
	
	public static int getElementCount(By locator) {
		return getElements(locator).size();
	}
	
	public static List<WebElement> getElements(By locator){
		return driver.findElements(locator);
	}

}
