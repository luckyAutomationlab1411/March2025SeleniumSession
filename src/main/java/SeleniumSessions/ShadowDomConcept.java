package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom");
		
		Thread.sleep(4000);
		
		// handling shadow element: it should be open state
		//browser ---> page ---> shadow dom ---> shadow dom ---> element 
		
		String script = "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//DOM element --->WebElement
		WebElement pizzaname = (WebElement)js.executeScript(script);
		
		pizzaname.sendKeys("veg pizza");

	}

}
