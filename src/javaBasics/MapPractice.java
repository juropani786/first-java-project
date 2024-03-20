package javaBasics;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapPractice {
	public static void main(String[]args) {
		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(555, "Donne");
		map1.put( 879, "Gordon"); //unsynchronized.
		map1.put(257, "Jordon");
		map1.put(555, "Danny");
		System.out.println(map1);
		for(Map.Entry<Integer, String> entry : map1.entrySet()) {
		System.out.println(entry.getKey()+ ":" +entry.getValue());	
		}
		boolean isMap = map1.containsKey(433);
		System.out.println(isMap);
		System.out.println(map1.get(257));
		System.out.println(map1.keySet());
		map1.replace(257, "Jordon", "Tom");
		System.out.println(map1);
		System.out.println(map1.size());
		
		Hashtable<String, String> hashTable = new Hashtable<String, String>(); //synchronized
		hashTable.put("Dann","Donne");
		hashTable.put("Gor", "Gordon");
		hashTable.put("Jor", "Jordon");
		System.out.println(hashTable);
		for(Map.Entry<String, String> entry : hashTable.entrySet()) {
		System.out.println(entry.getKey() + ":" +entry.getValue());	
			
			
			
			
		}
		
		}

}
