package pageObjectModel;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPageWithout_PageFactory {
	
	WebDriver driver;
	// Constructor...........
	public LogInPageWithout_PageFactory(WebDriver driver) {
		                this.driver= driver;
	}
	
	//Locators........................
	      By   u_namelocator= By.xpath("//input[@id='user-name']");
	      By   pwd_locator   = By.xpath("//input[@id='password']");
	      By     login_locator= By.xpath("//input[@id='login-button']");
	      
	      
	 //Action Methods.........................
	void setUserName(String uname) {
		driver.findElement(u_namelocator).sendKeys(uname);
	}
	void setPassword(String pwd) {
		driver.findElement(pwd_locator).sendKeys(pwd);
	}
	void clickLogIn() {
		driver.findElement(login_locator).click();;
	}
	
	}
	
	

	
	
	
	
	
	
	
	

