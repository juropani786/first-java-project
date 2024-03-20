package javaBasics;

public class Account {
String name;
int age;
public void main (String[]args) {
	Account account = new Account();
	account.age =35;
	account.name = "Jack Sparrow";
	System.out.println(account.age);
	System.out.println(account.name);	
}

public void setName(String name) {
	this.name = name;
}
public void setAge (int age) {
	this.age = age;
}
	public  String getName() {
		return this.name;
	}
public int getAge() {
	return this.age;
}

}
