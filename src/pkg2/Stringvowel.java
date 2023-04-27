package pkg2;

import java.util.Scanner;

public class Stringvowel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String a=sc.next();
		int c=0; //count
		
		for(int j=0;j<a.length();j++) {
			if(a.charAt(j)=='a' || a.charAt(j)=='e' || a.charAt(j)=='i' || a.charAt(j)=='o' || a.charAt(j)=='u' )
			//if each letter matches with the vowel then increment count
			{
				c++;
			}
		}
			System.out.println("count="+c);
			
		}

	}

