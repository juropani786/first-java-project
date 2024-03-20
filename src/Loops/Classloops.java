package Loops;

public class Classloops {
	public static void main(String [] args) {
		
		// nested loop is a loop where another loop is there inside the loop
				for (int i = 1; i <= 2; i++) { // int i =1 -- i is variable //outer loop
					System.out.println("Inside the nested loop");
					for (int j = 5; j <= 7; j++) // inner loop
						// ++ increased by 1 every time
						System.out.println(j);
				}
				// infinite loop is a loop where condition never becomes false. Never make any
				// loop infinite.
				/*for (int k = 100; k <= 100; k++) {
					System.out.println("Hello world");
				}
				//for (int l = 10; l >= 10; l++) {
					System.out.println("Infinite loop");
				} */
				// while loop checks condition before it executes the block of code
				int num = 10; // initialization
				while (num < 10) { // condition
					System.out.println("The value from while loop: "+ num);
					num++; // increment
				}
				// do while loop executes the the block of code once and only then go to the condition
				int num2 = 10;
				do {
					System.out.println("The value from do while loop:" +num2);
					num2++;
				} while (num2 < 10);
	




//array is used to store multiple values in a single variable
		int cellNum[] = new int[5];  // 1. alternative - defining array
		cellNum[0] = 45;
		cellNum[1] = 23;
		cellNum[2] = 90;
		cellNum[3] = 76;
		cellNum[4] = 34;
		System.out.println(cellNum[2]);


		

		
		int cellNum2[] = {12, 43, 65, 34, 10, 34}; //2. alternative - defining array. we need to declare [] to make it array
		System.out.println(cellNum2[1]);
		
		System.out.println("loop for array");
		for(int l = 2; l < cellNum2.length ; l++ ) {
			System.out.println(cellNum2[l]);
		}
		
		System.out.println("Enhance loop");

		//enhanced loop
		for(int variableName : cellNum2) {
			System.out.println(variableName);
		}
		}
		}