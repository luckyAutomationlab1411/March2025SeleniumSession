package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDropDownWithoutSelectClass {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		//1.select tag drop down
		//2.select the value from drop down without using select class and it's methods.
		
		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales");
		
		By countryListOptions = By.xpath("//select[@id='Form_getForm_Country']//option");
		By employeeListOptions = By.xpath("//select[@id='Form_getForm_NoOfEmployees']//option");
		
		
		/*
		 * List<WebElement> optionList=driver.findElements(countryListOptions);
		 * 
		 * System.out.println(optionList.size());
		 * 
		 * for(WebElement e: optionList) { String text = e.getText();
		 * if(text.contains("India")) { e.click(); break; }
		 * 
		 * }
		 */
		
		SelectdropDownValueWithoutSelectClass(countryListOptions, "India");
		SelectdropDownValueWithoutSelectClass(employeeListOptions, "51 - 200");
		
	}
	
	public static void SelectdropDownValueWithoutSelectClass(By locator, String value) {
      
		List<WebElement> optionList=driver.findElements(locator);
		
		System.out.println(optionList.size());
		
		for(WebElement e: optionList) {
			String text = e.getText();
			if(text.contains(value)) {
				e.click();
				break;
			}
			
		}
	}

}
