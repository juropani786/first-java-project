package javaBasics;

public class EncapsulationImp2 {
	public static void main(String[] args) {
		
		EncapsulationPractice1 encapsulationPractice1= new EncapsulationPractice1();
		encapsulationPractice1.setnumberOFStaff1(8);
		System.out.println(encapsulationPractice1.getnumberOFStaff1());
		encapsulationPractice1.setOwnerName("John");
		System.out.println(encapsulationPractice1.getOwnerName());
	}

}
