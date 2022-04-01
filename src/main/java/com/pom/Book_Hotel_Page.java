package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel_Page {
	
	public WebDriver driver;
	
	@FindBy (id="first_name")
	private WebElement firstName;
	
	@FindBy (id="last_name")
	private WebElement lastName;
	
	@FindBy (id="address")
	private WebElement address;
	
	@FindBy (id="cc_num")
	private WebElement cardNumber;
	
	@FindBy (id="cc_type")
	private WebElement cardType;
	
	@FindBy (id="cc_exp_month")
	private WebElement expireMonth;
	
	@FindBy (id="cc_exp_year")
	private WebElement expireYear;
	
	@FindBy (id="cc_cvv")
	private WebElement cvv;
	
	@FindBy (id="book_now")
	private WebElement bookNow;

	public Book_Hotel_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardNumber() {
		return cardNumber;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getExpireMonth() {
		return expireMonth;
	}

	public WebElement getExpireYear() {
		return expireYear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBookNow() {
		return bookNow;
	}
	

}
