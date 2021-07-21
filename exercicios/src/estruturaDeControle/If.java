package estruturaDeControle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("informa a primeira nota: ");
		double nota1 = entrada.nextDouble();
		System.out.println("informa a segunda nota: ");
		double nota2 = entrada.nextDouble();

		double media = (nota1 + nota2) / 2;

		if (media < 5) {
			System.out.println("A média é " + media);
			System.out.println("Aluno foi reprovado.");
		} else if (media < 7) {
			System.out.println("A média é " + media);
			System.out.println("Aluno de recuperação.");
		} else {
			System.out.println("A média é " + media);
			System.out.println("Aluno aprovado.");
		}

		entrada.close();

	}

}
