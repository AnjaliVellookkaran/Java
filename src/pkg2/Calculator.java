package pkg2;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first value");
		int a=sc.nextInt();
		System.out.println("enter second value");
		int b=sc.nextInt();
		System.out.println("choice=");
		String choice=sc.next(); 		
		switch(choice)
		{
		case "add":System.out.println("a+b="+(a+b));
		break;
		case "sub":System.out.println("a-b="+(a-b));
		break;
		case "mul":System.out.println("a*b="+(a*b));
		break;
		case "div" :System.out.println("a/b="+(a/b));
		break;
		default:System.out.println("invalid choice");
		}
	}

}
