package javaCode;



public class FindDuplicateValuesFromArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,3,1};
		boolean v=false;
		for (int i = 0; i < a.length; i++) {
			 for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					System.out.println("Duplicates values are:"+ a[i]);
					 v=true;
				}
			}
		}
		if (v==false) {
			System.out.println("No Duplicate value is present");
		}

	}

}
