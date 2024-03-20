package javaBasics;

public class MethodOverloading {
	// polymorphism is a technique of defining a function in a different way.
	// 1. Method Overloading/ compile time polymorphism.
	// 2. Method overriding is a way of defining same function in a different way.
	// while using method overloading
	// we create the same method name with different argument type or sequence.
	// 1. number of parameters (number of parameters should be different)
	// 2. data type parameters should be different)
	// 3. sequence of parameters should be different

	public void learn(String num, int num1) {
		System.out.println(" This is from the first function");
	}

	public void teach() {
		System.out.println(" This is not a overloading method");
	}

	public void learn(int num1, String num) {
		System.out.println(" This is from the second function");
	}

	public void learn(int num) {
		System.out.println(" This is from the third function");
	}

	public void learn() {
		System.out.println(" This is from the fourth function");
	}

	public void learn(String name) {
		System.out.println(" This is from the fifth function");
	}

	public static void main(String[] args) {
		MethodOverloading methodOverloading = new MethodOverloading();
		methodOverloading.learn("Something");
		methodOverloading.learn("Ram", 5);
		methodOverloading.learn(3, "Madhu");
	}
}
