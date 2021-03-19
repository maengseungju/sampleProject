package javaEx;

import java.util.*;

public class HashSetEx1 {

	public static void main(String[] args) {

		HashSet<Integer> set1 = new HashSet<Integer>();
		HashSet<Integer> set2 = new HashSet<>();//
		HashSet<Integer> set3 = new HashSet<Integer>(set1);
		HashSet<Integer> set4 = new HashSet<Integer>(10);
		HashSet<Integer> set5 = new HashSet<Integer>(10, 0.7f);
		HashSet<Integer> set6 = new HashSet<Integer>(Arrays.asList(1,2,3));
		
		if(set6.add(12)) {
			System.out.println("데이터 입력 성공");
		}
		
		set6.add(12);
		System.out.println(set6);
		
		Iterator iter = set6.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("------------------------");
		
		HashSet<String> set = new HashSet<String>();
		
		
		set.add("허리아프다");
		set.add("무릎아프다");
		set.add("손목아프다");
		set.add("다아프다");
		
		if(set.add("다리아프다")) {
			System.out.println("데이터 입력 성공");
		}else {
			System.out.println("같은 객체가 이미 있습니다.");
		}
		if(set.remove("다아프다")) {
			System.out.println("데이터 삭제 성공");
		}else {
			System.out.println("그런 데이터 없습니다.");
		}
		
		Iterator iter1 = set.iterator();
		while(iter1.hasNext()) {
			System.out.println(iter1.next());
		}
		
		System.out.println(set);
		
		
	}

}
