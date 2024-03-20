package javaBasics;

public class Workers extends CompanyStatus{
	String CompanyHas= "Name";
	int workingHours =8;
	public void employment() {
		System.out.println("This is from the workers class");
	}
		public static void main(String[]args) {
			Workers workers = new Workers ();
			CompanyStatus companyStatus = new CompanyStatus();
			CompanyStatus companyStatus1 = new Workers();
			System.out.println(companyStatus.NumOfWorkers);
			System.out.println(companyStatus.Company);
			companyStatus.employment();
			System.out.println(workers.CompanyHas);
			System.out.println(workers.workingHours);
			companyStatus1.employment();
			
			
		}
}
