package estruturaDeControle.exerciciosDoModulo;

import java.util.Scanner;

public class Soletrar {

	public static void main(String[] args) {
		// Criar um programa que receba uma palavra e imprime no console letra por letra.
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma palavra para soletrar.");
		String palavra = entrada.next();
		
		for(int i = 0 ; i < palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
		}
		
		System.out.println("Fim");
		
		entrada.close();

	}

}
