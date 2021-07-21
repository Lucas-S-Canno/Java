package fundamentos;

public class Aritmetica {

	public static void main(String[] args) {
		
		var x = 2.35;
		double y = 3.65;
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		
		int a = 2;
		int b = 3;
		System.out.println(a+b);
		System.out.println(a-(float)b);
		System.out.println(a*b);
		System.out.println(a/(double)b);
		System.out.println(a%b);
		
		System.out.println((int)Math.pow(a, b));
		System.out.println(Math.pow(a, b));

	}

}
