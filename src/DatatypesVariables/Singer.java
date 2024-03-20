package DatatypesVariables;

public class Singer {
	int numOfSongsReleased =10000;
	 static Float totalIncome = 1000000f;
  
  public static void main(String [] args) {
	  Singer singer = new Singer();
	  String name = "Arijit";
	  System.out.println(" name of singer  " +name);
	  System.out.println(" numOfSongsReleased  " +singer.numOfSongsReleased);
	  System.out.println("income of year " +totalIncome);
	  
  }

}
