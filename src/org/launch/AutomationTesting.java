package org.launch;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTesting {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\parthi\\eclipse-workspace\\SeleniumDay1\\driver file\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	WebElement btnClick = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
	btnClick.click();
	WebElement search = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
	search.click();
	Alert alert = driver.switchTo().alert();
	alert.sendKeys("parthasarathi");
	alert.accept();
	WebElement printText = driver.findElement(By.xpath("//p[@id='demo1']"));
	String text = printText.getText();
	System.out.println(text);
	
	
	
	
	
	
}
}
