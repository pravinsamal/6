package Basic;

import java.util.Scanner;

public class sumEvenProductOdd {
	public static void main(String[] args) {
		int digit=0,sum=0,pro=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int a=sc.nextInt();
		
		while( a>0) {
			digit=a%10;
			if(digit%2==0) 
				sum=sum+a%10;
			else 
				pro=pro*digit;
			a=a/10;
		}
		System.out.println("sum"+sum +"  pro  " +pro);
	
	
	
	}
	
}
