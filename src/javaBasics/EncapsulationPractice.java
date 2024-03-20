package javaBasics;

public class EncapsulationPractice {
	private int numberOFStaff = 20;
	private String ownerName = "Nick";

	public int getnumberOFStaff1(int numberOFStaff) {
		return numberOFStaff = 20;
	}

	public void setnumberOFStaff1(int numberOFStaff) {
		this.numberOFStaff = numberOFStaff;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

}
