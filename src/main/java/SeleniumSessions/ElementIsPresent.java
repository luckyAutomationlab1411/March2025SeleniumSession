package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsPresent {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By emailId= By.id("input-email");
		By forgotPwdLink= By.linkText("Forgotten Password");
		// if the locator is wrong , it will give the size= 0
		/*
		 * List<WebElement> eleList= driver.findElements(emailId);// size = 0; []
		 * System.out.println(eleList.size()); if(eleList.size()==1) {
		 * System.out.println("element is present on the Page"); }else {
		 * System.out.println("element is not present on the page"); }
		 */
		
		if(isElementExist(emailId)) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		if(isElementExist(forgotPwdLink, 2)) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
	}
		
		
	
	public static boolean isElementExist(By locator) {//for single webelement
		if(driver.findElements(locator).size()==1) {
			System.out.println("the element : "+ locator + " is present on the page one time");
			return true;
		}
		else {
			System.out.println("the element : "+ locator + " is not present on the page one time");
			return false;
		}
	}
	
	public static boolean isElementExist(By locator , int expectedCount) {// for multiple webelement 
		if(driver.findElements(locator).size()==expectedCount) {
			System.out.println("the element : "+ locator + " is present on the page one time" +expectedCount+ " times");
			return true;
		}
		else {
			System.out.println("the element : "+ locator + " is present not on the page one time" +expectedCount+ " times");
			return false;
		}
	}

}
