package org.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\parthi\\eclipse-workspace\\SeleniumDay1\\driver file\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://mypage.rediff.com/login/dologin");
	driver.manage().window().maximize();
	WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));
	login.click();
	org.openqa.selenium.Alert alert = driver.switchTo().alert();
	alert.accept();
	String data = alert.getText();
	System.out.println(data);
	
	
	
	
	
	
	
	
	
	
	
}
}
