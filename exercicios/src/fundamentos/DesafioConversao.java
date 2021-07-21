package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro sal�rio: ");
		String sal1 = entrada.next().replace(",", ".");
		System.out.println("Digite o segundo sal�rio: ");
		String sal2 = entrada.next().replace(",", ".");
		System.out.println("Digite o terceiro sal�rio: ");
		String sal3 = entrada.next().replace(",", ".");
		
		entrada.close();
		
		double salN1 = Double.parseDouble(sal1);
		double salN2 = Double.parseDouble(sal2);
		double salN3 = Double.parseDouble(sal3);
		
		System.out.printf("%n%nPrimeiro sal�rio: %.2f", salN1);
		System.out.printf("%nSegundo sal�rio: %.2f", salN2);
		System.out.printf("%nTerceiro sal�rio: %.2f", salN3);
		
		System.out.printf("%nA m�dia dos 3 sal�rios �: %.2f", (salN1 + salN2 + salN3)/3 );

	}

}
