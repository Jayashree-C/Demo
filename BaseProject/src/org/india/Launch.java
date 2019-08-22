package org.india;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	
	public static void main(String[] args) {
		// Configuring 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jayashree C\\eclipse-workspace\\BaseProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	// To launch
	driver.get("https://www.facebook.com/");
	
	// To get the title
	String title = driver.getTitle();
	System.out.println(title);
	
	// To get the current page URL
	String cu = driver.getCurrentUrl();
	System.out.println(cu);
	
	// To quit the browser
	
	driver.quit();
	}

}
