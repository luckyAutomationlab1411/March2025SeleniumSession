package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopUpAlertHandle {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//driver.switchTo().alert();//without clicking alert if you are switching you will get "NoAlertPresentException"
		
		//js pop up: alert, prompt, confirm
		//alert API
		
		//1.alert:
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(4000);
		
		Alert alert = driver.switchTo().alert();// Alert is Interface: return type is alert.
		
		String text = alert.getText();
		System.out.println(text);
		
		alert.accept();//click on ok button: to accept the alert
		alert.dismiss();//cancel the alert
		
		//if you are accepting the alert and then cancel the alert then in that case you will get "NoAlertPresentException"
		
		
		//2.confirm:
		
		//driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		//Thread.sleep(4000);
		
		//Alert alert = driver.switchTo().alert();
		//String text = alert.getText();
		//System.out.println(text);
		
		//alert.accept();//accept the alert
		//alert.dismiss();//dismiss the alert
		
		
		//3.prompt:
		
		//driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		//Thread.sleep(4000);
		
		//Alert alert = driver.switchTo().alert();
		//String text = alert.getText();
		//System.out.println(text);
		
		//alert.sendKeys("LuckyAutomation");
		//Thread.sleep(4000);
		//alert.accept();//click on ok
		//alert.dismiss();//click on cancel
		

	}

}
