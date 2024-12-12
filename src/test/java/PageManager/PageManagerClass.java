package PageManager;

import org.global.BaseClass2;

import page.BookHotelPage;
import page.BookedLtineraryPage;
import page.BookingConfirmationPage;
import page.LoginAgainPage;
import page.LoginPage;
import page.SearchHotelPage;
import page.SelectHotelPage;

public class PageManagerClass extends BaseClass2
{
    
	private LoginPage loginpage;
	private SelectHotelPage selectHotelPage;
	private SearchHotelPage searchHotelPage;
	private BookHotelPage bookHotelPage;
	private BookedLtineraryPage bookedLtineraeyPage;
	private BookingConfirmationPage BookingConfirmationPage;
	private LoginAgainPage LoginAgainPage;
	
	
	public LoginPage loginpage()
	{
		return(loginpage==null)?loginpage = new LoginPage():loginpage;
	}
	
	public SearchHotelPage searchHotelPage()
	{
	    return (searchHotelPage == null) ? searchHotelPage = new SearchHotelPage() : searchHotelPage;
	}

	public SelectHotelPage selectHotelPage()
	{
		return(selectHotelPage==null)?selectHotelPage = new SelectHotelPage():selectHotelPage;
	}


	public BookHotelPage bookHotelPage()
	{
	    return (bookHotelPage == null) ? bookHotelPage = new BookHotelPage() : bookHotelPage;
	}
	
	public BookingConfirmationPage bookingConfirmationPage()
	{
	    return (BookingConfirmationPage == null) ? BookingConfirmationPage = new BookingConfirmationPage() : BookingConfirmationPage;
	}

	public BookedLtineraryPage bookedLtineraryPage()
	{
	    return (bookedLtineraeyPage == null) ? bookedLtineraeyPage = new BookedLtineraryPage() : bookedLtineraeyPage;
	}

	public LoginAgainPage loginAgainPage()
	{
	    return (LoginAgainPage == null) ? LoginAgainPage = new LoginAgainPage() : LoginAgainPage;
	}

	
	
	
	
	
}
