package org.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\parthi\\eclipse-workspace\\SeleniumDay1\\driver file\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.facebook.com/");
	WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
	user.sendKeys("parthasa");
	
	WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
	pass.sendKeys("123456789");
	
	String attribute = user.getAttribute("value");
	System.out.println(attribute);
	
	String attribute2 = pass.getAttribute("value");
	System.out.println(attribute2);
	
}
}
