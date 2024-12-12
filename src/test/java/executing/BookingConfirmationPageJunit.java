package executing;


	import java.io.IOException;


	import org.global.BaseClass2;
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

	public class BookingConfirmationPageJunit extends BaseClass2
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
		
		
		@Test(priority = 8)
		public void SelectHotelValidation()
		{
		
		    selectHotelPage = pageManager.selectHotelPage();
			
			WebElement selectHotelValidation = selectHotelPage.getSelectHotelValidation();
			
			 if (selectHotelValidation.isDisplayed()) 
		        {
		            System.out.println("we have entered the Select Hotel page successfully");
		        }
		        else 
		        {
		            System.out.println("we have  Not entered the Select Hotel page successfully");
		        }
		}
		
		@Test(priority = 9)
		public void SelectHotel() throws IOException
		{
			selectHotelPage = pageManager.selectHotelPage();
			
			WebElement selectHotel = selectHotelPage.getSelectHotel();
			baseClass2.clickByActions(selectHotel); 
			
			baseClass2.TakeScreenshot();
		}
		
		@Test(priority = 10)
		public void SlectHotelContinueButton()
		{

			
			WebElement continue0 = selectHotelPage.getContinue0();
			baseClass2.clickByJS(continue0);		
			
			
		}
		
		@Test(priority = 11)
		public void BookHotelPageValidation()
		{
			
		     bookHotelPage = pageManager.bookHotelPage();
			
			WebElement bookHotelPageValidation = bookHotelPage.getBookHotelPageValidation();
			
			 if (bookHotelPageValidation.isDisplayed()) 
		        {
		            System.out.println("we have entered the Book Hotel page successfully");
		        }
		        else 
		        {
		            System.out.println("we have  Not entered the Book Hotel page successfully");
		        }
		}
		
		@Test(priority = 12)
		public void BookHotelPageValueField()
		{
			
			bookHotelPage = pageManager.bookHotelPage();
			
			WebElement firstName = bookHotelPage.getFirstName();
			baseClass2.sendKeysByJS(firstName,"Elavarasan");
			
			WebElement lastName = bookHotelPage.getLastName();
			baseClass2.sendKeysByJS(lastName,"S");
			
			WebElement billingAddress = bookHotelPage.getBillingAddress();
	        clearAndSetValueByJS(billingAddress, "Mr. Elavarasan, 2468 Cedar Road, Flat 3A, London, SW1A 1AA, United Kingdom");
			
			WebElement cNum = bookHotelPage.getcNum();
			baseClass2.sendKeysByJS(cNum,"9391810039484324");
			
			WebElement creditCardType = bookHotelPage.getCreditCardType();
			baseClass2.selectByIndex(creditCardType,3);
			
			WebElement month = bookHotelPage.getMonth();
			baseClass2.selectByIndex(month,4);
			
			WebElement year = bookHotelPage.getYear();
			baseClass2.selectByIndex(year,16);
			
			WebElement cvv = bookHotelPage.getCvv();
			baseClass2.sendKeysByJS(cvv,"652");
		
		}
		
		@Test(priority = 13)
		public void BookNowButton() throws IOException, InterruptedException
		{
			bookHotelPage = pageManager.bookHotelPage();
			
			WebElement book = bookHotelPage.getBook();
			baseClass2.clickByJS(book);
			
			baseClass2.TakeScreenshot();
			
			Thread.sleep(8000);
		}
		
		@Test(priority = 14)
		public void BookingConfirmationPage() throws IOException
		{
			System.out.println("hi");
		    bookingConfirmationPage = pageManager.bookingConfirmationPage();
			
			WebElement bookingConfirmationPageValidation = bookingConfirmationPage.getBookingConfirmationPageValidation();
			
			 if (bookingConfirmationPageValidation.isDisplayed()) 
		        {
		            System.out.println("we have entered the Booking Confirmation page successfully");
		        }
		        else 
		        {
		            System.out.println("we have  Not entered the Booking Confirmation page successfully");
		        }
			
		}
		@Test(priority = 15)
		public void BookingConfirmationPageScroll() throws IOException
		{
			bookingConfirmationPage = pageManager.bookingConfirmationPage();
			WebElement scroll = bookingConfirmationPage.getScroll();
			baseClass2.scrollDownByJS(scroll);
			
			baseClass2.TakeScreenshot();
			
		}
		@Test(priority = 16)
		public void BookingConfirmationClick()
		{
			bookingConfirmationPage = pageManager.bookingConfirmationPage();
			WebElement click = bookingConfirmationPage.getClick();
			baseClass2.clickByJS(click);
		}
		
}
