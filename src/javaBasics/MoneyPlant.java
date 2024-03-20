package javaBasics;

public class MoneyPlant implements Plant, Tree  {
	
	@Override
		public void grow() {
			System.out.println("the money plant grows.......");
	 
		}
	 
		@Override
		public void purityAir() {
			System.out.println("the money plant purifies air.......");
	 
		}
	 
		@Override
		public void takesCo2() {
			System.out.println("the money plant takes CO2 in........");
	 
		}
		
		public static void main(String [] args) {
			MoneyPlant plant = new MoneyPlant();
			plant.grow();
			plant.purityAir();
			plant.takesCo2();
		}
	 
		@Override
		public void throwsO2() {
			System.out.println("The money plant throws O2............");
			
		}

}
