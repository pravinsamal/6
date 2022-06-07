package star;

public class rightangle {
	public static void main(String[] args) {
		for(int a=1; a<=15; a++) {
			for(int c=1; c<=5; c++) {
				System.out.print("  ");
			}
			for(int b=1; b<=15-a; b++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}

