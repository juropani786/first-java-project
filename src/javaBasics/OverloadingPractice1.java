package javaBasics;

public class OverloadingPractice1 {

	public void sing(String Ram, int num) { //sing is a method name here.
		System.out.println(" Number of parameters are different");
	}
	public void sing(int num1, String Ram) { // parameter are inside the  method
		System.out.println("Data type parameters are different");
	}

	public void sing(int num) {
		System.out.println("It has only one data type");
	}

	public void sing() {
		System.out.println(" It does not have any data type");
	}

	public void sing(String Ram) {
		System.out.println(" It has one non primitive datatype");
	}

	public static void main(String[] args) {
		OverloadingPractice1 javaoverlaoding = new OverloadingPractice1(); //same method but we implement it in a different way.

		javaoverlaoding.sing("Shyam");
		javaoverlaoding.sing("Hanuman", 8);
		javaoverlaoding.sing(8, "Salman");
	}
}
