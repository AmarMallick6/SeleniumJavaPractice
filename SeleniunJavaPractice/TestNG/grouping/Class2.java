package grouping;


import org.testng.annotations.Test;

public class Class2 {
	@Test(priority = 1,groups = {"Sanity"})
	void advanceSearchTest() {
		System.out.println("Advance Search Test Pass ");
	}
	@Test(priority = 3,groups = {"Sanity"})
	void addToCatTest() {
		System.out.println("Add to cart Test Pass ");
	}

}
