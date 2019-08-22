package org.india;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetAllWindowHandles;
import org.openqa.selenium.support.ui.Select;

public class Base {
	
	static WebDriver driver;
	public static Select s;

	
public static WebDriver getDriverAccess() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jayashree C\\eclipse-workspace\\BaseProject\\driver\\chromedriver.exe");
 driver=new ChromeDriver();
return driver;
}

public static void loadUrl(String url) {
	driver.get(url);
	}

public static void fill(WebElement element, String value) {
	element.sendKeys(value);

}
public static void click(WebElement element) {
element.click();

}
public static void gw1()
{
	String par = driver.getWindowHandle();
	System.out.println(par);
	Set<String> all = driver.getWindowHandles();
	System.out.println(all);
	for(String x:all)
	{
		if(!par.equals(x))
		{
			driver.switchTo().window(x);
		}
	}
	
	
}

public static void selectByIndex(WebElement element,int index) {
	Select s=new Select(element);	
	s.selectByIndex(index);
}


public static void SBV(WebElement e,String value) {
	Select s=new Select(e);
	s.selectByValue(value);
}

public static void SBT(WebElement e,String value) {
	Select s=new Select(e);
	s.selectByVisibleText(value);
	// TODO Auto-generated method stub

}
public static void attribute(WebElement element) {
	String att = element.getAttribute("value");
System.out.println(att);
}
}

