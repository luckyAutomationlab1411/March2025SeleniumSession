package SeleniumSessions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrokenLinks {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://www.deadlinkcity.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links: " + links.size());

		int numOfBrokenLinks = 0;

		for (WebElement e : links) {
			String hrefAttValue = e.getAttribute("href");

			if (hrefAttValue == null || hrefAttValue.isEmpty()) {
				System.out.println("Not possible to count broken links");
			}

			try {
				URL linkURL = new URL(hrefAttValue);
				HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection();
				conn.connect();

				if (conn.getResponseCode() >= 400) {
					System.out.println(hrefAttValue + "======>Broken links");
					numOfBrokenLinks++;
				} else {
					System.out.println(hrefAttValue + "======>Not a Broken links");
				}
			} catch (Exception e1) {

			}

		}
		System.out.println("Total number of Broken links is: "+numOfBrokenLinks);

	}

}
