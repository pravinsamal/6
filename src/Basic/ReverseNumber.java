package Basic;

import java.util.Scanner;

public class ReverseNumber {
	
public static void main(String[] args) {
	int rev=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int a=sc.nextInt();
	
	while(a>0) {
		rev=rev*10+a%10;
		a=a/10;
	}
	System.out.println(rev);
}
}
