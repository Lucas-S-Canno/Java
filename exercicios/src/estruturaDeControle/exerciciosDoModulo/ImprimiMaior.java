package estruturaDeControle.exerciciosDoModulo;

import java.util.Scanner;

public class ImprimiMaior {

	public static void main(String[] args) {
		// Crie um programa que recebe 10 valores e ao final imprima o maior número.
		Scanner entrada = new Scanner(System.in);
		
		double maior = 0;
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Digite um numero.");
			double valor = entrada.nextDouble();
			
			if(i == 0) {
				maior = valor;
			}
			if(valor>maior) {
				maior = valor;
			}
			
		}
		
		System.out.println("O maior valor digitado é " + maior);
		
		entrada.close();

	}

}
