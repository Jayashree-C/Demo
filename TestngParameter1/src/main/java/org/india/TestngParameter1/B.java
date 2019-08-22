package org.india.TestngParameter1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class B {
	@Test
		public void tc1() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jayashree C\\eclipse-workspace\\TestNG2\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> radio = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		
		Thread.sleep(3000);

		radio.get(0).click();
		radio.get(1).click();

		int s = radio.size();
		System.out.println(s);
		}

}


