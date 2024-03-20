package DatatypesVariables;

public class farmer {
	boolean plough = true;
	

	public static void main(String [] args) {
int production = 20;
double rate = 40.55;
boolean isgoodrate = true;
byte productionTime =6;
farmer object = new farmer (); // java is case sensitive

System.out.println("production of the year " +production);
System.out.println("price of the crops " +rate);
System.out.println("rate of the crops " +isgoodrate);
System.out.println("assigned time " +productionTime);
System.out.println("does plough " +object.plough); // object.variable
}
}
