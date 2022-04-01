package com.Project;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.Baseclass.Base_Class;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.helper.Page_Object_Manager;

public class Adactin_Runner_Class extends Base_Class {

	public static WebDriver driver = browser_Configuration("chrome");
	
	public static Page_Object_Manager pom = new Page_Object_Manager (driver);
	
	public static String path = "C:\\\\Users\\\\aravind\\\\eclipse-workspace\\\\Adactin_TestNG\\\\Test Case - Adactin Hotel - Final.xlsx";
	
	public static Logger log = Logger.getLogger(Adactin_Runner_Class.class);
	
	public static ExtentSparkReporter spark_Reporter;

	public static ExtentReports reports;
	
	@BeforeTest
	private void report_Generation() {
		
		spark_Reporter = new ExtentSparkReporter("C:\\Users\\aravind\\eclipse-workspace\\Adactin_TestNG\\Report_Adactin\\Report.html");
		
		reports = new ExtentReports();
		
		reports.attachReporter(spark_Reporter);
	}
	
	@AfterTest
	private void flush() {
		
		reports.flush();

	}
	
	@BeforeClass
	private void After_Browser_Launch() {
		
		PropertyConfigurator.configure("log4j.properties");
		
		implicitWait(10, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		getUrl("https://adactinhotelapp.com/");
		
		log.info("Url Launched");

	}
	
	@Test(priority = 1)
	private void HotelToBeSelected() throws Throwable {
		
		inputValueElement(pom.getLp().getUserName(), particular_Cell_Data(path, 2, 5));
		
		inputValueElement(pom.getLp().getPassword(), particular_Cell_Data(path, 3, 5));
				
		clickOnElement(pom.getLp().getLogin());
		
		log.info("SignIn Completed");
				
		dropdown(pom.getShp().getLocation(), "byValue", particular_Cell_Data(path, 5, 5));
				
		dropdown(pom.getShp().getHotel(), "byValue", particular_Cell_Data(path, 6, 5));
				
		dropdown(pom.getShp().getRoomType(), "byValue", particular_Cell_Data(path, 7, 5));
				
		dropdown(pom.getShp().getNumberOfRoom(), "byValue", particular_Cell_Data(path, 8, 5));
				
		inputValueElement(pom.getShp().getCheckIn(), particular_Cell_Data(path, 9, 5));
				
		inputValueElement(pom.getShp().getCheckOut(), particular_Cell_Data(path, 10, 5));
				
		dropdown(pom.getShp().getNumberOfPersons(), "byValue", particular_Cell_Data(path, 11, 5));
				
		dropdown(pom.getShp().getChilderPerRoom(), "byValue", particular_Cell_Data(path, 12, 5));
				
		clickOnElement(pom.getShp().getSubmit());
		
		log.info("Hotel Selected");

	}
	
	@Test(priority = 2)
	private void HotelToBeBooked() throws Throwable {
		
		clickOnElement(pom.getSh().getSelect());
		
		clickOnElement(pom.getSh().getClick());
				
		inputValueElement(pom.getBhp().getFirstName(), particular_Cell_Data(path, 16, 5));
		
		inputValueElement(pom.getBhp().getLastName(), particular_Cell_Data(path, 17, 5));
				
		inputValueElement(pom.getBhp().getAddress(), particular_Cell_Data(path, 18, 5));
		
		inputValueElement(pom.getBhp().getCardNumber(), "1234567890123456");
		
		dropdown(pom.getBhp().getCardType(), "byValue", particular_Cell_Data(path, 20, 5));
		
		dropdown(pom.getBhp().getExpireMonth(), "byValue", particular_Cell_Data(path, 21, 5));
		
		dropdown(pom.getBhp().getExpireYear(), "byValue", particular_Cell_Data(path, 22, 5));
		
		inputValueElement(pom.getBhp().getCvv(), particular_Cell_Data(path, 23, 5));
		
		clickOnElement(pom.getBhp().getBookNow());
		
		clickOnElement(pom.getBcp().getItinerary());
		
		takesScreenshot("C:\\Users\\aravind\\eclipse-workspace\\Adactin_TestNG\\Screenshot\\hotel.png");
		
		log.info("Hotel Booked");
		
		clickOnElement(pom.getBcp().getLogout());

	}
	
	@AfterClass
	private void Final_Method() {
		
		close();

	}

}
