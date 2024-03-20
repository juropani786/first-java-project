package javaBasics;

	public class SoccerPlayers extends Players{
		
		String playerHas = "Football";
		
		int practiceHours = 5;
		
		
		public void play() {  // play() -->overriding method
			System.out.println("This is from child class.....");
		}
		
		public static void main(String [] args) {
			SoccerPlayers soccerPlayers = new SoccerPlayers();// parent and child class can be accessible
			Players players = new Players(); //parent class only can be accessible
			Players players1 = new SoccerPlayers(); // this is only for overriding. reference is from parent and object of child class is created
			System.out.println(soccerPlayers.hasJersey);
			System.out.println(soccerPlayers.playerHas);
			soccerPlayers.play(); //the child class is invoked
			players.play(); // the parent class is invoked
			players1.play(); // it is pointing to the parent class
			
		}
}