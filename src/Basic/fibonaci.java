package Basic;

import java.util.Scanner;

public class fibonaci {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number");
		int z=0,x=0,y=1;
		int n=sc.nextInt();
		while(z<=n) {
			System.out.println(z);

			x=y;
			y=z;
			z=x+y;
		}

	}

}
