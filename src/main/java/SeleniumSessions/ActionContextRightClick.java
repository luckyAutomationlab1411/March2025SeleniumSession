package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionContextRightClick {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act = new Actions(driver);
		
		act.contextClick(rightClick).perform();
		
		List<WebElement> contextMenu = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li"));
		
		for(WebElement e: contextMenu) {
			 String text = e.getText();
			 if(text.length()!=0) {
				 System.out.println(text);
				 if(text.contains("Copy")) {
					 e.click();
					 break;
				 }
			 }
		}
		

	}

}
