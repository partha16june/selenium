package org.launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ScrollDown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\parthi\\eclipse-workspace\\SeleniumDay1\\driver file\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement create = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
	create.click();
	Thread.sleep(3000);
	WebElement month = driver.findElement(By.id("month"));
	Select s = new Select(month);
	s.selectByIndex(5);
	
	
	WebElement day = driver.findElement(By.id("day"));
	Select s1 = new Select(day);
	s1.selectByValue("16");
	List<WebElement> list = s.getOptions();
	int size = list.size();
	System.out.println(size);
	for (int i = 0; i < list.size(); i++) {
		WebElement x = list.get(i);
		String text = x.getText();
		System.out.println(text);
		
	}
	List<WebElement> list2 = s1.getOptions();
	int size2 = list2.size();
	System.out.println(size2);
	for (int i = 0; i < list2.size(); i++) {
		WebElement t = list2.get(i);
		String txt = t.getText();
		System.out.println(txt);
		
	}
	
	
	
	Thread.sleep(3000);
	
	WebElement year = driver.findElement(By.id("year"));
	Select s2 = new Select(year);
	s2.selectByVisibleText("1992");
	
	List<WebElement> list3 = s2.getOptions();
	int size3 = list3.size();
	System.out.println(size3);
	
	for (int i = 0; i < list3.size(); i++) {
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
}
