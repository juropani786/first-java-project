package javaBasics;

public class Cooperative implements Bank, Finance{
	public void test() {
		System.out.println(" Test is taken");// there can be created multiple method even in the child class and can be printed.
	}
	

	public static void main(String[]args) {
		Cooperative cooperative = new Cooperative ();
		cooperative.chargesinterest();
		cooperative.transfer();
		cooperative.deposit();
		cooperative.providesloan();
		System.out.println(cooperative.withdraw);
		cooperative.test();
		
	}
	@Override
	public void chargesinterest() {
	System.out.println("The cooperative charges high interest");
		
	}
	@Override
	public void deposit() {
	
		System.out.println("The money is deposited");
		
	}
	@Override
	public void transfer() {
		System.out.println("The money is transferred");
	
		
	}
	@Override
	public void providesloan() {
		System.out.println("The money is provided");
		
		
	}	
	
}
	

//}