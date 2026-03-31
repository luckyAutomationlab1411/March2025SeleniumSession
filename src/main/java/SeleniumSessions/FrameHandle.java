package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {
	
	static WebDriver driver;

	public static void main(String[] args) {


		driver = new ChromeDriver();//browser
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");//page
		
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("main");
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='top.html']")));//frame
		
		String frame = driver.findElement(By.tagName("h2")).getText();
		
		System.out.println(frame);

	}

}
