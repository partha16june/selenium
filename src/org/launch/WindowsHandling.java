package org.launch;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\parthi\\eclipse-workspace\\SeleniumDay1\\driver file\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("iphone",Keys.ENTER);
	WebElement iphone = driver.findElement(By.xpath("(//span[text()='Apple iPhone 13 (256GB) - Pink'])[1]"));
	iphone.click();
	WebElement phone = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[4]"));
	phone.click();
	
	
	String parent = driver.getWindowHandle();
	System.out.println(parent);
	
	Set<String> handles = driver.getWindowHandles();
	System.out.println(handles);
		
	//driver.switchTo().window(parent);
	List<String> li = new ArrayList<>();
	li.addAll(handles);
	driver.switchTo().window(li.get(1));
	
	
	
	
	
	//driver.quit();
}
}
