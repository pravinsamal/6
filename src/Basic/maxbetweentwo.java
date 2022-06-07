package Basic;

import java.util.Scanner;

public class maxbetweentwo {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("eneter the value");
		int a=sc.nextInt();
		
		System.out.println("enter second value");
		int b=sc.nextInt();
		
		if(a>b) {
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}
		sc.close();
	}
	

}
