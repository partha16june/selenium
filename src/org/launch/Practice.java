package org.launch;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\parthi\\eclipse-workspace\\SeleniumDay1\\driver file\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.moneycontrol.com/markets/fno-market-snapshot");
	driver.manage().window().maximize();
	WebElement element = driver.findElement(By.xpath("(//div[@class='leftD'])[2]"));
	File s = element.getScreenshotAs(OutputType.FILE);
	File d = new File("D:\\selenium\\se.png");
	FileUtils.copyFile(s, d);
}
}
