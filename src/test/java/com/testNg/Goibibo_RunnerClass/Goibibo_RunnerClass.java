package com.testNg.Goibibo_RunnerClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.testNg.Goibibo_BaseClass.Goibibo_BaseClass;
import com.testNg.Goibibo_PomClass.Goibibo_PomElementsClass;

public class Goibibo_RunnerClass extends Goibibo_BaseClass{

	Goibibo_PomElementsClass goibibo_PomObj = new Goibibo_PomElementsClass();
	
	@BeforeSuite
	public void browserLaunch() {
		launchBrowser("chrome");
	}
	
	
	@Parameters("url_link")
	@BeforeTest
	public void urlLaunch(String url) {
		launchURL(url);
	}
	
	@Parameters("phoneNum")
	@Test(priority = 1)
	public void signUpWithMobileNumber(String phoneNumber) throws InterruptedException {
		//getGoibibo_pom()
		sendText(goibibo_PomObj.getGoibibo_pom().getSignUpLoginMobNumber(), phoneNumber);
		Thread.sleep(30000);
	}
	
	@Test(priority = 2)
	public void selectHotelTab() {
		
		clickElement(goibibo_PomObj.getGoibibo_pom().getSelectHotelTab());
	}
	
	
	@Parameters("hotelName")
	@Test(priority = 3)
	public void selectHotelWithCheckInDetails(String hotel) throws InterruptedException {
		clickElement(goibibo_PomObj.getGoibibo_pom().getCountryTypeRadioButton());
		sendText(goibibo_PomObj.getGoibibo_pom().getWhereTypeInput(), hotel);
		Thread.sleep(3000);
		List<WebElement> option = goibibo_PomObj.getGoibibo_pom().getAutoSugg().findElements(By.tagName("li"));
		int itr = 0;
		for(itr = 0;itr<option.size();itr++) {			
			if(option.get(itr).getText().contains("ITC Grand Chola")){
				clickElement(goibibo_PomObj.getGoibibo_pom().getAutoSugg());				
			}			
		}
	}
	
	@Test(priority = 4)
	public void selectDateAndGuests() throws InterruptedException {
		clickElement(goibibo_PomObj.getGoibibo_pom().getCheckInInput());
		int right,left;
		for(right = 1;right<=4;right++) {
			clickElement(goibibo_PomObj.getGoibibo_pom().getCheckInRightSideArrow());
		}
		Thread.sleep(3000);
//		for(left = 1; left<=1;left++) {
//			clickElement(goibibo_PomObj.getGoibibo_pom().getCheckInLeftSideArrow());
//		}
		clickElement(goibibo_PomObj.getGoibibo_pom().getFromDate());
		clickElement(goibibo_PomObj.getGoibibo_pom().getToDate());
		clickElement(goibibo_PomObj.getGoibibo_pom().getAddGuestsOption());
		//clickElement(goibibo_PomObj.getGoibibo_pom().getAddChildrenOption());
		Thread.sleep(2000);
		clickElement(goibibo_PomObj.getGoibibo_pom().getAddChildPlus());
		clickElement(goibibo_PomObj.getGoibibo_pom().getAgeSelectOption());
		clickElement(goibibo_PomObj.getGoibibo_pom().getChildAgeNineOption());
		clickElement(goibibo_PomObj.getGoibibo_pom().getDoneButtonClick());
		clickElement(goibibo_PomObj.getGoibibo_pom().getHotelSearchButtonClick());
	}
	
	@Test(priority = 5)
	public void selectHotelOptions() throws InterruptedException {
		Thread.sleep(2000);
		//scrollDown(goibibo_PomObj.getGoibibo_pom().getSelectCholaSuite());
		elementClickWithJSE(goibibo_PomObj.getGoibibo_pom().getSelectCholaSuite());
		Thread.sleep(4000);
	}
	
	@Parameters("lastName")
	@Test(priority = 6)
	public void proceedNextPage(String last_Name) throws InterruptedException {
		elementClickWithJSE(goibibo_PomObj.getGoibibo_pom().getEnterLastNameInput());
		Thread.sleep(2000);
		sendText(goibibo_PomObj.getGoibibo_pom().getEnterLastNameInput(), last_Name);
		Thread.sleep(4000);
		scrollDown(goibibo_PomObj.getGoibibo_pom().getScrollToPaymentButton());
		clickElement(goibibo_PomObj.getGoibibo_pom().getPayment());
		
	}
	
	@Test(priority = 7)
	public void fullScreenShot() throws InterruptedException {
		Thread.sleep(5000);
		takeFullScreenShot();
		
	}
	
}
