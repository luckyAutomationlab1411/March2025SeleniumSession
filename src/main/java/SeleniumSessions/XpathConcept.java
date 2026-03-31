package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathConcept {

	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//xpath:
		//it's not an attribute
		//it is the address of the element in html DOM
		
		//1.absolute xpath:
		// /html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input
         
		//2. relative/custom xpath:
		
		//1. with single attribute
		//htmltag[@attr='value']
		//input[@name='email']
		//input[@type='text']
		//input[@id='input-email']
		//input[@placeholder='E-Mail Address']
		
		//2. with multiple attributes
		//htmltag[@attr1='value' and @attr2='value']
		//img[@title='naveenopencart' and @class='img-responsive']
		//input[@type='text' and @name='email' and @id='input-email']
		//img[@title='naveenopencart' and @class='img-responsive' and @alt='naveenopencart']
		//input[@type and @placeholder]
		//input[@type or@placeholder]
		
		//3.with the text(): button , links, para, header
		//htmltag[text()='value']
		//h2[text()='New Customer']
		//h2[text()='Returning Customer']
		//a[text()='Register']
		//a[text()='Delivery Information']
		
		//4. text() with attribute
		//htlmtag[text()='value' and @attr='value']
		//a[text()='Login' and @class='list-group-item']
		//a[text()='Register' and @class='list-group-item']
		//label[text()='E-Mail Address' and @class='control-tlabel' and @for='input-email']
		
		//5.contains() with attribute:
		//htmltag[contains(@attr,'value')]
		//input[contains(@placeholder,'E-Mail')]
		//input[contains(@placeholder,'Address')]
		
		//contains() with one attribute and another attribute without contains
		//htmltag[contains(@attr,'value') and @attr2='value']
		//input[contains(@placeholder,'E-Mail') and @name='email']
		//input[contains(@placeholder,'E-Mail') and @name='email' and @id='input-email' and @type='text']
		
		//<input> id="firstname_123" />
		//Refresh the page
		//<input> id="firstname_456" />
		//Refresh the page
		//<input> id="firstname_768" />
		//By.id("firstname_768"); //wrong way of using id, it is dynamic
		
		//then we go for contains()
		//input[contains(@id,'firstname_')]
		
		//7.contains() with text():
		//htmltag[contains(text(),'Value')]
		//h2[contains(text(),'Returning')]
		//a[contains(text(),'Forgotten')]
		
		By.xpath("//a[contains(text(),'Forgotten')]");
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
		
		//8.contains() with text() and contains with attribute:
		//htmltag[contains(text(),'value') and contains(@attr,'value')]
		//a[contains(text(),'Forgotten ') and contains(@class,'list-group-item')]
		
		//9.starts-with():
		//htmltag[starts-with(text(),'value')]
		//a[starts-with(text(),'Recurring')]
		//htmltag[starts-with(@attr,'value')]
		//input[starts-with(@placeholder,'E-Mail')]
		//input[starts-with(@placeholder,'E-Mail') and contains(@id,'email')]
		
		//10.ends-with: Not available(Removed from modern Browser)
	
		//parent to child:
		//a.direct child element: /
		//b.indirect + direct child element://
		
		//div[@class='form-group']/input[@type='password']
		//div[@class='form-group']/label[@for='input-email']
		//div[@class='well']/form//a
		
		//xpath axes;
		//div[@class='form-group']/child::input[@id='input-email']
		//div[@class='form-group']/child::a
		//footer//child::a
		
		//child to parent: Yes--- backward traversing
		//input[@id='input-email']/../../..---it will go immediate parent
		//input[@class='form-control']/parent::div[@class='form-group']
		
		//child to ancestor:
		//input[@id='input-email']/ancestor::form--it will go immediate parent.
		//input[@name='email']/ancestor::div--all the div tag		
		//sibling to sibling:
		//label[@for='input-password']/following-sibling::input--following Sibling
		//input[@id='input-email']/preceding-sibling::label
		//option[@value='Afghanistan']/preceding-sibling::option---Count=1
		//option[@value='Afghanistan']/following-sibling::option---count=231
		
		//indexing in xPath:
		//--(//a[text()='Forgotten Password'])[1]
		//--(//a[text()='Forgotten Password'])[2]
		//--(//form//input[@id])[5]
		//--(//form//input[@id])[position()=3]
		//--(//form//input[@id])[last()]
		//--(//form//input[@id])[last()-1]
		
		
		
		
		//driver.findElement(By.xpath("(//a[text()='Forgotten Password'])[1]")).click();
		
		//parent child axes combination
		//input[@class='form-control']/parent::div[@class='form-group']/child::label[@for='input-email']
		
		//Amazon footer Help Element:
		//div//div/ul//li//a[text()='Help']
		
		
	}	

}
