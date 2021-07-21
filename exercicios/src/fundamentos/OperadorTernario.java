package fundamentos;

import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("Digite a nota: ");
		String media = entrada.next().replace(",", ".");
		entrada.close();
		double mediaN = Double.parseDouble(media);
		//? = se sim //: = se não
		// String resultado1 = (float)mediaN >= 5 ? "Recuperação" : "Reprovado";
		// String resultado2 = (float)mediaN >= 7.5 ? "Aprovado" : resultado1;
		
		String resultado = (float)mediaN < 5 ? "Reprovado" : 
			mediaN >= 7.5 ? "Aprovado" : "Recuperação";
			
		System.out.println(resultado);

	}

}
