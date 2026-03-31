package SeleniumSessions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForFrame {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();// browser
		driver.get("https://formsite.com/templates/registration-form-templates/vehicle-registration-form/");

		By image = By.xpath("//img[@title='Vehicle-Registration-Forms-and-Examples']");

		ElementUtil ele = new ElementUtil(driver);
		ele.waitForElementVisible(image, 10).click();

		// wait for the frame

		//WebElement frame1 = driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]"));

		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame1));
		 * 
		 * driver.findElement(By.xpath("//input[@name='RESULT_TextField-1']")).
		 * sendKeys("Test Automation");
		 */
		
		By frame1 = By.xpath("//iframe[contains(@id,'frame-one')]");
		boolean isFramePresent = waitForFrame(frame1, 5);
		
		if(isFramePresent) {
			driver.findElement(By.xpath("//input[@name='RESULT_TextField-1']")).sendKeys("Test Automation");
		}
	}

	public static boolean waitForFrame(By frameLocator, int timeout){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        
		try {
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
		return true;
		} catch(TimeoutException e) {
			System.out.println("frame is not present on the page");
			return false;
		}
	}
		
		public static boolean waitForFrame(int frameIndex, int timeout){
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
	        
			try {
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
			return true;
			} catch(TimeoutException e) {
				System.out.println("frame is not present on the page");
				return false;
			}
		}
		
		public static boolean waitForFrame(String frameName, int timeout){
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
	        
			try {
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameName));
			return true;
			} catch(TimeoutException e) {
				System.out.println("frame is not present on the page");
				return false;
			}
			
		}
		
		

}
