package page;

import org.global.BaseClass2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends BaseClass2

{
	public BookHotelPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//td[text()='Book A Hotel ']") 
    private WebElement bookHotelPageValidation;
	
	@FindBy(xpath = "//input[@id='first_name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='last_name']")
    private WebElement lastName;

    @FindBy(xpath = "//textarea[@class='txtarea']")
    private WebElement billingAddress;

    @FindBy(xpath = "//input[@id='cc_num']")
    private WebElement cNum;

    @FindBy(xpath = "//select[@id='cc_type']")
    private WebElement creditCardType;

    @FindBy(xpath = "//select[@id='cc_exp_month']")
    private WebElement month;

    @FindBy(xpath = "//select[@id='cc_exp_year']")
    private WebElement year;

    @FindBy(xpath = "//input[@id='cc_cvv']")
    private WebElement cvv;

    @FindBy(xpath = "//input[@id='book_now']")
    private WebElement book;

	public WebElement getBookHotelPageValidation()
	{
		return bookHotelPageValidation;
	}

	public WebElement getFirstName()
	{
		return firstName;
	}

	public WebElement getLastName()
	{
		return lastName;
	}

	public WebElement getBillingAddress()
	{
		return billingAddress;
	}

	public WebElement getcNum()
	{
		return cNum;
	}

	public WebElement getCreditCardType() 
	{
		return creditCardType;
	}

	public WebElement getMonth()
	{
		return month;
	}

	public WebElement getYear() 
	{
		return year;
	}

	public WebElement getCvv()
	{
		return cvv;
	}

	public WebElement getBook()
	{
		return book;
	}
    
    


}
