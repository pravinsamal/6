package Basic;

import java.util.Scanner;

public class asciiCapitalSmallNumber {
	/*  
	 * A- 65 ,B-66.................Z-90
	 * a-97, b-98....................z-122
	 * 0-48, 1-49,....................'9'-57
	 * */

	public static void main(String a[] ) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value");
		char ch=sc.next().charAt(0);
		
		if(ch>=65 && ch<=90) {
			System.out.println("capital letter");
			
		}
		else  if(ch>=97  && ch<=122) {
			 System.out.println("small letter");
		}
		else if(ch>=48 && ch<=57) {
			System.out.println("number");
			sc.close();
		}
	}
}
