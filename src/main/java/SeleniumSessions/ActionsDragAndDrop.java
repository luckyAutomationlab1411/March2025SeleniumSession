package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;



public class ActionsDragAndDrop {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		//Drag & Drop is: webElement to webElement
		// Actions need to perform
		//1. click & hold
		//2. moveToElement
		//3.drop
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement sourceEle = driver.findElement(By.id("draggable"));
		WebElement targetEle = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
	    //Action action = act.clickAndHold(sourceEle).moveToElement(targetEle).release().build();
	    //action.perform();
		
		act.dragAndDrop(sourceEle, targetEle).perform();
	    
	    //return type of build(): Action(I)
	    //return type of perform(): void
		

	}
	
	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}
	
	public static void doActionsSendKeys(By locator , String Value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), Value);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
