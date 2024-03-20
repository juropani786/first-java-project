package javaBasics;

public class Teacher extends College {
	// The teacher class (child class) is inheriting the properties and method of the parent class(College)
	//Inheritance is the way of accessing all the common properties and method of the parent class and defining only unique properties and method of the child class 
// The 'extends' keyword is used to inherit the parent class' properties and methods.
	
	String teacherName ="Nur";
	public void motivate() {
		System.out.println(" The teacher is responsible for motivating the students.");
		
	
		
}
	public static void main(String [] args) {
		Teacher teacher = new Teacher ();
		
		System.out.println(teacher.teacherName);
		teacher.motivate();
		System.out.println(collegeName);
		System.out.println(teacher.numOfStudents);
		teacher.teach();
	}
		
	}
