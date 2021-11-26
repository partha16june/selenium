package org.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sprint {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\parthi\\eclipse-workspace\\SeleniumDay1\\driver file\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
	driver.manage().window().maximize();
	WebElement course = driver.findElement(By.xpath("//a[text()='COURSES']"));
	Actions action = new Actions(driver);
	action.moveToElement(course).perform();
	Thread.sleep(6000);
	WebElement javaTraining = driver.findElement(By.xpath("//span[text()='Java Training']"));
	Actions action1 = new Actions(driver);
	action1.moveToElement(javaTraining).perform();
	WebElement coreJava = driver.findElement(By.xpath("//span[text()='Core Java Training']"));
	coreJava.click();
}
}
