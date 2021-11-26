package org.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTech {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\parthi\\eclipse-workspace\\SeleniumDay1\\driver file\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.greenstech.in/selenium-course-content.html");
	
	WebElement overView = driver.findElement(By.xpath("//span[@title='Overview']"));
	overView.click();

	WebElement para = driver.findElement(By.xpath("(//div[contains(@class,'card-body')])[1]"));
	String text = para.getText();
	System.out.println(text);
}
}
