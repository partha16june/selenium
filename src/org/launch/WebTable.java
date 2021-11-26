package org.launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\parthi\\eclipse-workspace\\SeleniumDay1\\driver file\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.techlistic.com/p/demo-selenium-practice.html");
	driver.manage().window().maximize();
	
	List<WebElement> table = driver.findElements(By.tagName("tr"));
	
	//int size = table.size();
	//System.out.println(size);
	
	
	
	for (int i = 1; i < table.size(); i=i+2) {
	WebElement x = table.get(i);
	String text = x.getText();
	System.out.println(text);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
