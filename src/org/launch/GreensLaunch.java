package org.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensLaunch {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\parthi\\eclipse-workspace\\SeleniumDay1\\driver file\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.swiggy.com/");
	
	WebElement signUp = driver.findElement(By.xpath("//a[@class='r2iyh']"));
	signUp.click();
	WebElement name = driver.findElement(By.xpath("//input[@name='mobile']"));
	name.sendKeys("9877655442");
}
}
