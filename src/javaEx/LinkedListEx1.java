package javaEx;

import java.util.LinkedList;

public class LinkedListEx1 {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();

		list.addFirst(1);
		list.addLast(2);
		list.add(3);
		list.add(1, 3);

		System.out.println("0 : " + list.get(0));
		System.out.println("1 : " + list.get(1));
		System.out.println("2 : " + list.get(2));
		System.out.println("3 : " + list.get(3));
		System.out.println("------------------");
		
		list.remove(1);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}
		System.out.println("------------------");
		System.out.println("3은 몇번째 인가 : " + list.indexOf(3));

		
		System.out.println("------------------");
		System.out.println("사이즈는 몇 개 : " + list.size());
		
		
	}
}
