package fundamentos.exercicios;

import java.util.Scanner;

//um programa que leia o valor da base e da altura de um triângulo e calcule a área.

public class CalcAreaTriang {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Para calcular a área do triagulo");
		System.out.println("Digite o valor da base.");
		double base = entrada.nextDouble();
		
		System.out.println("Agora digite o valor da altura.");
		double altura = entrada.nextDouble();
		
		double area = (base*altura)/2;
		
		System.out.printf("A área do triangulo informado é: %.2f", area);
		
		entrada.close();

	}

}
