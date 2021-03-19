package javaEx;

import java.util.*;


public class TreeSetEx1 {

	public static void main(String[] args) {

		TreeSet<Integer> set = new TreeSet<>(Arrays.asList(4,2,3));
		
		System.out.println(set);
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.higher(3));
		System.out.println(set.lower(3));
		System.out.println("--------------------");
		
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + ", ");
		}
		
		
		
		
	}

}
