package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
        driver.get("https://www.orangehrm.com/en/contact-sales");//parent window
        
   
        
        //driver.switchTo().newWindow(WindowType.TAB);//4.xv
        
        driver.switchTo().newWindow(WindowType.WINDOW);//4.xv
        
        
        driver.get("https://google.com/");
        System.out.println(driver.getTitle());
        driver.close();
		

	}

}
