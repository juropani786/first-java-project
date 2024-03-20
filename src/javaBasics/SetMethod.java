package javaBasics;

import java.util.HashSet;
import java.util.Iterator;

public class SetMethod {

	public static void main(String[] args) {
		//Set<String> set = new HashSet<String>();
				HashSet<String> set = new HashSet<String>();
				set.add("Madhu");
				set.add("Nur");
				set.add("Ram");
				set.add("Nur");
				Iterator<String> it = set.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}
				/*for(String str : set) {
					System.out.println(str);
				} */
	}

}
