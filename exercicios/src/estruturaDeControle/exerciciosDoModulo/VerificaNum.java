package estruturaDeControle.exerciciosDoModulo;

import java.util.Scanner;

public class VerificaNum {

	public static void main(String[] args) {
		// Criar um programa que receba um número e verifique se ele está entre 0 e 10
		// e é par;
		// https://github.com/cod3rcursos/fundamentos-programacao-java/tree/master/CursoJavaExercicios/src/controle

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número.");
		double num = entrada.nextDouble();

		if (num >= 0 || num <= 10) {
			System.out.println("O número esta entre 0 e 10.");
		} else {
			System.out.println("O número não está entra 0 e 10.");
		}
		if (num % 2 == 0) {
			System.out.println("O número é par.");
		} else {
			System.out.println("O número é impar.");
		}
		
		entrada.close();

	}

}
