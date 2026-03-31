package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import static org.openqa.selenium.support.locators.RelativeLocator.with;;

public class RelativeLocatorWebTable {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		//RelativeLocator syntax: driver.findElement(RelativeLocator.with(By.loctor).above(WebElement));
		
		 //selectUserName("Joe.Root");
		WebElement usernameEle = driver.findElement(By.linkText("Joe.Root"));
		String abovePlayer = driver.findElement(with(By.tagName("a")).above(usernameEle)).getText(); //with method is imported above
		System.out.println(abovePlayer);
		
		String belowPlayer = driver.findElement(with(By.tagName("a")).below(usernameEle)).getText();//with method is imported above
		System.out.println(belowPlayer);
		
		String rightUserROle = driver.findElement(with(By.tagName("td")).toRightOf(usernameEle)).getText();//with method is imported above
		System.out.println(rightUserROle);
		
		List<WebElement> belowLinks = driver.findElements(with(By.tagName("a")).below(usernameEle));//with method is imported above
		System.out.println(belowLinks.size());
		
		for(WebElement e: belowLinks) {
			System.out.println(e.getText());
		}
	}

	
	public static void selectUserName(String username) {
        WebElement usernameEle = driver.findElement(By.linkText(username));//with method is imported above
		driver.findElement(with(By.name("chkSelectRow[]")).toLeftOf(usernameEle)).click();
		}
}
