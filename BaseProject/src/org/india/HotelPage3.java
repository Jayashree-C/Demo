package org.india;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelPage3 extends Base {
	public HotelPage3() {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton_0;
	
	@FindBy(id="continue")
	private WebElement continu;
	
	
	
	public WebElement getContinu() {
		return continu;
	}
	public void setContinu(WebElement continu) {
		this.continu = continu;
	}
	public WebElement getRadiobutton_0() {
		return radiobutton_0;
	}
	public void setRadiobutton_0(WebElement radiobutton_0) {
		this.radiobutton_0 = radiobutton_0;
	}
}
