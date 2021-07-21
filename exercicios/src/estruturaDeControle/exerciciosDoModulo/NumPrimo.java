package estruturaDeControle.exerciciosDoModulo;

import java.util.Scanner;

public class NumPrimo {

	public static void main(String[] args) {
		// Criar um programa que receba um número e diga se ele é um número primo.
		// Refatorar o exercício 04, utilizando a estrutura switch.

		//programa comum
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número.");
		double num = entrada.nextDouble();

		int contDiv = 0;
		
		for(int i = 2; i < num; i++) {
			if(num%i == 0) {
				contDiv++;
			}
		}
		
		if(contDiv > 0) {
			System.out.println("O número não é primo.");
		} else {
			System.out.println("O número é primo.");
		}

		entrada.close();
		
		//programa com switch case
		
		switch (contDiv) {
		case 0: {	
			System.out.println("O número é primo.");
			break;
		}
		default:
			System.out.println("O número não é primo.");
			break;
		}
		
	}
	

}
