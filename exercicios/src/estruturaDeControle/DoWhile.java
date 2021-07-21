package estruturaDeControle;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		int num = entrada.nextInt();
		do {
			System.out.println(num);
			num++;
		} while(num<=100);
		
		System.out.println("Fim.");
		
		entrada.close();
		
	}

}
