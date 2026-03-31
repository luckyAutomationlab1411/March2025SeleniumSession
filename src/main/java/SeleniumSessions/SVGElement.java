package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElement {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		//(//*[local-name()='svg' and @fill='none'])[1]
		
		Thread.sleep(4000);
		driver.findElement(By.name("q")).sendKeys("macbook prrof");
		driver.findElement(By.xpath("(//*[local-name()='svg' and @fill='none'])[1]")).click();
	}

}
