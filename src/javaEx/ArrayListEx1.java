package javaEx;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		for (int i = 97; i <= 122; i++) {
			char ch = (char) i;
			String str = String.valueOf(ch);
			list.add(str);

		}
		for (int i = 0; i < list.size(); i++) {

			System.out.print(list.get(i) + ", ");

		}
	}
}
