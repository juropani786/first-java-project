
public class FindingSinlgeValue {

	public static void main(String[] args) {
		// print out the word 'my' if that exists
				// 'my' word exists or not -- conditional statement
				
				System.out.println("This is for evaluting if my word exsits");
				String name = "This is my name"; // single value
		 
				String[] names = name.split(" "); // splitting on the basis of space-- names ={"This", "is", "my", "name"}
				for (int i = 0; i < names.length; i++) {
					if (names[i].equals("my")) {
						System.out.println(names[i]);
						break; // it comes out of the loop
					}
				}

	}

}
