package javaEx;

public class SimpleArrayListTest {

	public static void main(String[] args) {

		SimpleArrayList list = new SimpleArrayList();

		list.add(50);
		list.add(100);

		Integer value1 = (Integer) list.get(0);
		Integer value2 = (Integer) list.get(1);

		System.out.println(value1 + value2);

		SimpleArrayListForInteger ilist = new SimpleArrayListForInteger();

		ilist.add(50);
		ilist.add(100);
		System.out.println(ilist.get(0) + ilist.get(1));

		SimpleArrayListForString slist = new SimpleArrayListForString();

		slist.add("50");
		slist.add("100");
		System.out.println(slist.get(0) + slist.get(1));
	}

}
