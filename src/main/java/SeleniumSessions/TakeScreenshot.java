package SeleniumSessions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		// 1. Capture screenshot and store it as a file
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		// 2. Define the destination path where screenshots will be stored
		File destfile = new File("C:\\Users\\priya\\eclipse-workspace\\Marc2025SeleniumSessions\\screenshots\\google_homepage.png");
		
		// 3. Copy the screenshot from source to destination
		FileHandler.copy(srcFile, destfile);
		
		//4.close the browser
		driver.quit();
		

	}

}
