package javaBasics;

public class Boy extends Human1{

	public Boy(String name) { // constructor
			super(name); // super() invokes constructor of the parent class
	 
			System.out.println("This is constructor with params");
		}
	 
		public Boy() {
			System.out.println("This is constructor without params");
		}
	 
		@Override
		public void walk() {
			System.out.println("The boy walks........");
	 
		}
	 
		@Override
		public void learn() {
			System.out.println("The boy learns........");
	 
		}
	 
		public static void main(String[] args) {
			Boy boy = new Boy("Ram");
//			Boy boy1 = new Boy();
//			System.out.println(boy1.name);
			System.out.println(boy.name);
			boy.walk();
			boy.learn();
			boy.eat();
	 
		}
}
