package javaBasics;

public class PhysicsTeacher {
	public char[] location;
	public char[] teachName;

	public class PysicsTeacher extends Teacher{
		 
	

		private static String teachName = "Rocky";

		public static void main(String[] args) {
			PhysicsTeacher pysicsTeacher = new PhysicsTeacher(); // IS -A relationship
			System.out.println(pysicsTeacher.location);
			System.out.println(pysicsTeacher.teachName);
			
			Teacher teacher = new Teacher();
			teacher.motivate();  // HAS- A  relationship
			teacher.teach();
			System.out.println(teacher.teacherName);
		}
	}
}






//there are two types of relationship between the classes.
//1. HAS-A relationship -- object - there is not parent-child relation - Human has brain
//2. IS-A relationship(inheritance) -- extends -there is parent-child relation - Apple is fruit

//if all methods and attributes of a class are used in another class, then we need to create
//is-a relation(inheritance) otherwise we need to use has-a relation(object).