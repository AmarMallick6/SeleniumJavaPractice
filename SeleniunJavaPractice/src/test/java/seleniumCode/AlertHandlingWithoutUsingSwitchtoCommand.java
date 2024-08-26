package seleniumCode;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHandlingWithoutUsingSwitchtoCommand {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));  //declaration
		driver.findElement(By.xpath("//button[normalize-space()='Confirm Box']")).click();
		    Alert NormalAlert = wait.until(ExpectedConditions.alertIsPresent());   //usage
		    
            NormalAlert.accept();
	}

}
