package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleBrowserWindowHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/en/contact-sales");//parent window
		
		String parentWindowID = driver.getWindowHandle();
		
		WebElement fbEle = driver.findElement(By.xpath("//img[@alt='facebook logo']"));
		WebElement linkEle = driver.findElement(By.xpath("//img[@alt='linkedin logo']"));
		WebElement ytEle =driver.findElement(By.xpath("//img[@alt='youtube logo']"));
		
	    Thread.sleep(3000);
		
		fbEle.click();
		linkEle.click();
		ytEle.click();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
		while(it.hasNext()) {//hasNext(): it will check the next segement.
			String windowID = it.next();
			driver.switchTo().window(windowID);
			System.out.println(driver.getCurrentUrl() + " : "+driver.getTitle());
			
			if(!windowID.equals(parentWindowID)) {
				driver.close();
			}
			
			Thread.sleep(3000);
	   }
		
		driver.switchTo().window(parentWindowID);
		System.out.println(driver.getTitle());
		driver.findElement(By.id("Form_getForm_FullName")).sendKeys("Test Automation");
		
	}

}
