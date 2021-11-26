package org.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPrint {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\parthi\\eclipse-workspace\\SeleniumDay1\\driver file\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.amazon.in/");
	WebElement check = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
	String text = check.getText();
	System.out.println(text);
}
}
