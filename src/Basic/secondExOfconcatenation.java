package Basic;

public class secondExOfconcatenation {
	public static void main(String[] args) {
		String a="Pravin";
		int b=10;
		int c=20;
		int d=30;
//		System.out.println(a=b+c+d);  //error incompatible type 
		System.out.println(a=a+b+c);
//		System.out.println(b=a+c+d);
		System.out.println(b=b+c+d);
	}

}
