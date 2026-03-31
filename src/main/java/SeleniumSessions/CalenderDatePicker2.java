package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderDatePicker2 {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//div[contains(@class,'dateHighlight')]")).click();
		
		selectFutureDate("August 2026", 31);

	}
	
	public static void selectFutureDate(String expMonthYear, int date) {
		if(expMonthYear.contains("February") && date>29) {
			System.out.println("wrong date is passed, plz pass the date b/w 1 to 29 for Feb Month..."+ date);
			throw new RuntimeException("Invalid Date");
		}
		
		if(date>31) {
			System.out.println("wrong date is passed, plz pass the date b/w 1 to 31 for Feb Month..."+ date);
			throw new RuntimeException("Invalid Date");
		}
		
		if(date<=0) {
			System.out.println("wrong date is passed, plz pass the date b/w 1 to 31 for Feb Month..."+ date);
			throw new RuntimeException("Invalid Date");
		}
		
		String actMonthYear = driver.findElement(By.xpath("//div[contains(@class,'monthYearHoliday')]")).getText();
		while(!actMonthYear.equalsIgnoreCase(expMonthYear)) {
			driver.findElement(By.xpath("//div[contains(@class,'monthArea')]/child::i[contains(@aria-label,'Next month')]")).click();
			actMonthYear = driver.findElement(By.xpath("//div[contains(@class,'monthYearHoliday')]")).getText();
		}
		selectDate(date);
	}
	
	public static void selectDate(int date) {
		driver.findElement(By.xpath("//span[text()="+date+"]")).click();
	}

}
