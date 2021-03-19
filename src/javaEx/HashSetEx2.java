package javaEx;

import java.util.HashSet;

public class HashSetEx2 {

	public static void main(String[] args) {

		HashSet<Integer> set = new HashSet<>();
		
		while (set.size() < 6) {
			int i = ((int) (Math.random() * 45) + 1);
			set.add(i);
		}

		System.out.println(set);
	}
}
