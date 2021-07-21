package estruturaDeControle.desafios;

import java.util.Scanner;

public class DesafioRepeticao {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int contVal = 0;
		int contInval = 0;
		int contNotas = 0;
		double somaNotas = 0;
		
		System.out.println("Digite -1 para sair");
		System.out.println("Digite a nota do aluno");
		double nota = entrada.nextDouble();
		
			while (nota != -1) {
				
				System.out.println("Digite -1 para sair");
				System.out.println("Digite a nota do aluno");
				nota = entrada.nextDouble();

				if (nota < 0 || nota > 10 && nota != -1) {
					contInval++;
				} else if (nota >= 0 || nota <= 10){
					
					
					if(nota == -1) {
						System.out.println("Saindo do sistema.");
						break;
					}
					contVal++;
					contNotas++;
					somaNotas += nota;
				} else {
					System.out.println("Saindo do sistema.");
				}

			};

		double media = somaNotas/contNotas;
		
		System.out.println("Total de notas válidas digitadas: ." + contVal);
		System.out.println("Total de notas inválidas digitadas: " + contInval);
		System.out.println("Soma total das notas digitadas: " + somaNotas);
		System.out.printf("%nMédia das notas digitadas: %.2f%n", media);
		System.out.println("Fim.");

		entrada.close();

	}

}
