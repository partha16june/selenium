package org.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adacthotel {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\parthi\\eclipse-workspace\\SeleniumDay1\\driver file\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	WebElement txtAdact = driver.findElement(By.xpath("//p[contains(text(),'Adactin')]"));
	String text = txtAdact.getText();
	System.out.println(text);
	System.out.println("i am dev ");
	
	
}
}
