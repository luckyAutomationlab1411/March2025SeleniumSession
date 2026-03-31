package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGGraphHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		
		Thread.sleep(6000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		
		String svgxpath = "//*[local()-name='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='path']";

		List<WebElement> stateList = driver.findElements(By.xpath(svgxpath));
		
		System.out.println(stateList);
		
		Actions act = new Actions(driver);
		
		for(WebElement e : stateList) {
			act.moveToElement(e).pause(5000).perform();
			String statename = e.getAttribute("name");
			System.out.println(statename);
			if(statename.contains("Maryland")) {
				e.click();
			}
			
		}
	}

}
