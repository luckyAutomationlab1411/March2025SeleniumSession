package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomInsideFrame {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/shadow-dom-in-iframe");
		
		Thread.sleep(4000);
		
		// handling shadow element: it should be open state
		//Browser ---> Page ---> iframe ---> Shadow Dom ---> element
		
		driver.switchTo().frame("pact");
		
		String script = "return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\");";
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//DOM element --->WebElement
		WebElement teaname = (WebElement)js.executeScript(script);
		
		teaname.sendKeys("masala tea");
		
		

	}

}
