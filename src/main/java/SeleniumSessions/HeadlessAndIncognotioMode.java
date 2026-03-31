package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessAndIncognotioMode {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		//headless: no browser is launched
		//testing is happening behind the scene
		//adv:
		      //1.speed
		      //2.useful in CI CD pipeline--linux machine/docker
		
		
		//1.Chrome:Headless
		//ChromeOptions co = new ChromeOptions();
		//co.addArguments("--headless");
		//driver = new ChromeDriver(co);
		
		//2.Firefox:Headless
		//FirefoxOptions fo = new FirefoxOptions();
		//fo.addArguments("--headless");
		//driver = new FirefoxDriver(fo);
		
		//3.Chrome:Incognito
		//ChromeOptions co = new ChromeOptions();
		//co.addArguments("--incognito");
		//driver = new ChromeDriver(co);
		
		//3.Firefox:Incognito
		//FirefoxOptions fo = new FirefoxOptions();
		//fo.addArguments("--incognito");
		//driver = new FirefoxDriver(fo);
		
		//4.Chrome: Headless with Incognito
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
		co.addArguments("--incognito");
		driver = new ChromeDriver(co);
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		//edge -- open in the incognito mode --find out the switch for age: in Private
		//Safari does not support headless mode.

	}

}
