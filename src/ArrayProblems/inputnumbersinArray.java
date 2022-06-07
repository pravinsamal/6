package ArrayProblems;

import java.util.Scanner;

public class inputnumbersinArray {
public static void main(String[] args) {
	int a[] =new int[10] ;
	Scanner sc=new Scanner (System.in) ;
	
	for (int i=0; i<=9;i++) {
		System.out.println("enter number");
		a[i]=sc.nextInt();
	}
	for(int i=1;i<10;i++) {
		
		System.out.println(a[i]);
	}
}
	
	
	
}
