package SeleniumSessions;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchRightPanelLinks {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        
		By rightPanelLinks= By.className("list-group-item");
		//List<WebElement> rightPanelLinksList= driver.findElements(rightPanelLinks);
		//System.out.println(rightPanelLinksList.size());
		
		//for(WebElement e: rightPanelLinksList) {
			//String text= e.getText();
			//System.out.println(text);
		
		ElementUtil elUtl= new ElementUtil(driver);
		int actLinksCount= elUtl.getElementCount(rightPanelLinks);
		System.out.println(actLinksCount);
		
		if(actLinksCount==13) {
			System.out.println("PASS");
		}
		
		List<String> actListText= elUtl.getElementTextList(rightPanelLinks);
		if(actListText.containsAll(Arrays.asList("Login", "Forgotten Password", "Register"))) {
			System.out.println("all the three imp links are present in right panel section");
		}
		
	}

}
