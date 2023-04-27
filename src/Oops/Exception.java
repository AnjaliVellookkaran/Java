package Oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception {

	public static void main(String[] args)   {
		
	//FileInputStream f=new FileInputStream("E://Book1.xlsx");

	
	
		//arithmetic Exception
		int a=30,b=0;
		try
		{
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("arithmetic Exception");	
		}
		finally
		{
			System.out.println("hello");
			
		}
	
	//null pointer exception
		try {
			String s=null;
			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("null pointer Exception");
		}
		System.out.println("hello");
		
	
	//array index out of bounds exception
		try {
			int []ar=new int[5];
			ar[5]=76;
			System.out.println(ar[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bound exception");
					
		}
	
	}

}
