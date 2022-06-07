package Basic;

public class ifprogram {
	public static void main(String[] args) {
		int a=20;
		int b=30;
		int c=25;
		int d=50;
		
		if(a>b ) {
			if(a>c) {
				if(a>d){
					System.out.println(a);	
				}
				else {
					System.out.println(d);
				}
			}
			
		}
		if(b>a ) {
			if(b>c) {
				if(b>d){
					System.out.println(b);	
				}
				else {
					System.out.println(d);
				}
			}
			
		}
		if(c>a ) {
			if(c>b) {
				if(c>d){
					System.out.println(c);	
				}
				else {
					System.out.println(d);
				}
			}
			
		}
	}
}
