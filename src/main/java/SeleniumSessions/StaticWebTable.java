package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {
    static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		
		int rowCount = driver.findElements(By.xpath("//*[@id='customers']//tr")).size();
		
		for(int i=2; i<=rowCount;i++) {
			WebElement name=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td[2]"));
			String text= name.getText();
			System.out.println(text);
		}

	}

}
