package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframeHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {


		driver = new ChromeDriver();//browser
		driver.get("https://selectorshub.com/iframe-scenario/");
		
		Thread.sleep(3000);
		
		driver.switchTo().frame("pact1");//frame1
		driver.findElement(By.id("inp_val")).sendKeys("selenium");

		driver.switchTo().frame("pact2");//frame2
		driver.findElement(By.id("jex")).sendKeys("Testing");
		
		driver.switchTo().frame("pact3");//frame3
		driver.findElement(By.id("glaf")).sendKeys("Automation");
		
		//f3->f2
		//driver.switchTo().parentFrame();//f2
		//driver.findElement(By.id("jex")).sendKeys("playright");
		
		//f2->f1
		//driver.switchTo().parentFrame();//f1
		//driver.findElement(By.id("inp_val")).sendKeys("cypress");
		
		//f1->mainPage
		//driver.switchTo().defaultContent();
		//String header = driver.findElement(By.tagName("h3")).getText();
		//System.out.println(header);
		
		//f3->f1: not allowed
		//driver.switchTo().frame("pact1");//f1
		//driver.findElement(By.id("inp_val")).sendKeys("Naveen");
		
		//f3->f2 without using parentFrame():not allowed
		//driver.switchTo().frame("pact2");//frame2
		//driver.findElement(By.id("jex")).sendKeys("Manual Testing");
		
		//f3->: using default content:--> main page
		driver.switchTo().defaultContent();
		String header = driver.findElement(By.tagName("h3")).getText();
		System.out.println(header);
		
		//page-->f1: switchTo.frame1
		//f1->f2: switchTo.frame2
		//f2->f3: switchTo.frame3
		//f3->f2: switchTo.parentFrame
		//f2->f1: switchTo.parentFrame
		//f1->page:switchTo.defaultContent
		//page->f3: page->f1->f2->f3
		//f3->page: switchTo.defaultContent
		
		
		
	}
		

}
