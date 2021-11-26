package org.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPractice {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\parthi\\eclipse-workspace\\SeleniumDay1\\driver file\\chromedriver_win32 (1)");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement userName = driver.findElement(By.id("email"));
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].setAttribute('value','parthas')", userName);
	Object user = executor.executeScript("return arguments[0].getAttribute('value')",userName);
	System.out.println(user);
	WebElement pass = driver.findElement(By.id("pass"));
	executor.executeScript("arguments[0].setAttribute('value','123partha')", pass);
	Object word = executor.executeScript("return arguments[0].getAttribute('value')", pass);
	System.out.println(word);
	
	WebElement btnClick = driver.findElement(By.name("login"));
	executor.executeScript("arguments[0].click()", btnClick);
	
	
	
	
	
	
	
	
}
}
