package pkg2;

public class Stringprgm {

	public static void main(String[] args) {
		String s="hello";
		String s1="welcome to luminar";
		String a1="java language is platform independent";
		//1
		System.out.println(s.concat(s1));
		
		//2
		System.out.println(s1.length());
		
		//3
		if(a1.contains("language"))
		{
			System.out.println("language is present");
		}
		else
		{
			System.out.println("language is not present");
			
		}
		String a="java language is platform independent";
		String [] q=a.split(" ");
		for(String s2:q)
		{
			System.out.println(s2);
			if(s2.equals("platform"))
			{
				break;
			}
			
		}
	}}

