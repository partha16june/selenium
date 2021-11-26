package org.launch;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {
public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\parthi\\eclipse-workspace\\SeleniumDay1\\driver file\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.facebook.com/");
	driver.manage().window().maximize();
	
	TakesScreenshot shot = (TakesScreenshot)driver;
	File s = shot.getScreenshotAs(OutputType.FILE);
	File d = new File("D:\\selenium\\fb.png");
	FileUtils.copyFile(s, d);
	
	WebElement userName = driver.findElement(By.id("email"));
	userName.sendKeys("parthas");
	
	WebElement pass = driver.findElement(By.id("pass"));
	pass.sendKeys("12334567pdjgrgj");
	
	
	File s1 = shot.getScreenshotAs(OutputType.FILE);
	File d1 = new File("D:\\selenium\\click.png");
	FileUtils.copyFile(s1, d1);
	
	WebElement box = driver.findElement(By.xpath("//form[@class='_9vtf']"));

	  File s2 = box.getScreenshotAs(OutputType.FILE);
	  File d2 = new File("D:\\selenium\\box.png");
	  FileUtils.copyFile(s2, d2);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
