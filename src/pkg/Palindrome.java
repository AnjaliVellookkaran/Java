package pkg;

public class Palindrome {

	public static void main(String[] args) {
		 int r,s=0,temp;    
		 int n=56765;//number to be checked 
		 temp=n; 
		 
		  while(n>0)
		  {    
		   r=n%10;  //getting remainder  
		   s=(s*10)+r;    //reverse 
		   n=n/10;    
		  } 
		  
		  if(temp==s)    
		   System.out.println("palindrome number");    
		  else    
		   System.out.println("not a palindrome number");    
		}  
	

	}

