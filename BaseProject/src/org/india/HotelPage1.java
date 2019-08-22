package org.india;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelPage1 extends Base {
	public HotelPage1()
	{
		PageFactory.initElements(driver, this);
	}
@FindBy(id="username")
private WebElement user;
@FindBy(id="password")
private WebElement pass;
@FindBy(id="login")
private WebElement loginButton;
public WebElement getUser() {
	return user;
}
public WebElement getPass() {
	return pass;
}
public WebElement getLoginButton() {
	return loginButton;
}

}
