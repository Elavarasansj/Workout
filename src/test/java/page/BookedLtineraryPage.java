package page;

import org.global.BaseClass2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedLtineraryPage extends BaseClass2
{
    public BookedLtineraryPage()
    {
    	PageFactory.initElements(driver, this);
    }
	
	@FindBy(xpath = "//td[@class='login_title']") 
    private WebElement BookedLtineraryPageValdation;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]") 
    private WebElement checkBox;

    @FindBy(xpath = "//input[@name='cancelall']") 
    private WebElement cancel;
    
    @FindBy(xpath = "//input[@id='logout']") 
    private WebElement logout;

	public WebElement getBookedLtineraryPageValdation()
	{
		return BookedLtineraryPageValdation;
	}

	public WebElement getCheckBox()
	{
		return checkBox;
	}

	public WebElement getCancel()
	{
		return cancel;
	}

	public WebElement getLogout() 
	{
		return logout;
	}


    
}
