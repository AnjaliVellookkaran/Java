package pkg;

public class Breakcontinue {

	public static void main(String[] args) {
		for (int i=1;i<=10;i++)
		{
		
			if (i==5)
			{
				
				//break; // breaks at 5
				continue; //5 is not printed
			}
			System.out.println(i);
		}
	}

}
