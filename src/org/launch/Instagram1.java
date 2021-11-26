package org.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\parthi\\eclipse-workspace\\SeleniumDay1\\driver file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
		user.sendKeys("parthas");
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("09876987");
	}
}
