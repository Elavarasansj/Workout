package executing;

import java.io.IOException;


import org.global.BaseClass2;
import org.junit.Before;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageManager.PageManagerClass;
import page.BookHotelPage;
import page.BookedLtineraryPage;
import page.BookingConfirmationPage;
import page.LoginAgainPage;
import page.LoginPage;
import page.SearchHotelPage;
import page.SelectHotelPage;

public class SearchHotelJunit extends BaseClass2
{
	public static BaseClass2 baseClass2 = new BaseClass2();
	public static PageManagerClass pageManager = new PageManagerClass();
	public static LoginPage loginPage;
	public static SearchHotelPage searchHotelPage;
	public static SelectHotelPage selectHotelPage;
	public static BookHotelPage bookHotelPage;
	public static BookingConfirmationPage bookingConfirmationPage;
	public static BookedLtineraryPage bookedLtineraryPage;
	public static LoginAgainPage loginAgainPage;

	@Test(priority = 1)
	public static void BrowserLaunch() throws IOException
	{
		BaseClass2 baseClass2 = new BaseClass2();
		baseClass2.getDriver();
		baseClass2.getUrl(baseClass2.getProperty("url"));
		baseClass2.winMax();
	    baseClass2.TakeScreenshot();
	}
	
	@Test(priority = 2)
	public void LoginPageValidation()
	{
		   loginPage = pageManager.loginpage();
		    
			WebElement loginvalidation = loginPage.getExistingUserLogin();
		
		
	        if (loginvalidation.isDisplayed()) 
	        {
	            System.out.println("we have launched the Adactin login page successfully");
	        }
	        else 
	        {
	            System.out.println("we have NOT launched the adactin login page successfully");
	        }
	}
	
	
	@Test(priority = 3)
	public void EnterValidLoginCrdentials() throws IOException
	{
		loginPage = pageManager.loginpage();
		
		WebElement username = loginPage.getUsername();
		baseClass2.sendKeysByJS(username, baseClass2.readExcel(1, 1));


		WebElement password = loginPage.getPassword();
		baseClass2.sendKeysByJS(password, baseClass2.readExcel(2, 1));

		baseClass2.TakeScreenshot();
		
		System.out.println("User Successfully Entered Login Crdentials ");
	}
	
	@Test(priority = 4)
	public void ClickLoginButton() {

		loginPage = pageManager.loginpage();
		
		WebElement loginButton = loginPage.getLoginButton();

		if (loginButton.isDisplayed()) {

			if (loginButton.isEnabled()) {

				baseClass2.clickByJS(loginButton);
			}

		}

		System.out.println("User Successfully Cliked Login Button");
	}
	
	@Test(priority = 5)
	public void SearchHotelPageValidation()
	{
		
        searchHotelPage = pageManager.searchHotelPage();
		
		WebElement searchHotelPageValidation = searchHotelPage.getSearchHotelPageValidation();
		
		   if (searchHotelPageValidation.isDisplayed()) 
	        {
	            System.out.println("we have entered the Search Hotel page successfully");
	        }
	        else 
	        {
	            System.out.println("we have  Not entered the Search Hotel page successfully");
	        }
	}
	
	@Test(priority = 6)
	public void SearchHotelValueField() throws IOException
	{
	   searchHotelPage = pageManager.searchHotelPage();
		
		WebElement location = searchHotelPage.getLocation();
		baseClass2.selectByIndex(location,5);
		
		WebElement hotel = searchHotelPage.getHotel();
		baseClass2.selectByIndex(hotel,2);
		
		WebElement room = searchHotelPage.getRoom();
		baseClass2.selectByIndex(room,4);
		
		WebElement noOfRooms = searchHotelPage.getNoOfRooms();
		baseClass2.selectByIndex(noOfRooms,2);
		
		WebElement checkInDate = searchHotelPage.getCheckInDate();
		baseClass2.sendKeysByJS(checkInDate,"08/10/2024");
		
		WebElement checkOutDate = searchHotelPage.getCheckOutDate();
		baseClass2.sendKeysByJS(checkOutDate,"10/10/2024");
		
		WebElement adultsPerRoom = searchHotelPage.getAdultsPerRoom();
		baseClass2.selectByIndex(adultsPerRoom,3);
		
		WebElement childernPerRoom = searchHotelPage.getChildrenPerRoom();
		baseClass2.selectByIndex(childernPerRoom,4);
		
		baseClass2.TakeScreenshot();
		
		
		
	}
	
	@Test(priority = 7)
	public void SearchHotelSearchButton()
	{
		searchHotelPage = pageManager.searchHotelPage();
		
		WebElement search = searchHotelPage.getSearch();
		baseClass2.clickByJS(search);
	}
	
}