package javaEx;

import java.util.LinkedList;

public class LinkedListEx2 {

	public static void main(String[] args) {

		LinkedList<Point> list = new LinkedList<Point>();
		
		list.add(new Point(1,1));
		list.add(new Point(3,5));
		list.add(new Point(2,2));
		list.add(new Point(4,3));
		list.add(new Point(5,5));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + "  :" + list.get(i));
		}
		System.out.println("------------------");
		list.remove(1);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + "  :" + list.get(i));
		}
		System.out.println("------------------");
		System.out.println("사이즈는 몇 개 : " + list.size());
		System.out.println("------------------");
		System.out.println("위치는 : " + list.indexOf(0));
	}

}
