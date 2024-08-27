package grouping;


import org.testng.annotations.Test;

public class Class1 {
	@Test(priority = 1,groups = {"Smoke"})
	 void launchApp() {
	System.out.println("App launched");
	
}	
	
@Test(priority = 2,groups = {"Smoke"})
void loginApp() {
System.out.println("LogIn");

}	
@Test(priority = 3,dependsOnMethods = {"loginApp","launchApp"},groups = {"Smoke"})
void searchApp() {
System.out.println("Search a product");
}	

@Test(priority = 4,groups = {"Sanity"})
void logoutApp() {
System.out.println("Logout ");
}	


}
