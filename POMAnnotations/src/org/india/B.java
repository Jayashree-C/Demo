package org.india;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class B {

	static WebDriver driver;
	@Test
	
	public void tc3() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jayashree C\\eclipse-workspace\\POMAnnotations\\driver\\chromedriver.exe");
driver=new ChromeDriver();

driver.get("https://infinity.icicibank.com/corp/Login.jsp");
WebElement userID = driver.findElement(By.xpath("//input[@title='User Id']"));
userID.sendKeys("12345");
Assert.assertEquals("12347", userID.getAttribute("value"));}
@Test

public void tc4() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jayashree C\\eclipse-workspace\\POMAnnotations\\driver\\chromedriver.exe");
driver=new ChromeDriver();

driver.get("https://www.snapdeal.com/login");
WebElement u = driver.findElement(By.id("userName"));
u.sendKeys("12345");
Assert.assertEquals("12345", u.getAttribute("value"));

}
}
