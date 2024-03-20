package DatatypesVariables;

public class Deposit {
	int code = 4532; //instance variable
	static int phoneNumber = 57543365;  //static variable
	
	public static void main(String [] args) {
		
		Deposit deposit = new Deposit();// object creation
		double depositAmt = 4000.45; //local variable
		Deposit deposit1 = new Deposit();
		Deposit deposit2 = new Deposit();
		
		System.out.println(phoneNumber);
		System.out.println(deposit.code);//object is used to access the instance variable
		
		// variable is a container which stores some value that can be changed.
// 1. local variable -- defined inside the method/it is accessible within the method only.
		// 2. instance variable  -- defined outside the method without static keyword
		// 3. static/class variable -- defined outside the method with static keyword
 
		// instance variable -- need to create instance of class(object creation)
		//static variable --no need to create instance/object of class.
		
		Deposit deposit3 = new Deposit();
		float depositAmt1 =5000.55f;
		int deposit4 = 6000;
		System.out.println("deposit3");
		System.out.println("depositAmt");
		System.out.println("depost4");
		
		
		System.out.println("after the change");
		deposit1.code = 6666;
		phoneNumber = 1111111;
		System.out.println("Instance value");
		System.out.println(deposit.code);//instance		
		System.out.println(deposit1.code);//instance
		System.out.println(deposit2.code);//instance
		System.out.println("Static value");
		System.out.println(deposit.phoneNumber);//static 		
		System.out.println(deposit1.phoneNumber);//static
		System.out.println(deposit2.phoneNumber);//static
		
		
		//every instance variable has its own copy of object --instance
		//all instances have one copy of object
		
	}
}
