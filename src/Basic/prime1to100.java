package Basic;

public class prime1to100 {
	public static void main(String[] args) {
		int count;
		for(int a=1; a<=100; a++) {
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
