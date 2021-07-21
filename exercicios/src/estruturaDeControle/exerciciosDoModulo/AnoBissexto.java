package estruturaDeControle.exerciciosDoModulo;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		// Criar um programa informa se o ano atual é um ano bissexto;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um ano.");
		int ano = entrada.nextInt();
		
		if(ano%4 == 0) {
			System.out.println("O ano é bissexto.");
		} else {
			System.out.println("O ano não é bissexto.");
		}
		
		entrada.close();

	}

}
