package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel_Page {
	
	public WebDriver driver;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy (id="hotels")
	private WebElement hotel;
	
	@FindBy (id="room_type")
	private WebElement roomType;
	
	@FindBy (id="room_nos")
	private WebElement numberOfRoom;
	
	@FindBy (id="datepick_in")
	private WebElement checkIn;
	
	@FindBy (id="datepick_out")
	private WebElement checkOut;
	
	@FindBy (id="adult_room")
	private WebElement numberOfPersons;
	
	@FindBy (id="child_room")
	private WebElement childerPerRoom;
	
	@FindBy (id="Submit")
	private WebElement submit;

	public Search_Hotel_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNumberOfRoom() {
		return numberOfRoom;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getNumberOfPersons() {
		return numberOfPersons;
	}

	public WebElement getChilderPerRoom() {
		return childerPerRoom;
	}

	public WebElement getSubmit() {
		return submit;
	}

}
