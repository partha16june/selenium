package org.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SprintTask {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\parthi\\eclipse-workspace\\SeleniumDay1\\driver file\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://sprint.com");
	WebElement click = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
	click.click();
	WebElement phone = driver.findElement(By.xpath("//a[@id='digital-header-nav-link-head-1']"));
	Actions action = new Actions(driver);
	action.moveToElement(phone).perform();
	WebElement ps = driver.findElement(By.xpath("//span[text()='5G phones']"));
	ps.click();
	WebElement element = driver.findElement(By.xpath("(//a[@class='ng-star-inserted'])[20]"));
	String text = element.getText();
	System.out.println(text);
}
}
