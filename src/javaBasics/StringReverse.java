package javaBasics;

public class StringReverse {
	public static void main(String[]args) {
	String name ="Jenny";
	for (int i=name.length()-1; i>=0; i--) {
		System.out.println(name.charAt(i));
	}
		//alternative reverse
	System.out.println("This is an alternative reverse ");
	StringBuffer string = new StringBuffer(name);
	System.out.println(string.reverse());
	
	
	//convert int to string.
	int num = 12345;
	String Convert = String.valueOf (num);
	StringBuilder stringbuilder = new StringBuilder(Convert);
	System.out.println(stringbuilder.reverse());
	}
}



	
	

