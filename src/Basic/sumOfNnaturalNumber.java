package Basic;

import java.util.Scanner;

public class sumOfNnaturalNumber {
	public static void main(String[] args) {
	int n=1, add=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number ");
	int a=sc.nextInt();
	
	
	while(n<=a) {
		add=add+n;
		n++;
		}
	System.out.println(add);
		}

}
