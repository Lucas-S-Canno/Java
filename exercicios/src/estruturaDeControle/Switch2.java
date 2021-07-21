package estruturaDeControle;

import java.util.Scanner;

public class Switch2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		String conceito = "";
		
		System.out.println("Digite a nota.(somente o valor inteiro");
		int nota = entrada.nextInt();
		
		switch (nota) {
		case 10: case 9: {
			conceito = "A";
			System.out.println("Conceito " + conceito);
			break;
		}
		case 8: case 7: {
			conceito = "B";
			System.out.println("Conceito " + conceito);
			break;
		}
		case 6: case 5: {
			conceito = "C";
			System.out.println("Conceito " + conceito);
			break;
		}
		case 4: case 3: {
			conceito = "D";
			System.out.println("Conceito " + conceito);
			break;
		}
		case 2: case 1:{
			conceito = "D";
			System.out.println("Conceito " + conceito);
			break;
		}
		case 0: {
			conceito = "E";
			System.out.println("Conceito " + conceito);
			break;
		}
		default:
			System.out.println("Valor invalido " + nota);
		}
		
		entrada.close();

	}

}
