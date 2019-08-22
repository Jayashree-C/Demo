package org.india;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelPage2 extends Base{
public HotelPage2() {
	PageFactory.initElements(driver, this);
	}
@FindBy(id="location")
private WebElement loc;

@FindBy(id="hotels")
private WebElement hotels;

@FindBy(id="room_type")
private WebElement type;

@FindBy(id="room_nos")
private WebElement room_nos;

@FindBy(id="datepick_in")
private WebElement datepick_in;

@FindBy(id="datepick_out")
private WebElement datepick_out;

@FindBy(id="adult_room")
private WebElement adult_room;

@FindBy(id="child_room")
private WebElement childroom;

@FindBy(id="Submit")
private WebElement submit;





public WebElement getSubmit() {
	return submit;
}

public WebElement getLoc() {
	return loc;
}

public WebElement getHotels() {
	return hotels;
}

public WebElement getType() {
	return type;
}

public WebElement getRoom_nos() {
	return room_nos;
}

public WebElement getDatepick_in() {
	return datepick_in;
}

public WebElement getChildroom() {
	return childroom;
}

public WebElement getDatepick_out() {
	return datepick_out;
}

public WebElement getAdult_room() {
	return adult_room;
}


}





