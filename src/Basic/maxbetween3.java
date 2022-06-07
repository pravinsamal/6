package Basic;

import java.util.Scanner;

public class maxbetween3 {
	public static void main(String[] args) {
		
		Scanner SC=new Scanner(System.in);
		System.out.println("first");
		
		int a=SC.nextInt();
		
		System.out.println("second");
		int b=SC.nextInt();
		
		System.out.println("third");
		int c=SC.nextInt();
		
		if(a>b && a>c) 
			System.out.println(a);
		
		else if(b>a && b>c) 
			System.out.println(b);
		
		else 
			System.out.println(c);
		
	}

}
