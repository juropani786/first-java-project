package ConditionalPractice;

public class JavaPractice {
	public static void main(String[]args) {
String name[] = {"Ramesh", "Kishwor", "Aron", "Avan", "Cool"};
int cellNum[] = {984165344, 866393748};

for (int i =0; i <name.length; i++) {
	System.out.println(name[0]);
	
	System.out.println(name[i]);
	System.out.println(name[0]);
	System.out.println(name[1]);
	System.out.println(name[2]);
	System.out.println(name[3]);
	System.out.println(name[4]);
	
	
	
	
}

String hobbies[] = {"singing", "dancing", "reading", "playing"};
for (int i=0; i <=hobbies.length; i++) {
	System.out.println(hobbies [i]);
	System.out.println( hobbies [0]);
	System.out.println(hobbies [1]);
	System.out.println(hobbies [2]);
	System.out.println(hobbies [3]);
	
	int indexToPrint =2;
	if (indexToPrint >= 0 && indexToPrint < hobbies.length) {
		System.out.println("Name at index" +indexToPrint + ":" +hobbies[indexToPrint]);
	} else {
		System.out.println("Invalid index");
	}
}
	}
}
	

	

			

