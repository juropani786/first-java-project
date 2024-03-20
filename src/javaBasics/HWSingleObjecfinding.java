package javaBasics;

public class HWSingleObjecfinding {
	public static void main(String[]args) {
		
		
		
		String books []= {"Maths", "Science", "Economics", "Computer","Account"};
		for (int i=0; i<books.length; i++) {
			if (books[i].equals("Maths")){
					System.out.println(books[i]);
			}
		}
	

int scoring = 50;
if (scoring>=0 && scoring<books.length) {
	System.out.println("Name of the books" +books +":" +books[scoring]);
}else {
	System.out.println("Invalid book's names");
}
	}
}