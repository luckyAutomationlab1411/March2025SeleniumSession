package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasics {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		//Return type is Void
		//Without Protocol(Https): InvalidArgumentException
		//without www will lunch Browser
		driver.get("https://www.google.com");
		String title= driver.getTitle();//Return Type String
		System.out.println("Page title is : "+title);
		
		if(title.equalsIgnoreCase("google")) {
			System.out.println("Title is correct...PASS");
		}
		else {
			System.out.println("Title is incorrect...FAIL");
		}
		
		Thread.sleep(5000);
		driver.quit();
		
		


	}

}
