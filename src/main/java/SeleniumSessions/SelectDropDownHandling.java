package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandling {
	
	static WebDriver driver;

	public static void main(String[] args) {

        //htmltag:<select/>
	    //class: select class in selenium to handle select drop down
		//select(Parent)---option(child)
		//if select html tag is not present, then we can not use select class
		
		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales");
		
		By country = By.id("Form_getForm_Country");
		By employee= By.id("Form_getForm_NoOfEmployees");
		
		/*
		 * WebElement countryEle = driver.findElement(country);
		 * 
		 * Select select_country = new Select(countryEle);
		 * 
		 * select_country.selectByIndex(5);
		 * select_country.selectByVisibleText("Afghanistan");
		 * select_country.selectByValue("India");
		 * 
		 * //month: 1 to 12: jan to dec
		 * 
		 * WebElement employeeEle = driver.findElement(employee); Select
		 * select_employeee = new Select(employeeEle);
		 * select_employeee.selectByVisibleText("11 - 50");
		 * select_employeee.selectByValue("51 - 200");
		 */
		
		//doSelectByIndex(country, 5);
		//doSelectByIndex(employee, 2);
		
		doSelectByVisisbleText(country, "India");
		doSelectByVisisbleText(employee, "11 - 50");
		

	}
	public static void doSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void doSelectByVisisbleText(By locator, String eleText) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(eleText);
	}
	
	public static void doSelectByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
