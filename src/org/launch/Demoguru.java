package org.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demoguru {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\parthi\\eclipse-workspace\\SeleniumDay1\\driver file\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	WebElement bank = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
	WebElement drag = driver.findElement(By.id("bank"));
	
	Actions action = new Actions(driver);
    action.dragAndDrop(bank, drag).perform();
    
    WebElement amount = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
    WebElement cash = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
    Actions action1= new Actions(driver);
    action1.dragAndDrop(amount, cash).perform();
    
     WebElement s1 = driver.findElement(By.id("credit1"));
     WebElement d1 = driver.findElement(By.id("loan"));
     Actions action2=new Actions(driver);
     action2.dragAndDrop(s1, d1).perform();
     
     WebElement p1 = driver.findElement(By.id("fourth"));
     WebElement l1 = driver.findElement(By.id("amt8"));
     Actions action3 = new Actions(driver);
     action3.dragAndDrop(p1, l1).perform();
     
     WebElement txtPrint = driver.findElement(By.xpath("(//a[@class='button button-green'])[1]"));
     String text = txtPrint.getText();
     System.out.println(text);
    
    
    
    
}
    
    
    
} 
 

