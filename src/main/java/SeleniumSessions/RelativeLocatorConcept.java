package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		//selenium 4.x: Relativelocator : with
		
//           above
//             |
//	left<-----ele----->right
//             |
//           below
//near ele	//near should be 50pxl from the base element.
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement privacyPolicy = driver.findElement(By.xpath("//a[@class='agree']"));
		
		driver.findElement(RelativeLocator.with(By.name("agree")).toRightOf(privacyPolicy)).click();
		
		//driver.findElement(RelativeLocator.with(By.xpath("//input[@value='Continue']")).toRightOf(privacyPolicy)).click();
		
		String text = driver.findElement(RelativeLocator.with(By.xpath("//div[@class='pull-right']")).near(privacyPolicy)).getText();
        System.out.println(text);
	}

}
