package ArrayProblems;

import java.util.Scanner;

public class sumofarray {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	int sum=0;
		System.out.println("enter a size");

		int size=sc.nextInt();
		int	a[]=new int[size];
		for(int i=0; i<size; i++) {
			System.out.println("enter value");
			a[i]=sc.nextInt();
		}
//		for(int i=0;i<size;i++) {
//			System.out.print( a[i]);
//		}
		for(int i=0; i<size;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);

	}

}
