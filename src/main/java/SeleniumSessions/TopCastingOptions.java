package SeleniumSessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {
		
		//1.cd d= new cd
		//valid but not recommended:only Play with only one browser
		//can't use cross browser testing
		ChromeDriver driver=new ChromeDriver();
		FirefoxDriver driver1=new FirefoxDriver();
		EdgeDriver driver3 = new EdgeDriver();
		
		//2. WD d = new CD();
		//Local Testing
		//Valid and recommended: used for cross Browser Testing
		WebDriver driver4=new ChromeDriver();
		driver4= new FirefoxDriver();
		driver4= new EdgeDriver();
		
		//3.Wd d =new RWD();
		//Valid and recommended
		//Used for Running test on seenium Grid,remote,server,AWS cloud,VMs,Jenkins
		WebDriver driver5= new RemoteWebDriver(null, false);
		
		//4.SC d = new CD();
		//Valid but not recommended
		SearchContext driver6= new ChromeDriver();
		
		//5.RWD d= new CD
		//Valid but not recommended
		RemoteWebDriver driver7= new ChromeDriver();
		driver7= new FirefoxDriver();
		driver7= new EdgeDriver();
		
		//6.chd d= new cd();
		//Valid but not recommended:Used only for Chrome & Edge
		ChromiumDriver driver8= new ChromeDriver();
		driver8= new EdgeDriver();
		
		//7.SC d= new RWD();
		//Valid but not recommended
		SearchContext driver9= new RemoteWebDriver(null, false);
		

	}

}
