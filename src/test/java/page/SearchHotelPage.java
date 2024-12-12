package page;

import org.global.BaseClass2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass2
{

	public SearchHotelPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//td[@class='login_title']") 
    private WebElement searchHotelPageValidation;
	
	@FindBy(xpath = "//select[@id='location']")
    private WebElement location;

    @FindBy(xpath = "//select[@id='hotels']")
    private WebElement hotel;

    @FindBy(xpath = "//select[@id='room_type']")
    private WebElement room;

    @FindBy(xpath = "//select[@id='room_nos']")
    private WebElement noOfRooms;

    @FindBy(xpath = "//input[@id='datepick_in']")
    private WebElement checkInDate;

    @FindBy(xpath = "//input[@id='datepick_out']")
    private WebElement checkOutDate;

    @FindBy(xpath = "//select[@id='adult_room']")
    private WebElement adultsPerRoom;

    @FindBy(xpath = "//select[@id='child_room']")
    private WebElement childrenPerRoom;

    @FindBy(xpath = "//input[@id='Submit']")
    private WebElement search;

	public WebElement getSearchHotelPageValidation()
	{
		return searchHotelPageValidation;
	}

	public WebElement getLocation()
	{
		return location;
	}

	public WebElement getHotel()
	{
		return hotel;
	}

	public WebElement getRoom()
	{
		return room;
	}

	public WebElement getNoOfRooms()
	{
		return noOfRooms;
	}

	public WebElement getCheckInDate() 
	{
		return checkInDate;
	}

	public WebElement getCheckOutDate() 
	{
		return checkOutDate;
	}

	public WebElement getAdultsPerRoom()
	{
		return adultsPerRoom;
	}

	public WebElement getChildrenPerRoom() 
	{
		return childrenPerRoom;
	}

	public WebElement getSearch() 
	{
		return search;
	}
    
    
}
