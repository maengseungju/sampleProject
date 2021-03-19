package javaEx;

public class StringEx1 {

	public static void main(String[] args) {

		String str1;
		String str2, str3;

		str1 = "abc";
		str2 = "cde";
		str3 = str2;

		str2 = str1.toUpperCase();
		String str4 = str2.concat("??");
		String str5 = "!".concat(str2).concat("@");
		String str6 = "abc";

		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		System.out.println("str4 : " + str4);
		System.out.println("str5 : " + str5);
		System.out.println("str6 : " + str6);
		
		System.out.println(str1.equals(str6));
		System.out.println(str2.equals(str3));
		System.out.println("-----------------------------");
		
		
		String greet = "Hello";
		String name = "JAVA";
		
		System.out.println(greet + name + "!");
		System.out.println(greet + " " + name + "!");
		System.out.println("-----------------------------");
		
		String greeting = "Hello JAVA!";
		greeting.charAt(0);
		greeting.charAt(10);
		greeting.substring(1,3);
		
		System.out.println(greeting.charAt(0));
		System.out.println(greeting.charAt(10));
		System.out.println(greeting.substring(1,3));

	}
	
	
	

}
