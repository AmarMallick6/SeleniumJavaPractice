package chromeoptions;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import net.bytebuddy.utility.dispatcher.JavaDispatcher.IsConstructor;

public class HeadlessBrowserTesting {

	public static void main(String[] args) {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless=new");
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://irctc.co.in");
		String pnr = driver.findElement(By.xpath("//div[@class='hidden-xs']//label[normalize-space()='PNR STATUS']")).getText();
		if (pnr.equalsIgnoreCase("PNR STATUS")) {
			System.out.println("Element is present");}
			else {
				System.out.println("Element Is not present");
			}
			driver.close();
		
	}

}
