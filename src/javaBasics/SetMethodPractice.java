package javaBasics;

import java.util.HashSet;
import java.util.Iterator;

public class SetMethodPractice {

	public static void main(String[] args) {

		HashSet<String> key = new HashSet<String>();
		key.add("Ramesh");
		key.add("Binod");
		key.add("Sahil");
		key.add("Aron");
		Iterator<String> lock = key.iterator();
		while (lock.hasNext()) {
			System.out.println(lock.next());

			/*
			 * for(String str : key) { System.out.println(str); }
			 */
		}
	}
}
