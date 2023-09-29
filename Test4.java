package smp;
import java.util.Scanner;
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner obj = new Scanner(System.in);
System.out.println("Enter the values:");
int a = obj.nextInt();
int b = obj.nextInt();
int temp= a;
a=b; b= temp;
System.out.println(a+ " "+ b);

	}

}
