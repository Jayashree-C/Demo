package org.india;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.GetAllWindowHandles;

public class FacebookLogin extends Base {

	public static void main(String[] args) {
		getDriverAccess();
	loadUrl("https://www.facebook.com");
	
	WebElement email = driver.findElement(By.id("email"));
	fill(email, "cshree777@gmail.com");
	
	WebElement pass = driver.findElement(By.id("pass"));
	fill(pass, "2345");
	
	WebElement clk = driver.findElement(By.id("loginbutton"));
	click(clk);
	
	//Windows handling
	
	gw1();

}
}
