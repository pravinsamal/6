package Basic;

import java.util.Scanner;

public class ProductOfNumber {
	public static void main(String[] args) {
		int pro=1;
		Scanner sc =new Scanner( System.in);
		System.out.println("enetr Number");
		int a=sc.nextInt();
		while (a>0) {
			pro=pro*a%10;
			a=a/10;
			
		}
		System.out.println(pro);
	}

}
