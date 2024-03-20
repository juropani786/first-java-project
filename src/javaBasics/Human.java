package javaBasics;

public class Human {
	String man;

	public Human() {

	}

	public Human(String man) {
		this.man = man;
	}

	public Human(int num) {
		System.out.println("print the int value");
	}

	public Human(String man, int num) {
		System.out.println("print the two values of the constructor");
	}

public static void main(String[]args) {
	Human man = new Human("Ram");
	Human man1 = new Human(4);
	Human man2 = new Human("Rocky", 7);
	Human man3 = new Human("Ben");
	System.out.println(man.man);
	System.out.println(man1.man);
	System.out.println(man2.man);
	System.out.println(man3.man);
}
}