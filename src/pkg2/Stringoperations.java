package pkg2;

public class Stringoperations {

	public static void main(String[] args) {
		String s="hello";
		String a="hi";
		String v="Hello";
		
		//concat
		System.out.println(s.concat(a)); //hellohi
		System.out.println(13+2+s+3+4); //3hello34
		
		//touppercse and tolowercase
		System.out.println(s.toUpperCase()); //HELLO
		
		//comparison
		System.out.println(s.equals(a)); //false
		System.out.println(s.equalsIgnoreCase(v)); //true
		
		//charAt
		System.out.println(s.charAt(4)); //o
		
		//endswith and startswith
		System.out.println(s.startsWith("h")); //true
		
		//trim
		System.out.println(v.trim()); //Hello
		
		//contains
		System.out.println(s.contains("welcome")); //false
		
		//substring
		System.out.println(s.substring(1,4));  //ell
		
		//length
		System.out.println(a.length()); //2
		
		//split
		String q="december is the last month of the year";
	
		
	
	
	
	
	}

}

