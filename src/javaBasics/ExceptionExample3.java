package javaBasics;

public class ExceptionExample3 {

	public static void main(String[] args) {
		String name = "Kishwor";
		try {
		int num = 4;
		int num2 = 1;
		int division = num / num2;
		System.out.println(division);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("This is after division");
		char[] ch = name.toCharArray();
		for (int i = 0; i < name.length(); i++) {
			System.out.println(ch[i]);
		}

	}

}
