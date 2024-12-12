package page;

import org.global.BaseClass2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends BaseClass2
{
	    public SelectHotelPage()
	    {
		 PageFactory.initElements(driver, this);
	    }
	
	    @FindBy(xpath = "//td[@class='login_title']") 
	    private WebElement selectHotelValidation;
	  
	    @FindBy(xpath = "//input[@id='radiobutton_0']")
	    private WebElement selectHotel;

	    @FindBy(xpath = "//input[@id='continue']")
	    private WebElement continue0;

		public WebElement getSelectHotelValidation()
		{
			return selectHotelValidation;
		}

		public WebElement getSelectHotel()
		{
			return selectHotel;
		}

		public WebElement getContinue0()
		{
			return continue0;
		}
	    
	    

}
