package pageObjectModel;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPageWith_PageFactory {
	
	WebDriver driver;
	// Constructor...........
	public LogInPageWith_PageFactory(WebDriver driver) {
		            this.driver= driver;
		         PageFactory.initElements(driver, this);       
	}
	
	//Locators........................
	      @FindBy(xpath = "//input[@id='user-name']")
	      WebElement username;
	      @FindBy(xpath = "//input[@id='password']")
	      WebElement pasword;
	    @FindBy(xpath ="//input[@id='login-button']" )
	    WebElement loginElement;
	    		 
	        
	 //Action Methods.........................
	void setUserName(String uname) {
		username.sendKeys(uname);
	}
	void setPassword(String pwd) {
		pasword.sendKeys(pwd);
	}
	void clickLogIn() {
		loginElement.click();;
	}
	
	}
	
	

	
	
	
	
	
	
	
	

