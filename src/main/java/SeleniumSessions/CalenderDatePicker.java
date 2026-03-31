package SeleniumSessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderDatePicker {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(0));
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//div[contains(@class,'dateHighlight')]")).click();
		
		String year = "2026";
		String month ="August";
		String date = "15";
		By dd = By.xpath("//ul[contains(@class,'datesWrap') and @aria-label='August 2026']//li//span");
		
		
		WebElement next_arrow = driver.findElement(By.xpath("//div[contains(@class,'monthArea')]/child::i[contains(@aria-label,'Next month')]"));
		
		  while(true) { 
			  WebElement dt_ele = driver.findElement(By.xpath("//div[contains(@class,'monthYearHoliday')]/p[contains(@class,'monthYear')]"));
			  String yrdate = dt_ele.getText(); 
			  String [] brk = yrdate.split(" ");
			  
			  
			  if(month.equalsIgnoreCase(brk[0]) & year.equals(brk[1])) {
				  break;
			  }else {
				  next_arrow.click();
			  }
		  }
		  
		  
		  
		 List<WebElement> dates = wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(dd)));
		 
		 for(WebElement ele: dates) {
			 
			String date_txt =  wait.until(ExpectedConditions.visibilityOf(ele)).getText();
			 
			 if(date.equals(date_txt)) {
				 System.out.println(date_txt);
				 ele.click();
				 break;
			 }
		 }
		 
		 
		

	}

}
