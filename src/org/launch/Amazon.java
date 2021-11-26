package org.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\parthi\\eclipse-workspace\\SeleniumDay1\\driver file\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");

	WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	firstName.sendKeys("partha");
	WebElement secondName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	secondName.sendKeys("sarathi");
	WebElement address = driver.findElement(By.xpath("//textarea[@rows='3']"));
	address.sendKeys("no.25 srinivasapuram,korattur,chennai 76");
	WebElement emailAddress = driver.findElement(By.xpath("//input[@type='email']"));
	emailAddress.sendKeys("parthamechsarathi@gmail.com");
	WebElement phoneNumber = driver.findElement(By.xpath("//input[@type='tel']"));
	phoneNumber.sendKeys("9710821771");
	WebElement txtGender = driver.findElement(By.name("radiooptions"));
	txtGender.click();
    WebElement firstPass = driver.findElement(By.id("firstpassword"));
    firstPass.sendKeys("1234556");
    WebElement secondPass = driver.findElement(By.id("secondpassword"));
    secondPass.sendKeys("secondpassword");
    WebElement lanInfo = driver.findElement(By.xpath("//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']"));
    lanInfo.sendKeys("tamil");

	
	
}
}