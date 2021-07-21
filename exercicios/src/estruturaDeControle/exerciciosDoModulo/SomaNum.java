package estruturaDeControle.exerciciosDoModulo;

import java.util.Scanner;

public class SomaNum {

	public static void main(String[] args) {
		//Criar um programa que enquanto estiver recebendo n�meros positivos, 
		//imprime no console a soma dos n�meros inseridos, 
		//caso receba um n�mero negativo, encerre o programa. 
		//Tente utilizar a estrutura do while.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Para continuar comece digitanto numeros positivos e para encerrar o programa digite algum valor negativo.");
		
		double num = 0;
		double soma = 0;
		
		do {
			num = entrada.nextDouble();
			soma += num;
		}while(num>=0);
		
		System.out.println("A soma dos valores digitados � " + (soma-num));
		
		entrada.close();
		
	}

}
