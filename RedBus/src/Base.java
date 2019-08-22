import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base {
	static WebDriver driver;
	public static Select s;
	public static Actions action;
	public static Alert a;
	
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


public static void TAB() throws AWTException {
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	}

public static void Enter() throws AWTException {
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	}

public static void VK2() throws AWTException {
	Robot r=new Robot();
	for(int i=0;i<=2;i++) {
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	}

}

public static void VK3() throws AWTException {
	Robot r=new Robot();
	for(int i=0;i<=3;i++) {
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	}

}

public static void click(WebElement element) {
element.click();
}
public static void moveToElement(WebElement element) {
	
	action=new Actions(driver);
			action.moveToElement(element).perform();
}
public static void aA() {
	a = driver.switchTo().alert();
	a.accept();
}

public static void windowsHandle() {
	String windowHandle = driver.getWindowHandle();
	Set<String> windowHandles = driver.getWindowHandles();
	for(String x:windowHandles)
	{
		if(!windowHandle.equals(windowHandles)) {
			driver.switchTo().window(x);
		}
	}

}

}