package javaEx;

public class Test {

	public static void main(String[] args) {

		GenericArrayList<Integer> intList = new GenericArrayList<>();
		
		intList.add(1);
		intList.add(2);
		
		int intValue1 = intList.get(0);
		int intValue2 = intList.get(1);
		
		
		System.out.println(intValue1 + intValue2);
		
		GenericArrayList<String> strList = new GenericArrayList<>();
		
		strList.add("1");
		strList.add("2");
		
		String strValue1 = strList.get(0);
		String strValue2 = strList.get(1);
		
		System.out.println(strValue1 + strValue2);
		
	}

}
