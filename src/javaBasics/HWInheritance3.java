package javaBasics;

public class HWInheritance3 extends HWInheritance{
	
		String CarName3 ="Honda";
		
		public void excellent () {
			System.out.println("the excellent car");
		}
		public static void main(String[]args) {
			HWInheritance3 hondacar = new HWInheritance3();
			System.out.println(hondacar.carName);
			System.out.println(hondacar.carNumber);
			System.out.println(hondacar.color);
			System.out.println(hondacar.CarName3);
			hondacar.excellent();
		}
		}


