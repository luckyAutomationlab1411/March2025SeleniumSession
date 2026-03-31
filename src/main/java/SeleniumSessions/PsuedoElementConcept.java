package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PsuedoElementConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		Thread.sleep(4000);

		//Psuedo Element used with Psuedo classes
		//Psuedo class:
		// ::before ::after
		
		String script = "return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),'::before').getPropertyValue('content');";
		String script1 = "return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),'::before').getPropertyValue('color');";
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String content = js.executeScript(script).toString();//converting javascriptString to string
		System.out.println(content);
		
		if(content.contains("*")) {
			System.out.println("firstname is mandatory field");
		}else {
			System.out.println("firstname is not a mandatory field");
		}
		
		String color = js.executeScript(script1).toString();//converting javascriptString to string
		System.out.println(color);
		
		if(color.contains("rgb(255, 0, 0)")) {
			System.out.println("color is red");
		}else {
			System.out.println("color is not red");
		}
		

	}

}
