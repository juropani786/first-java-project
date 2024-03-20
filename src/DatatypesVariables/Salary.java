package DatatypesVariables;

public class Salary {
	int salaryAmt= 10000;
	
	static int annualIncome= 120000;
	public static void main(String[] args){
		Salary salary= new Salary(); // object creation
		boolean isDirectDeposit= true;
		System.out.println(" per month salary "+salary.salaryAmt);
		System.out.println( " income in a year" +annualIncome);
		System.out.println("Direct deposte" +isDirectDeposit);
	}

	
		
	}




	
