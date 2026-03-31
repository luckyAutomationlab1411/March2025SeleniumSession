package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement returns = driver.findElement(By.linkText("Returns"));
		
		WebElement email = driver.findElement(By.id("input-email"));
		
		//String title = js.executeScript("return document.title").toString();
		//System.out.println(title);
		
		//driver.quit();
		
		
		//1.get the title of page
		//js.executeScript("return document.title").toString();
		
		//2.get the url of page
		//js.executeScript("return document.url").toString();
		
		//3.Refresh the Browser
		//js.executeScript("history.go(0)");
		
		//4.navigate back the page
		//js.executeScript("history.go(-1)");
		
		//5.navigate forward the page
		//js.executeScript("history.go(1)");
		
		//6.generate the alert
		//js.executeScript("alert('" + message + "'t)");// need to provide the message
		
		//7.clicking on the webElement
		//js.executeScript("argument[0].click();", element);
		
		//8.capture whole text of entire page
		//js.executeScript("return document.documentElement.innerText;").toString();
		
		//9.scrolling page down
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		//9.scrolling page up
		//js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		
		//10.scroll page down to a specific height
		//js.executeScript("window.scroll(0, '" + height + "')"); need give the height range
		//js.executeScript("window.scroll(0, 400)"); Regular expression
		
		//11.scroll to specific element
		//js.executeScript("arguments[0].scrollIntoView(true);", returns); need to pass the webElement
		
		//draw border of the element
		//js.executeScript("arguments[0].style.border='5px solid yellow'", email); need to pass the webElement
		
		
	}

}
