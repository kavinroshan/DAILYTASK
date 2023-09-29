package smp;
import java.util.Scanner;
public class Test5 {

public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner obj = new Scanner(System.in);
System.out.println("Enter the value:");
int n = obj.nextInt();
if (n==1) {
	System.out.println("It's not a prime number or composite number");
	}
boolean prime = true;
 for (int i=2; i<=n/2; i++)
 {
	if( n%i ==0 )
	{
		prime = false;
		break;
	}   
 }
 if (prime == true) 
 {
	  System.out.println("It's a prime number");	
 }
	
		
	}

}
