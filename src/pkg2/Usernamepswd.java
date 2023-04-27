package pkg2;

import java.util.Scanner;

import Oops.Accessmodifier;

public class Usernamepswd  {

	public static void main(String[] args) {
		System.out.println("enter username and password");
		Scanner sc=new Scanner(System.in);
		
		String[][] a=new String[3][2];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=sc.next();
			}
		}
		System.out.println("The array is");
		for(int i=0;i<3;i++)
			{
			for(int j=0;j<2;j++)
				{
					System.out.print(a[i][j]+"  ");
					
				}

				System.out.println();
				
			}
		}
 
}
