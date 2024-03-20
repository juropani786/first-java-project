package javaBasics;

public class StrngBuilderStrnBuffer {

	public static void main(String[] args) throws NullPointerException, Exception {

		int num = 7;
		String afterConversion = String.valueOf(num);
		System.out.println(afterConversion);

		int num2 = 54356;
		String afterConversion2 = String.valueOf(num2); // convert int to string
		StringBuilder str = new StringBuilder(afterConversion2);// convert string to stringbuilder
		System.out.println(str.reverse());

		String name = "Kishwor";
		System.out.println("Using for loop.....");
		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.println(name.charAt(i));
		}

		System.out.println("using inbuilt reverse method with string buffer....");
		StringBuffer stringBuffer = new StringBuffer(name);
		System.out.println(stringBuffer.reverse());
	
		int age = 17;
		if(age<18) {
			throw new Exception("The age is not valid for casting vote");
		}
		
		}
	}


	
	
	
	


