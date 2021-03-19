package javaEx;

import java.util.*;
import java.util.Map.Entry;

public class HashMapEx1 {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<>();

		map.put("apple", "사과");
		map.put("banana", "바나나");
		map.put("grape", "포도");
		map.put("mango", "망고");

		System.out.println(map);
		System.out.println("---------------");

		map.remove("mango");
		System.out.println(map);
		System.out.println("사이즈 : " + map.size());
		System.out.println("---------------");

		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
		}
		System.out.println("---------------");
		
		for (String s : map.keySet()) { // 저장된 key값 확인
			System.out.println("[Key]:" + s + " [Value]:" + map.get(s));

		}
		System.out.println("---------------");
		
		Iterator<String> keys = map.keySet().iterator();
		while (keys.hasNext()) {
			String key = keys.next();
			System.out.println("[Key]:" + key + " [Value]:" + map.get(key));

		}
	}
}
