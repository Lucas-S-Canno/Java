package fundamentos;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		boolean cond1 = true;
		boolean cond2 = false;
		System.out.println("Definição das condições: ");
		System.out.println(cond1);
		System.out.println(cond2);

		// AND &&

		System.out.println("\nAND ou &&");
		//System.out.println(cond1 && cond1); //true
		System.out.println(cond1 && cond2);
		System.out.println(cond2 && cond1);
		//System.out.println(cond2 && cond2); //false
		
		//OR ||

		System.out.println("\nOR ou ||");
		//System.out.println(cond1 || cond1); //true
		System.out.println(cond1 || cond2);
		System.out.println(cond2 || cond1);
		//System.out.println(cond2 || cond2); //false
		
		//XOR ^

		System.out.println("\nXOR ou ^");
		System.out.println(cond1 ^ cond1);
		System.out.println(cond1 ^ cond2);
		System.out.println(cond2 ^ cond1);
		System.out.println(cond2 ^ cond2);
		
		//not !

		System.out.println("\nnot ou !");
		System.out.println(!cond1);
		System.out.println(!cond2);
		System.out.println(!!cond1);
		System.out.println(!!cond2);
		

	}

}
