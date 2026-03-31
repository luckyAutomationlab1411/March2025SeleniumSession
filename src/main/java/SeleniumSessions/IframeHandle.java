package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {


		driver = new ChromeDriver();//browser
		driver.get("https://formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[@title='Vehicle-Registration-Forms-and-Examples']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));//driver is in frame
		
		driver.findElement(By.xpath("(//input[contains(@id,'RESULT_TextField-1')])[1]")).sendKeys("Test Automation");
		
		//come out to main page
		driver.switchTo().defaultContent();
		
		String header = driver.findElement(By.linkText("Vehicle Registration Form")).getText();
		
		System.out.println(header);

	}

}
