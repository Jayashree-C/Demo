

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation {
static WebDriver driver;
@BeforeClass
private void launch() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jayashree C\\eclipse-workspace\\TestngAnnotation\\driver\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://www.facebook.com/ ");
driver.manage().window().maximize();
}

//@AfterClass
//private void close() {
	//driver.close();
//}

@BeforeMethod
private void startTime() {
Date d=new Date();
System.out.println(d);
}

@AfterMethod
private void endTime() {
	Date d1=new Date();
	System.out.println(d1);	
}

@Test
private void logic() {

driver.findElement(By.id("email")).sendKeys("cshree777@gmail.com");
driver.findElement(By.id("pass")).sendKeys("12345");

}

}
