package Basic;

import java.util.Scanner;

public class prime1toN {
	
		
		

			
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("entre number");
			int count;
			int k=sc.nextInt();
			
			for(int a=1; a<=k; a++) {
				count=0;
				for(int j=1; j<=a; j++) {
					if(a%j==0)
						count++;
				}
				if(count==2) {
					System.out.println(a);
				}
				
			}
		}

	}

	
