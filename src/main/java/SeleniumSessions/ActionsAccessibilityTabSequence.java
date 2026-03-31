package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsAccessibilityTabSequence {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		WebElement firstname = driver.findElement(By.id("input-firstname"));
		
		Actions act = new Actions(driver);
		
		Action action = act.sendKeys(firstname, "Sachin")//firstName
		.pause(500)
		.sendKeys(Keys.TAB)//shift to lastName
		.sendKeys("Sharma")//lastName
		.pause(500)
		.sendKeys(Keys.TAB)//shift to e-mail
		.sendKeys("lucky@gmail.com")//e-mail
		.pause(500)
		.sendKeys(Keys.TAB)//shift to telephone
		.sendKeys("8296368418")//telephone
		.pause(500)
		.sendKeys(Keys.TAB)//shift to password
		.sendKeys("sharma@123")//password
		.pause(500)
		.sendKeys(Keys.TAB)//shift to confirm-Password
		.sendKeys("sharma@123")//confirm-password
		.pause(500)
		.sendKeys(Keys.TAB)//shift to no-radio button
		.pause(500)
		.sendKeys(Keys.TAB)//shift to privacy-policy
		.pause(500)
		.sendKeys(Keys.TAB)//shift to checkBox
		.pause(500)
		.sendKeys(Keys.SPACE)//selectCheckBox
		.pause(500)
		.sendKeys(Keys.TAB)//shift to continueButton
		.pause(500)
		.sendKeys(Keys.ENTER)//click-continue
		.build();
		
		action.perform();
				
	}

}
