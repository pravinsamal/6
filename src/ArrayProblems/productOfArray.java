package ArrayProblems;

import java.util.Scanner;

public class productOfArray {
	public static void main(String[] args) {
		int pro=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("enter value");
			 a[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			pro=pro*a[i];
		}
		System.out.println(pro);
	}

}
