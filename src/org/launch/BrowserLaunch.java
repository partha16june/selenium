package org.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\parthi\\eclipse-workspace\\SeleniumDay1\\driver file\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.swiggy.com");
	
	WebElement signUp = driver.findElement(By.xpath("//a[@class='r2iyh']"));
	signUp.click();
	WebElement mobileNo = driver.findElement(By.xpath("//input[@name='mobile']"));
	mobileNo.sendKeys("9710821771");
	
	WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
	name.sendKeys("partha");
	
	WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	email.sendKeys("parthas@gmail.com");
	
	WebElement pass = driver.findElement(By.xpath("(//input[@autocomplete='off'])[5]"));
	pass.sendKeys("1237366272");
	
	
}
}
