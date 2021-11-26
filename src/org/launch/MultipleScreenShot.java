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

public class MultipleScreenShot {
static WebDriver driver;
public static void screenShot(String name) throws IOException {
	
	TakesScreenshot s= (TakesScreenshot)driver;
	File s1 = s.getScreenshotAs(OutputType.FILE);
	File d1 = new File("D:\\selenium"+name+".png");
	FileUtils.copyFile(s1, d1);
}public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\parthi\\eclipse-workspace\\SeleniumDay1\\driver file\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	screenShot("launch");
	
	WebElement user = driver.findElement(By.id("email"));
	user.sendKeys("parthasa");
	screenShot("user");
	
	WebElement pass = driver.findElement(By.id("pass"));
	pass.sendKeys("11123456543");
	screenShot("pass");
	
	WebElement btn = driver.findElement(By.name("login"));
	btn.click();
	screenShot("click");
	
	
	
	
	
	
	
	
	
	
}

	
}
