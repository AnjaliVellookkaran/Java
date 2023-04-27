package pkg2;

import java.util.Scanner;

public class Scannerpgm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first value");
		int a=sc.nextInt();
		
		Scanner sr=new Scanner(System.in);
		System.out.println("enter second value");
		int b=sr.nextInt();
		
		int c=a+b;
		System.out.println("sum is "+c);
	}

}
