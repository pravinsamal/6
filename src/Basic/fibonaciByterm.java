package Basic;

import java.util.Scanner;

public class fibonaciByterm {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int x=0,y=1,z=0,term=1;
		while(term<=n) {
			System.out.println(z);
			x=y;
			y=z;
			z=x+y;
			term++;
		}
	}

}
