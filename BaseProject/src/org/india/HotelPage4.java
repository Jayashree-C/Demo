package org.india;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelPage4 extends Base {
	public HotelPage4() {
		PageFactory.initElements(driver, this);
}
	@FindBy(id="first_name")
	private WebElement firstname;
	
	@FindBy(id="last_name")
	private WebElement last_name;
	
	@FindBy(id="address")
	private WebElement address;

	@FindBy(id="cc_num")
	private WebElement cc_num;
	
	@FindBy(id="cc_type")
	private WebElement cc_type;
	
	@FindBy(id="book_now")
	private WebElement book_now1;
	
	public WebElement getBook_now1() {
		return book_now1;
	}
	public void setBook_now1(WebElement book_now1) {
		this.book_now1 = book_now1;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLast_name() {
		return last_name;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCc_num() {
		return cc_num;
	}
	public WebElement getCc_type() {
		return cc_type;
	}
	public WebElement getCc_exp_month() {
		return cc_exp_month;
	}
	public WebElement getCc_exp_year() {
		return cc_exp_year;
	}
	@FindBy(id="cc_exp_month")
	private WebElement cc_exp_month;
	@FindBy(id="cc_exp_year")
	private WebElement cc_exp_year;


	public WebElement getCc_cvv() {
		return cc_cvv;
	}
	public void setCc_cvv(WebElement cc_cvv) {
		this.cc_cvv = cc_cvv;
	}
	public WebElement getBook_now() {
		return book_now1;
	}
	public void setBook_now(WebElement book_now) {
		this.book_now1 = book_now;
	}
	public void setFirstname(WebElement firstname) {
		this.firstname = firstname;
	}
	public void setLast_name(WebElement last_name) {
		this.last_name = last_name;
	}
	public void setAddress(WebElement address) {
		this.address = address;
	}
	public void setCc_num(WebElement cc_num) {
		this.cc_num = cc_num;
	}
	public void setCc_type(WebElement cc_type) {
		this.cc_type = cc_type;
	}
	public void setCc_exp_month(WebElement cc_exp_month) {
		this.cc_exp_month = cc_exp_month;
	}
	public void setCc_exp_year(WebElement cc_exp_year) {
		this.cc_exp_year = cc_exp_year;
	}
	@FindBy(id="cc_cvv")
	private WebElement cc_cvv;
	@FindBy(id="book_now")
	private WebElement book_now;


	
}
