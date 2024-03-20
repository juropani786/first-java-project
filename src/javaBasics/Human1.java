package javaBasics;

public abstract class Human1 {
String name;
	
	public Human1(String name) {  // constructor
		this.name = name;
	}
	public Human1() { // constructor
		
	}
	
	//there can be abstract and concrete methods in the abstract class. If the method has its implementation
	//then the method is concrete otherwise it is abstract.
	
	public void eat() { // concrete method
		System.out.println("The human being eats something....");
	}
	
	public abstract void walk(); //abstract method - without implementation
	
	public abstract void learn();


}
