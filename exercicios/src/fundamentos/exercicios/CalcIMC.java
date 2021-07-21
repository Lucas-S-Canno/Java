package fundamentos.exercicios;

import java.util.Scanner;

//Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.

public class CalcIMC {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu peso em Kg (Quilogramas): ");
		double peso = entrada.nextDouble();
		
		System.out.println("Digite sua altura em metros(m,cm): ");
		double altura = entrada.nextDouble();
		
		double calc = peso/(Math.pow(altura, 2));
		
		System.out.println("Seu IMC é "+ calc);
		
		entrada.close();

	}

}
