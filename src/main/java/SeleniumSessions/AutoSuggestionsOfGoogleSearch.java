package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionsOfGoogleSearch {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver= new ChromeDriver();
		driver.get("https://www.google.com");
		
		
		/*
		 * driver.findElement(By.name("q")).sendKeys("Selenium Automation");
		 * Thread.sleep(4000);
		 * 
		 * List<WebElement> suggList= driver.findElements(By.xpath(
		 * "//ul[@role='listbox']//div[@class='wM6W7d']/span"));
		 * 
		 * System.out.println(suggList.size());
		 * 
		 * for(WebElement e: suggList) { String text = e.getText();
		 * System.out.println(text); if(text.contains(" testing jobs in bangalore")) {
		 * e.click(); break; } }
		 */
		 
		
		  By searchLocator = By.name("q"); 
		  By SuggestionsLocator = By.xpath("//ul[@role='listbox']//div[@class='wM6W7d']/span");
		  
		  //doSearch(searchLocator, "Naveen Automation", SuggestionsLocator, "youtube");
		 
		
		ElementUtil ele= new ElementUtil(driver);
		ele.doSearch(searchLocator, "Naveen Automation", SuggestionsLocator, "youtube");

	}
	
	public static void doSearch(By SeachLocator, String searchKey, By suggeionsLocator, String suggestionsValue) throws InterruptedException {
		driver.findElement(SeachLocator).sendKeys(searchKey);
		Thread.sleep(4000);
		
		List<WebElement> suggList= driver.findElements(suggeionsLocator);
		
		System.out.println(suggList.size());
		
		for(WebElement e: suggList) {
			String text = e.getText();
			System.out.println(text);
			if(text.contains(suggestionsValue)) {
				e.click();
				break;
			}
		}
	}

}
