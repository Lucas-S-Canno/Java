package fundamentos.exercicios;

import java.util.Scanner;

//Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta

public class CalcBhaskara {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Lembrando que a equação possui essa forma ax² + bx + c = 0");
		System.out.println("Digite o valor de a: ");
		double valorA = entrada.nextDouble();
		System.out.println("Digite o valor de b: ");
		double valorB = entrada.nextDouble();
		System.out.println("Digite o valor de c: ");
		double valorC = entrada.nextDouble();
		
		double delta = Math.pow(valorB,	2)-(4*valorA*valorC);
		
		double raiz1 = (-valorB+(Math.sqrt(delta)))/(2*valorA);
		double raiz2 = (-valorB-(Math.sqrt(delta)))/(2*valorA);
		
		System.out.printf("%nO valor de delta é: %.2f", delta);
		System.out.printf("%nO valor da primeira raiz é: %.2f", raiz1);
		System.out.printf("%nO valor da segunda raiz é: %.2f", raiz2);
		
		entrada.close();

	}

}
