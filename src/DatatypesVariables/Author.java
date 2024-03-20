package DatatypesVariables;

public class Author {
	static int numOfBooksPublished = 10; //numOfBooksPublished- instance variable
	static float netWorth =50000.55f; //netWorth - static variable
	
	
	public static void main(String [] args) {
		Author author = new Author(); //object creation
		
	
	String name = "Nur"; // name -local variable 
	System.out.println(" name of author " +name);
System.out.println("income of year " +netWorth);
System.out.println(" total number of published books" +numOfBooksPublished);
	}
}

// make equal opening and closing braces


