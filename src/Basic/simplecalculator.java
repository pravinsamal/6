package Basic;

import java.util.Scanner;

public class simplecalculator {
	public static void main(String[] args) {
		

			
			Scanner SC=new Scanner(System.in);
			System.out.println("first");
			
			int a=SC.nextInt();
			
			System.out.println("second");
			int b=SC.nextInt();
			
			System.out.println("enter our choice add=1,sub=2,mult=3,div=4");
			int ch=SC.nextInt();
			
			switch (ch) {
			case 1:
				System.out.println("addition" +(a+b));
				break ;
			case 2:
				System.out.println("SUB" +(a-b));
				break ;
			case 3:
				System.out.println("MULTIFICATION" +(a*b));
				break ;
			case 4:
				System.out.println("DIVI" +(a/b));
				break ;

			default :
				System.out.println("invalid");
			}
			
	}

}
