package smp;
import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner obj = new Scanner (System.in);
System.out.println("Enter the values:");
int a = obj.nextInt();
int b = obj.nextInt();
int c = obj.nextInt();
int d = obj.nextInt();
if (a+b > c+d) {
	System.out.println("Sum of a and b is greater than sum of c and d");
}

	}

}
