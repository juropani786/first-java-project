package DatatypesVariables;

public class Workers {

int numberOfWorkers =100;
static int monthlyIncome = 40000;


public static void main(String [] args) {
	Workers payment= new Workers();
	
	byte attendedMeeting = 5;


System.out.println("total number of workers " +payment.numberOfWorkers);
System.out.println(" earning per month" +monthlyIncome);
System.out.println("number of organised meeting" +attendedMeeting);
}
}


