package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserWindowHandler {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales");//parent window
		
		//target='blank'---if it is there in DOM, then the webpage is having window.
		
		WebElement orangeHRM = driver.findElement(By.xpath("(//a[contains(text(),'OrangeHRM')])[7]"));
		
		Actions act = new Actions(driver);
		act.scrollToElement(orangeHRM).click(orangeHRM).perform();
		
		//1.get the window ids:
	    Set<String> windows = driver.getWindowHandles();//it is not allow duplicate
	    
	    Iterator<String> it = windows.iterator();
	    
	    String parentWindowID = it.next();
	    System.out.println("parent window id: "+parentWindowID);
		
	    String childWindowID = it.next();
	    System.out.println("parent window id: "+childWindowID);
	    
	    //2.switching work:
	    driver.switchTo().window(childWindowID);
	    System.out.println("child window title:  "+driver.getTitle());
	    
	    //close the child window:
	    driver.close();
	    
	    //driver is lost
	    
	    //come back to parent window
	    driver.switchTo().window(parentWindowID);
	    System.out.println("parent window title:  "+driver.getTitle());
	    
	    driver.findElement(By.id("Form_getForm_FullName")).sendKeys("Test Automation");
	    
	    driver.quit();

	}

}
