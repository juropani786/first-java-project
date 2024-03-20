package Loops;

public class ForLooptofindsingleindex {

	public static void main(String[] args) {
		String hobbies[] = {"singing", "dancing", "reading", "playing"};
		for (int i=0; i <hobbies.length; i++) {
			if (hobbies [i].equals("dancing")){
		System.out.println(hobbies [i]);
		
			}	
			
			
			int indexToPrint =3; // process to print a single selected index.
			if (indexToPrint >= 0 && indexToPrint < hobbies.length) {
				System.out.println("Name at index" +indexToPrint + ":" +hobbies[indexToPrint]);
			} else {
				System.out.println("Invalid index");
			}
		}
			}

	}

				
