package javaBasics;

import java.util.Scanner;

public class TryCatchExample2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What's your fav. number?");
		try {
			int n = scan.nextInt();
			System.out.println(n);
		} catch (Exception e) {
			System.out.println("Sorry, please enter a number");
		}
	}

}
