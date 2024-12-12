package page;

import org.global.BaseClass2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAgainPage extends BaseClass2
{
	public LoginAgainPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Click here to login again']")
    private WebElement loginLink;

	public WebElement getLoginLink() 
	{
		return loginLink;
	}	

}

