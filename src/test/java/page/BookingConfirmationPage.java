package page;

import org.global.BaseClass2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmationPage extends BaseClass2
{
	  public BookingConfirmationPage()
	  {
		  PageFactory.initElements(driver, this);
	  }
	
	  @FindBy(xpath = "//td[@class='login_title']") 
      private WebElement bookingConfirmationPageValidation;
	
	  @FindBy(xpath = "//input[@id='my_itinerary']")
	    private WebElement scroll;
	  
	  @FindBy(xpath = "//input[@id='my_itinerary']")
	    private WebElement click;

	public WebElement getBookingConfirmationPageValidation() 
	{
		return bookingConfirmationPageValidation;
	}

	public WebElement getScroll() 
	{
		return scroll;
	}

	public WebElement getClick()
	{
		return click;
	}

	
	  
	  

}
