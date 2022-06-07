package Basic;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args) {
		int sum=0,a;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number");
		a=sc.nextInt();
		
		while(a>0) {
			sum=sum+a%10;
			a=a/10;
			
		}
		System.out.println(sum);
	}

}
