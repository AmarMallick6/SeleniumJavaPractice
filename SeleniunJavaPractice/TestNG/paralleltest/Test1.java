package paralleltest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
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
		void titleLogoTest() {
		String Act_logo= driver.findElement(By.xpath("//img[@alt='Meesho Logo']")).getAttribute("alt");
		Assert.assertTrue(Act_logo.contains("Meesho"),"Not matched" );
		}
	@AfterClass
	void tearDown() {
		driver.close();
	}
	

}
