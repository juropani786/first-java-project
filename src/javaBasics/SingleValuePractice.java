package javaBasics;

import java.util.ArrayList;

public class SingleValuePractice {
public static void main(String[]args) {
	ArrayList<String> single = new ArrayList<>();
	single.add ("Sargun");
	single.add("Pooja");
	single.add("Gary");
	single.add("Gopi");
	single.add("Meenu");
	single.add("Nisha");
	single.add("Nisha");
	System.out.println(single);
	if (single.contains("Nisha")) {
		single.remove("Sargun");
	}else {
		single.add("Nisha");
	}
	System.out.println(single);
	for (String str : single) {
		System.out.println(str);
}

}
}