package fundamentos;

public class OperadoresDeAtribuicao {

	public static void main(String[] args) {

		int a = 3;
		int b = 2;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		double c = a+=b;
		System.out.println("a=a+b: " + c); //a=a+b
		double d = a-=b;
		System.out.println("a=a-b: " + d); //a=a-b
		double e = a*=b;
		System.out.println("a=a*b: " + e); //a=a*b
		double f = a/=b;
		System.out.println("a=a/b: " + f); //a=a/b
		double g = a%=b;
		System.out.println("a=a%b: " + g); //a=a%b
		
		//operadores unarios se usados antes da variavel, é feito o acrescimo ou decressimo antes de outra ação e se após é feito depois 
		//por exemplo (--a == b++) sera true pois o a será 2 e o b 2 pois o ++ esta apos o b e a comparação será feita com o valor de b e depois sera acrescentado 1 ao valor de b
		int h = a++;
		System.out.println("a++: " + h);
		int i = ++a;
		System.out.println("++a: " + i);
		int j = a--;
		System.out.println("a--: " + j);
		int k = --a;
		System.out.println("--a: " + k);
		

	}

}
