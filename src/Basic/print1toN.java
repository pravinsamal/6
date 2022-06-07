package Basic;

import java.util.Scanner;

public class print1toN {
	public static void main(String[] args) {
		int i=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number ");
		int n=sc.nextInt();
		
		while (i<=n) {
			System.out.println(i);
			i++;
			}
	}

}
