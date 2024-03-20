package javaBasics;

public class Coaching extends InheritancePractice {

	String CoachingName = "Science";

	public void takecoaching() {
		System.out.println(" The student must take coaching classes");
		

	}



public static void main(String[]args) {
	Coaching coaching = new Coaching ();
	System.out.println(coaching.CoachingName);
	coaching.takecoaching();
	System.out.println(coaching.studentName);
	System.out.println(coaching.address);
	coaching.learn(); // caliing the function of the parent class
}	
}
