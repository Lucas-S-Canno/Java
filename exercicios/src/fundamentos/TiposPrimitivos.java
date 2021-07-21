package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Tipos num�ricos inteiros
		byte a = 99;
		short b = 9999;
		int c = 999999999;
		long d = 999999999999999999L;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		//Tipos num�ricos reais
		float e = 11445.44f; //f necess�rio para mostrar para o java que n�o � do tipo double
		double f = 456531614875.4567564653;
		
		System.out.println(e);
		System.out.println(f);
		
		//Tipo booleano
		boolean g = false; //ou true
		
		System.out.println(g);
		
		//Tipo de caractere
		char h = 'A';
		
		System.out.println(h);
	}
}
