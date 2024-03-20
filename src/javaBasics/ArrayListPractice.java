package javaBasics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListPractice {
	public static void main(String[]args) {
		int [] nums1 = {7, 3, 4,11, 32, 2};
		int[] nums2 = new int[7];
		nums2[0] = 7;
		nums2[1] = 6;
		ArrayList<String> arrayList = new	ArrayList<String>();
		arrayList.add("Sundar");
		arrayList.add("Roma");
		arrayList.add("Supriya");
		System.out.println(arrayList);
		for(String array : arrayList) {
			
			System.out.println(array);
		}
		System.out.println("******************************");
		arrayList.add("2, Rabi");
		for(String array2 : arrayList) {
			System.out.println(array2);
		}
		System.out.println("************************");
		System.out.println(arrayList);
	boolean isCorrect = arrayList.contains("Sundar");
	
	System.out.println(isCorrect);
	
	System.out.println("*************************");
	boolean isCorrect1 = arrayList.equals("Sundar");
	
	System.out.println(arrayList.size());
	
	System.out.println(arrayList.set(2, "John"));
	
	System.out.println(arrayList.remove(0));
	
	List<String> arrayList2 = new LinkedList<String>();
	
	List<String> arrayList3 = new Vector<String>();
	}	
	}


