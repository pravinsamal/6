package Basic;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int fact=1;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		
		while(a>0) {
			fact=fact*a;
			a=a-1;
			
		}
		System.out.println(fact);
	}

}