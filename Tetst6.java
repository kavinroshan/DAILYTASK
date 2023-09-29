package smp;
import java.util.Scanner;
public class Tetst6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner obj = new Scanner(System.in);
System.out.println("Enter the value:");
int n = obj.nextInt();
int fact = 1;
for(int i=n; i>=1 ; i--)
{
	fact = fact*i;
}
System.out.println(fact);	
	}
}

