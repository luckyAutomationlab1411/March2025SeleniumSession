package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickSendKeysOnDisableElement {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver= new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		WebElement password= driver.findElement(By.id("pass"));
		//password.sendKeys("testing");//ElementNotInteractableException
		password.click();// for disable element no exception will throw.
		System.out.println(password.isEnabled());//false-not enabled
		//if element is disabled-ElementNotInteractableException---element not interactable
		
		

	}

}
