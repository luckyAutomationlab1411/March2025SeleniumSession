package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlashtheElementUsingJSExecutor {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("http://classic.crmpro.com/");
		
		WebElement username = driver.findElement(By.name("username"));
		flash(username);
		username.sendKeys("Luckysuperstar");

	}
	
	public static void flash(WebElement element) {
		String bgcolor = element.getCssValue("backgroundColor");//grey
		for(int i=0; i<100; i++) {
			changeColor("rgb(0,200,0)", element);//green
			changeColor(bgcolor, element);//2
		}
	}
	
	public static void changeColor(String color, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			
		}
	}

}
