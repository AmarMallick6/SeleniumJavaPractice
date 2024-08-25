package seleniumCode;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScreenShotsDemo {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com");
	   
		/*
		 * TakesScreenshot ts = (TakesScreenshot) driver; File src_file =
		 * ts.getScreenshotAs(OutputType.FILE); File target_file= new
		 * File(System.getProperty("user.dir")+"/Screenshot/FullPage.png");
		 * src_file.renameTo(target_file);  //we can use Fileutils.copyfile() method to copy screenshot.
		 * 
		 * WebElement ele = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		 * File source = ele.getScreenshotAs(OutputType.FILE); File targt= new
		 * File(System.getProperty("user.dir")+"/Screenshot/Logo.png");
		 * source.renameTo(targt);
		 */
		   
		   WebElement element = driver.findElement(By.xpath("//div[@aria-label='More on Amazon']"));
		   File src = element.getScreenshotAs(OutputType.FILE);
		   File target= new File(System.getProperty("user.dir")+"/Screenshot/specificelement.png");
		   src.renameTo(target);
		   
		   driver.close();
		
	}

}
