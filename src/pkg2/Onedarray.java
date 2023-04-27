package pkg2;

import java.util.Scanner;

public class Onedarray {

	public static void main(String[] args) {
		int ar[]=new int[3];
		System.out.println("enter values");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("entered values are");
		//for(int i=0;i<3;i++)
		//{
			//System.out.println(ar[i]);
		//}
		for(int a:ar)
		{
				System.out.println(a);
		}
	}

}
