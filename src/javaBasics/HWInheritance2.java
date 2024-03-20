package javaBasics;

public class HWInheritance2 extends HWInheritance {
	String CarName2 = "Corola";
	public void better() {
		System.out.println("The quality of the car is better than the other cars");
	}
		public static void main(String [] args) {
			HWInheritance2 corolacar = new HWInheritance2 (); 
			System.out.println(corolacar.carName);
			System.out.println(corolacar.carNumber);
			System.out.println(corolacar.color);
			System.out.println(corolacar.numOfWheel);
			
			
		}
	


	}
	

