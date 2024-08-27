package topic_Dependency;

import org.testng.Assert;
import org.testng.annotations.*;

public class DemoDependency {

	
	@Test(priority = 1)
		 void launchApp() {
		System.out.println("App launched");
		
	}	
	@Test(priority = 2,dependsOnMethods = {"launchApp"})
	 void loginApp() {
	System.out.println("LogIn");
	Assert.assertTrue(false);
}	
	@Test(priority = 3,dependsOnMethods = {"loginApp","launchApp"})
	 void searchApp() {
	System.out.println("Search a product");
}	
	@Test(priority = 4)
	 void logoutApp() {
	System.out.println("Logout ");
}	
	@Test(priority = 5)
	 void closeApp() {
	System.out.println("App closed");
}	

	

}
