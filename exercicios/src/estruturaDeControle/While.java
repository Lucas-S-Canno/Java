package estruturaDeControle;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {

		int cont = 1;
		
		//se o while determinado é melhor usar o for
		while(cont<=10) {
			System.out.println("While " + cont);
			cont++;
		}
		System.out.println("");
		
		//se o while for inderteminado, deve-se usar o while mesmo
		Scanner entrada = new Scanner(System.in);
		
		String fim = "";
		while(!fim.equalsIgnoreCase("sair")) {
			System.out.println("Digite uma palavra, digite sair se quer sair: ");
			fim = entrada.next();
			System.out.println("Sua palavra é: " + fim);
		}
		System.out.println("Você saiu com sucesso.");
		
		entrada.close();

	}

}
