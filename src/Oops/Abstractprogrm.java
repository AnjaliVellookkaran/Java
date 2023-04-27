package Oops;
abstract class RBI
 {	

 public void deposit()
 {
	System.out.println("deposit");
 }

 public void interest()
{
	
}}
 
 class Icici extends RBI
 {
	 @Override
	 public void interest()
	 {
		System.out.println("icici interest rate");
	 }
 }

public class Abstractprogrm {

	public static void main(String[] args) {
	Icici ic=new Icici();
	ic.deposit();
	ic.interest();
	}

}
 
