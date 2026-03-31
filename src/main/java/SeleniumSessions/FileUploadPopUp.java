package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/upload");
		//tag type= file---should be there 
		//if not you can't automate using selenium.
		
		driver.findElement(By.id("fileInput")).sendKeys("C:/Users/priya/Downloads/image001.jpg");
		
		//if type = file is not there
		//ask your dev team to add type = file
		//otherwise we can not automate this use case
		//we can use some 3rd party libs: not at all recommended
		//1.sikuli
		//2.AutoIt --3rd open source -- works only for windows OS
		//3.Robot class

	}

}
