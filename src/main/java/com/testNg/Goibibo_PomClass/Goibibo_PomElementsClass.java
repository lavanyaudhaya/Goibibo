package com.testNg.Goibibo_PomClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testNg.Goibibo_BaseClass.Goibibo_BaseClass;

public class Goibibo_PomElementsClass extends Goibibo_BaseClass implements Goibibo_Locators{
	
	public Goibibo_PomElementsClass() {
		//initalising driver for all the webelements in this constructor
		PageFactory.initElements(driver, this);
	}
	
	private Goibibo_PomElementsClass goibiboSDD_Pom;	
	//Singleton Design Pattern
	public Goibibo_PomElementsClass getGoibibo_pom() {
		goibiboSDD_Pom = new Goibibo_PomElementsClass();
		return goibiboSDD_Pom;
	}

	@FindBy (xpath = signUpMobNumber)
	private WebElement signUpLoginMobNumber;
	public WebElement getSignUpLoginMobNumber() {
		return signUpLoginMobNumber;
	}

	@FindBy(xpath = mobileNum)
	private WebElement mobileNumInput;
	public WebElement getMobileNum() {
		return mobileNumInput;
	}
	
	@FindBy(xpath = fullName)
	private WebElement fullNameInput;
	public WebElement getFullName() {
		return fullNameInput;
	}
	
	@FindBy(xpath = eMailAddr)
	private WebElement eMailInputText;	
	public WebElement getEMailInputText() {
		return eMailInputText;
	}
	
	@FindBy(xpath = letsGo)
	private WebElement letsGoButton;
	public WebElement getLetsGoButton() {
		return letsGoButton;
	}
	
	@FindBy(xpath = selectHotel)
	private WebElement selectHotelTab;
	public WebElement getSelectHotelTab() {
		return selectHotelTab;
	}
	
	@FindBy(xpath = autoSuggestEnterHotelName)
	private WebElement autoSuggestEnterHotelNameChola;
	public WebElement getAutoSuggestEnterHotelNameChola() {
		return autoSuggestEnterHotelNameChola;
	}
	
	@FindBy(xpath = autoSuggestions)
	private WebElement autoSugg;
	public WebElement getAutoSugg() {		
		return autoSugg;
	}
	
	@FindBy(xpath = hotelSearchButton)
	private WebElement hotelSearchButtonClick;
	public WebElement getHotelSearchButtonClick() {
		return hotelSearchButtonClick;
	}
	
	@FindBy(xpath = checkIn)
	private WebElement checkInInput;
	public WebElement getCheckInInput() {
		return checkInInput;
	}

	@FindBy(xpath = countryType)
	private WebElement countryTypeRadioButton;
	public WebElement getCountryTypeRadioButton() {
		return countryTypeRadioButton;
	}
	
	@FindBy(xpath = whereText)
	private WebElement whereTypeInput;
	public WebElement getWhereTypeInput() {
		return whereTypeInput;
	}
	
	@FindBy(xpath = itcChola)
	private WebElement selectITC_Chola;
	public WebElement getSelectITC_Chola() {
		return selectITC_Chola;
	}
	
	@FindBy(xpath = checkInRightArrow)
	private WebElement checkInRightSideArrow;
	public WebElement getCheckInRightSideArrow() {
		return checkInRightSideArrow;
	}
	
	
	@FindBy(xpath = checkInLeftArrow)
	private WebElement checkInLeftSideArrow;
	public WebElement getCheckInLeftSideArrow() {
		return checkInLeftSideArrow;
	}

	@FindBy(xpath = selectFromDate)
	private WebElement fromDate;
	public WebElement getFromDate() {
		return fromDate;
	}
	
	@FindBy(xpath = selectToDate)
	private WebElement toDate;
	public WebElement getToDate() {
		return toDate;
	}
	
	@FindBy(xpath = addGuests)
	private WebElement addGuestsOption;
	public WebElement getAddGuestsOption() {
		return addGuestsOption;
	}
	
//	@FindBy(xpath = addChildren)
//	private WebElement addChildrenOption;
//	public WebElement getAddChildrenOption() {
//		return addChildrenOption;
//	}
	
	@FindBy(xpath = addChild)
	private WebElement addChildPlus;	
	public WebElement getAddChildPlus() {
		return addChildPlus;
	}

	@FindBy(xpath = selectButton)
	private WebElement ageSelectOption;
	public WebElement getAgeSelectOption() {
		return ageSelectOption;
	}
	
	@FindBy(xpath = selectAge9)
	private WebElement childAgeNineOption;
	public WebElement getChildAgeNineOption() {
		return childAgeNineOption;
	}
	
	@FindBy(xpath = doneButton)
	private WebElement doneButtonClick;
	public WebElement getDoneButtonClick() {
		return doneButtonClick;
	}
	
	@FindBy(xpath = searchButton)
	private WebElement searchButtonClick;
	public WebElement getSearchButtonClick() {
		return searchButtonClick;
	}
	
	@FindBy(xpath = cholaSuite)
	private WebElement selectCholaSuite;
	public WebElement getSelectCholaSuite() {
		return selectCholaSuite;
	}
	
	@FindBy(xpath = enterLastName)
	private WebElement enterLastNameInput;
	public WebElement getEnterLastNameInput() {
		return enterLastNameInput;
	}
	
	@FindBy(xpath = scrolltoProceedPayment)
	private WebElement scrollToPaymentButton;
	public WebElement getScrollToPaymentButton() {
		return scrollToPaymentButton;
	}

	@FindBy(xpath = proceedToPayment)
	private WebElement payment;
	public WebElement getPayment() {
		return payment;	
	}
	
	
}
