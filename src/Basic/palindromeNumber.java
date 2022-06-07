package Basic;

import java.util.Scanner;

public class palindromeNumber {
	public static void main(String[] args) {
		int rev=0,z;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int a=sc.nextInt();
		z=a;
		while(a>0) {
			rev=rev*10+a%10;
			a=a/10;
		}
		System.out.println(rev);  //print reverse
		if(rev==z) 
			System.out.println("is a palindrome");
		else
			System.out.println("not");
	}

}
