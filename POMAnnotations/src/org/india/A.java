package org.india;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class A {
	static WebDriver driver;


	@Test
	
	public void tc1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jayashree C\\eclipse-workspace\\POMAnnotations\\driver\\chromedriver.exe");
driver=new ChromeDriver();

driver.get("https://www.facebook.com");
			Assert.assertTrue(driver.getTitle().contains("Facebook"));
			  WebElement user = driver.findElement(By.id("email"));
			user.sendKeys("12345");
			Assert.assertEquals("12345", user.getAttribute("value"));
	Assert.assertTrue(driver.getCurrentUrl().contains("https://www.facebook.com"));
	}
	@Test
	public void tc2() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jayashree C\\eclipse-workspace\\POMAnnotations\\driver\\chromedriver.exe");
driver=new ChromeDriver();

driver.get("https://www.instagram.com/");
WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
signin.click();

	}

	}
	
	

