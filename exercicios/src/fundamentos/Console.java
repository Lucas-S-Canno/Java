package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia/n/n");
		
		System.out.println("Bom");
		System.out.println("dia");
		
		System.out.printf("Numero: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
		System.out.printf("R$%.2f /n %n", 145.147);
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		System.out.println("Nome: " + nome + " Idade: " + idade);
		System.out.printf("%s tem %d anos.", nome, idade);
		entrada.close(); //Fechar o scanner ajuda a consumir menos memória

	}

}
