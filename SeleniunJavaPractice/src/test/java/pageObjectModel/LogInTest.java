package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.*;

public class LogInTest {
	WebDriver driver;
	@BeforeMethod
	void setUP() {
		 driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
	}
	
	@Test
	void logInTest() {
		//LogInPageWithout_PageFactory lp = new LogInPageWithout_PageFactory(driver); 
		LogInPageWith_PageFactory lp = new LogInPageWith_PageFactory(driver);
		lp.setUserName("standard_user");
		lp.setPassword("secret_sauce");
		lp.clickLogIn();
	}
	
	@AfterMethod
	void tearDown() {
		driver.close();
	}
	
	}
	

