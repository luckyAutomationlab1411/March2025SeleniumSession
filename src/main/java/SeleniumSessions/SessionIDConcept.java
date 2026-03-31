package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionIDConcept {

	public static void main(String[] args) {
		
		//case1: Quit:
		
		//1.Open browser: Chrome
		WebDriver driver= new ChromeDriver();
		
		//2.enter the URL
		driver.get("https://www.google.com");//Session ID: aa08e0dba0d768704b1160c4800f9d79
		
		//3.get the page title
		String title= driver.getTitle();//Session ID: aa08e0dba0d768704b1160c4800f9d79
		System.out.println("page title : " +title);//Google
		
		//4.get the url
		String URL= driver.getCurrentUrl();//Session ID: aa08e0dba0d768704b1160c4800f9d79
		System.out.println("page url : " +URL);
		
		//quit the browser
		//driver.quit();// close the browser //Session ID: aa08e0dba0d768704b1160c4800f9d79
		//System.out.println(driver.getTitle());//Session ID= null
		//NoSuchElementException: Session ID is null. Using WebDriver after calling quit()?
		
		
		
		//close the browser
		driver.close();//close browser:
		//driver.quit();// close the browser //Session ID: aa08e0dba0d768704b1160c4800f9d79
	    //System.out.println(driver.getTitle());//Session ID will same as aa08e0dba0d768704b1160c4800f9d79 but invalid/expired
		//NoSuchElementException: Session ID is null. Using WebDriver after calling quit()?
		
		
		
		//solution of line 28&36 is , you have to initialize the driver again.
		//driver= new ChromeDriver();
		//driver.get("https://www.google.com");//New Session ID will be created.
		//System.out.println(driver.getTitle());// .
		

	}

}
