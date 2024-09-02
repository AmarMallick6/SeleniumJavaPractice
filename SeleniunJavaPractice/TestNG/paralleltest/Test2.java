package paralleltest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {

	WebDriver driver;

	@BeforeClass
	@Parameters({"browser"})
	 void SetUp(String b) {
		switch (b.toLowerCase()) {
		case "chrome":driver= new ChromeDriver();break;
		case "firefox":driver= new FirefoxDriver();break;	
		case "edge":driver= new EdgeDriver();break;	
		default: System.out.println("Invalid Browser");
		return;
		
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.meesho.com");
	}

	@Test
	void titleTest() {
		String Act_Title = driver.getTitle();
		Assert.assertEquals(Act_Title, "Online Shopping Site for Fashion, Electronics, Home & More | Meesho");
	}

	@Test
	void urlTest() {
		String Act_url = driver.getCurrentUrl();
		Assert.assertEquals(Act_url, "https://www.meesho.com/");
	}

	
	  @AfterClass 
	  void tearDown() { 
		  driver.close(); }
	 

}
