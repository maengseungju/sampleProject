package javaEx;

public class StringEx3 {

	public static void main(String[] args) {

		String str = "apple mango banana";
		
		String result = str.replace(" ","\"");
		
		System.out.println(result);
		System.out.println(str.toUpperCase());
		System.out.println(str.concat("!!!!!!"));
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(7));
		System.out.println(str.substring(1, 3));
		
		
		
		
	}

}
