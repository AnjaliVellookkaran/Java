package Javaprgrms;

public class Simplecalculator {

	public static void main(String[] args) {
		int a=6;
		int b=7;
		String choice="add"; //char op='+'
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


