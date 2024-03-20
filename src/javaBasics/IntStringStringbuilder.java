package javaBasics;

public class IntStringStringbuilder {
	public static void main(String[]args) {
		int num1 = 8;
				String conversion = String.valueOf(num1);
		System.out.println(conversion);
		int num2 = 789654;
		String conversion2 = String.valueOf(num2);
		StringBuilder sbr = new StringBuilder(conversion2);
		System.out.println(sbr.reverse());
		
	}
}

