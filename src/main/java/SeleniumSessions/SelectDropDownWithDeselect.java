package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownWithDeselect {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver= new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");
		
		By element = By.xpath("//option[@value='American']/parent::select");
		WebElement ele = driver.findElement(element);
		
		Select select = new Select(ele);
		boolean isMultiple = select.isMultiple();
		System.out.println(isMultiple);
		
		if(isMultiple) {
			select.selectByValue("American");
			select.selectByValue("James's");
			select.selectByValue("Lesser");
			
		}
		
		select.deselectByVisibleText("Lesser flamingo");
		Thread.sleep(2000);
		select.deselectAll();

	}

}
