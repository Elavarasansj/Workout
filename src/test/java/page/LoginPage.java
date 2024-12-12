package page;

import org.global.BaseClass2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass2
{
	
	    public LoginPage()
	    {
	    	PageFactory.initElements(driver, this);
	    }

	    @FindBy(xpath = "//td[text()='Existing User Login - Build 1']") // Existing User Login element
        private WebElement existingUserLogin;

		@FindBy(xpath = "//input[@id='username']")
	    private WebElement username;	
	
	    
	    @FindBy(xpath = "//input[@id='password']")
	    private WebElement password;

	   
	    @FindBy(xpath = "//input[@id='login']")
	    private WebElement loginButton;
	    
	    
	    public WebElement getExistingUserLogin() 
	    {
			return existingUserLogin;
		}


		public WebElement getUsername()
	    {
			return username;
		}


		public WebElement getPassword() 
		{
			return password;
		}


		public WebElement getLoginButton()
		{
			return loginButton;
		}

	    

}
