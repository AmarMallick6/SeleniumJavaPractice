package grouping;

import org.testng.annotations.Test;

public class Class3 {
	@Test(priority = 1,groups = {"Sanity","Functional"})
	void paymentTest() {
		System.out.println("Payment Test Pass ");
	}
	@Test(priority = 2,groups = {"Sanity","Functional"})
	void productCompareTest() {
		System.out.println(" productCompareTest Pass ");
	}

}
