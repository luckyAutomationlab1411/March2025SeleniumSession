package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomChromeSetting {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.get("chrome://settings/");
		
		Thread.sleep(4000);
		
		String script = "return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\");";
		
        JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//DOM element --->WebElement
		WebElement search = (WebElement)js.executeScript(script);
		
		search.sendKeys("notification");

	}

}
