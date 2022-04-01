package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirmation_Page {
	
	public WebDriver driver;
	
	@FindBy (id="my_itinerary")
	private WebElement itinerary;
	
	@FindBy (xpath="/html/body/table[2]/tbody/tr[1]/td[2]/a[4]")
	private WebElement logout;

	public Booking_Confirmation_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getItinerary() {
		return itinerary;
	}
	
	public WebElement getLogout() {
		return logout;
	}
	
	

}
