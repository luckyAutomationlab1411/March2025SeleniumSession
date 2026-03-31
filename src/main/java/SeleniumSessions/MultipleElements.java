package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {
	
	static WebDriver driver;

	public static void main(String[] args) {
		//fetch toatal number of links on the page
		//then print the text of each links on the console
		
		//links--=htmltag:<a>
		
		driver= new ChromeDriver();
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.get("https://www.amazon.in");
		
		List<WebElement> linkList= driver.findElements(By.tagName("a"));
		//it is dynamic array not static, elements are changing randomly
		int totalLinks= linkList.size();
		System.out.println("toatl links: " +totalLinks);
		
		/*
		 * for(int i=0; i<totalLinks; i++) { String text= linkList.get(i).getText();
		 * if(text.length()!=0) { System.out.println(text); } System.out.println(text);
		 * }
		 */
		
		for(WebElement e:linkList) {
			
			String text = e.getText();
			if(text.length()!=0) {
				System.out.println(text);
			}
					
			
		}
		
		//total number of images on the page:
		List<WebElement> imgList= driver.findElements(By.tagName("img"));
		int imgCount= imgList.size();
		System.out.println("total number of images: "+ imgCount);
		
		

	}

}
