package pkg;

public class Switch {

	public static void main(String[] args)
	{
		int a=6;
		int b=7;
		String choice="sub"; //char op='+'
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


