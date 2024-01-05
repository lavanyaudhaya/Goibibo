package com.testNg.Goibibo_PomClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface Goibibo_Locators {
	
	//By name
	String signUpMobNumber = "//input[@name='phone']";
	String mobileNum = "//input[@name='phone']";
	//OTP verification - 30 secs
	String fullName = "//input[@placeholder='Enter your full name']";
	String eMailAddr = "//input[@placeholder='Enter your email address']";
	String letsGo = "//button[text()='Lets Go']";
	String selectHotel = "(//p[text()='Hotels'])[1]";
	//String countryType = "//h4[text()='India']";
	String countryType = "(//input[@name='CountryType'])[1]";
	String whereText = "//input[@data-testid='home-autosuggest-input']";
	//SendKeys here...
	
	//input[@data-testid='home-autosuggest-input']
	String itcChola = "//span[text()='Where']//parent::div//child::div//child::div//input[@value='ITC Grand Chola - A Luxury Collection Hotel, Chennai, Tamil Nadu']";
	String autoSuggestEnterHotelName = "//input[@data-testid='home-autosuggest-input']";
	
	String attributeSugg = "value";
	
	String autoSuggestions = "//input[@data-testid='home-autosuggest-input']//following-sibling::ul";
	
	String hotelSearchButton = "//button[text()='Search']";
	//String tagName_li = "li";
	String obj = "ITC Grand Chola";
	
	String checkIn = "//h4[@class='dwebCommonstyles__SmallSectionHeader-sc-112ty3f-10 SearchBlockUIstyles__CheckInDateWrapDiv-sc-fity7j-15 kJLbNT gbNkLl']";
	
	String checkInRightArrow = "//span[@data-testid='calendarRightArrowBtn']";
	//click 4 times
	String checkInLeftArrow = "//span[@data-testid='calendarLeftArrowBtn']";
	//click 1 time
	String selectFromDate = "//span[text()='May 2024']//parent::div//following-sibling::div//child::div//child::ul//following-sibling::ul//child::li//span[text()='2']";
	String selectToDate = "//span[text()='May 2024']//parent::div//following-sibling::div//child::div//child::ul//following-sibling::ul//child::li//span[text()='5']";
	String addGuests = "//input[@value='2 Adults  | 1 Room ']";
	String addChild = "//span[@data-testid='button-child-add']";
	
	//String addChildren = "//span[text()='Children']//following-sibling::div//child::h4//following-sibling::span";
	
	String selectButton = "//h4[text()='Select']";
	String selectAge9 = "//h4[text()='Select']//following-sibling::span//following::ul//li[text()='9']";
	String doneButton = "//button[text()='Done']";
	String searchButton = "//button[text()='Search']";
	//scroll down for chola suite and click
	String cholaSuite = "//p[text()='Chola Suite']//following-sibling::div//following-sibling::div//div//following-sibling::div//following-sibling::div//span[text()='City View']//following::div//child::div//following-sibling::div//following::div//div//div//descendant::div//p[text()='Check-in Begins at 12 PM']//following::div//descendant::div//following-sibling::div//following-sibling::div//child::span//following-sibling::div//following::div//following::div//child::div//button[@data-testid='selectRoomBtn']";
	//send text
	String enterLastName = "//input[@placeholder='Enter Last Name']";
	String scrolltoProceedPayment = "//span[text()='Proceed To Payment Options']";
	String proceedToPayment = "//button[@class='dwebCommonstyles__ButtonBase-sc-112ty3f-13 PaymentCustomButtonUIstyle__CustomButton-sc-12ekasb-0 kwEZmw kPPtwa']";

}
