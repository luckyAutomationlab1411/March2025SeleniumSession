package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrickInfoScoreCardWebTable {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		  driver = new ChromeDriver();
			driver.get("https://www.espncricinfo.com/series/major-league-cricket-2025-1481991/mi-new-york-vs-washington-freedom-29th-march-1482020/full-scorecard");
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			Thread.sleep(5000);
			
			/*
			 * String wcktaker= driver.findElement(By.
			 * xpath("//span[text()='Kunwarjeet Singh']/ancestor::td/following-sibling::td/span/span"
			 * )).getText(); System.out.println(wcktaker);
			 */	
			
			String wicketTakerName= getWicketTakerName("Kunwarjeet Singh");
			System.out.println(wicketTakerName);
			
			//span[text()='Sharad Lumba']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]
		    //bat+bowl
			
			/*
			 * List<WebElement> scoreCardList = driver.findElements(By.
			 * xpath("//span[text()='Tajinder Singh']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"
			 * )); System.out.println(scoreCardList.size());
			 * 
			 * for(WebElement e: scoreCardList) { String text= e.getText();
			 * if(text.length()!=0) { System.out.println(text); } }
			 */
			
			List<String> tajSinghScore= getScoreCardList("Tajinder Singh");
			System.out.println(tajSinghScore);
			System.out.println(tajSinghScore.size());
	}
	
	public static String getWicketTakerName(String batsmanName) {
		String wcktaker= driver.findElement(By.xpath("//span[text()='Kunwarjeet Singh']/ancestor::td/following-sibling::td/span/span")).getText();

      return wcktaker;
	}
	
	public static List<String> getScoreCardList(String batsmanName) {
		List<WebElement> scoreCardList =  driver.findElements(By.xpath("//span[text()='"+batsmanName+"']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"));
		
		List<String> scoreList = new ArrayList<String>();
		for(WebElement e: scoreCardList) {
			String text= e.getText();
			if(text.length()!=0) {
				System.out.println(text);
				scoreList.add(text);
			}
		}
		return scoreList;
		
	}

}
