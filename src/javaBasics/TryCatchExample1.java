package javaBasics;

public class TryCatchExample1 {

	public static void main(String[] args) {
		try { // it is a try block
		int []a = {4,5,1};
		System.out.println(a[3]);
		}catch (Exception e) { // catch block.
			System.out.println("An exception occured!");
		}
		
	}

}
