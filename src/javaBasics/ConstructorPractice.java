package javaBasics;

public class ConstructorPractice {
	String name = "Jack";

	public ConstructorPractice() {
		System.out.println("Jack is a hilarious guy");
	}

	public ConstructorPractice(String name) {
		this.name = name;
	}

	public ConstructorPractice(int num) {
		System.out.println("This is a constructor with argument");
	}

	public ConstructorPractice(String name, int num) {
		System.out.println("This constroctor has two arguments");

	}

	public static void main(String[] args, Object constructorPractice3) {
		ConstructorPractice constructorPractice = new ConstructorPractice("John");
		ConstructorPractice constructorPractice1 = new ConstructorPractice("Danny");
		ConstructorPractice constructorPractice2 = new ConstructorPractice("Tommy");

		System.out.println(constructorPractice.name);
		System.out.println(constructorPractice1.name);
		System.out.println(constructorPractice2.name);
		

	}
}
