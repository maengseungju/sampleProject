package javaEx;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Integer> list =  new ArrayList<Integer>(Arrays.asList(11,22,33));
		
		list.add(3);
		list.add(null);
		list.add(1, 10);
		System.out.println("0 : " + list.get(0));
		System.out.println("1 : " + list.get(1));
		System.out.println("2 : " + list.get(2));
		
		list.remove(1);
		System.out.println("------------------");
//		System.out.println("0 : " + list.get(0));
//		System.out.println("1 : " + list.get(1));
	
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
		
		System.out.println("------------------");
		System.out.println(list.contains(22));
		System.out.println(list.indexOf(22));
		
	}

}
