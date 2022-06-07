package Basic;

import java.util.Scanner;

public class primeOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number");
		int a=sc.nextInt();
		int i=1,count=0;
		while(i<=a) {
			if(a%i==0) 
				count=count+1;
			i=i+1;
			
		}
		if(count==2)
			System.out.println("prime");
		else
			System.out.println("not");
	}

}
