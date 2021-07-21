package estruturaDeControle.exerciciosDoModulo;

import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {

	public static void main(String[] args) {
		// Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um numero aleatório em uma variável. 
		//O Jogador tem 10 tentativas para adivinhar o número gerado. 
		//Ao final de cada tentativa, imprima a quantidade de tentativas restantes, 
		//e imprima se o número inserido é maior ou menor do que o número armazenado.

		Random random = new Random();
		Scanner entrada = new Scanner(System.in);
		
		int numScrt = random.nextInt(100);
		
		System.out.println("Existe um número secreto que esta entre 0 e 100.");
		System.out.println("Sua missão é adivinha-lo, é um valor inteiro e você tem 10 tentativas");
		System.out.println("Que os jogos comecem!!!");
		
		for(int i = 0; i<10; i++) {
			
			System.out.printf("Digite a sua %d tentiva: ", i);
			int num = entrada.nextInt();
			
			if(num == numScrt) {
				System.out.println("Parabéns, você ganhou o jogo.");
				break;
			} else {
				System.out.println("Você falhou!");
			}
			
			if(i==9) {
				System.out.println("O jogo acabou para você!!!!");
			}
			
		}
		entrada.close();
		
	}

}
