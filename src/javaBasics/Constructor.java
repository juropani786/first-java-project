package javaBasics;

public class Constructor {
	// Constructor is a special method which is used to initialize the newly created object. it is invoked while creating objects.
		//1. default constructor -- if the constructor is not defined by the user, the java creates the constructor for the user
		
		//2. constructor without arguments  -- this is created by the user but without any arguments
		//3. constructor with arguments -- this is also created by the user with arguments
		
		String name;
		public Constructor(){ // 2.constructor without arguments
			System.out.println("The counstructor without arguments");
		}
		
		public Constructor(String name) { // 3. constructor with one argument
			this.name = name;
		}
		
		public Constructor(int num) {
			System.out.println("The counstructor with one argument having int value");
		}
		
		public Constructor(String name, int num) { //3. constructor with two arguments
			System.out.println("The counstructor with two arguments");
			
			
		
		}
		
		
		public static void main(String [] args) {
			
			Constructor constructor = new Constructor("Kishwor");
			Constructor constructor1 = new Constructor("Nur");
			Constructor constructor2 = new Constructor("Madhu");
			System.out.println(constructor.name);
			System.out.println(constructor1.name);
			System.out.println(constructor2.name);
			
		}

}



