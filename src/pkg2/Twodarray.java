package pkg2;

import java.util.Scanner;

abstract class Twodarray {

	public static void main(String[] args) {
		System.out.println("enter numbers");
		Scanner sc=new Scanner(System.in);
		int[][] a=new int[3][2];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("The array is");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]+" ");
				
			}

			System.out.println();
			
		}
	}

}

