package com.helper;

import org.openqa.selenium.WebDriver;

import com.pom.Book_Hotel_Page;
import com.pom.Booking_Confirmation_Page;
import com.pom.Login_Page;
import com.pom.Search_Hotel_Page;
import com.pom.Select_Hotel_Page;

public class Page_Object_Manager {
	
	public WebDriver driver;
	
	private Login_Page lp;
	
	private Search_Hotel_Page shp;
	
	private Select_Hotel_Page sh;
	
	private Book_Hotel_Page bhp;
	
	private Booking_Confirmation_Page bcp;

	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
	}

	public Login_Page getLp() {
		if(lp==null) {
		lp = new Login_Page(driver);
		}
		return lp;
	}

	public Search_Hotel_Page getShp() {
		if(shp==null) {
		shp = new Search_Hotel_Page(driver);
		}
		return shp;
	}

	public Select_Hotel_Page getSh() {
		if(sh==null) {
		sh = new Select_Hotel_Page(driver);
		}
		return sh;
	}

	public Book_Hotel_Page getBhp() {
		if(bhp==null) {
		bhp = new Book_Hotel_Page(driver);
		}
		return bhp;
	}

	public Booking_Confirmation_Page getBcp() {
		if(bcp==null) {
		bcp = new Booking_Confirmation_Page(driver);
		}
		return bcp;
	}	
		
		
	}

