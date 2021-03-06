package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("quantos alunos?");
		int qtdAlunos = entrada.nextInt();
		System.out.println("quantas notas por aluno?");
		int qtdNotas = entrada.nextInt();
		
		double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];
		
		double total = 0;
		
		for (int i = 0; i < notasDaTurma.length; i++) {
			for (int j = 0; j < notasDaTurma[i].length; j++) {
				System.out.println("Informe a nota " + (j+1) + " do aluno " + (i+1) );
				notasDaTurma[i][j] = entrada.nextDouble();
				total += notasDaTurma[i][j];
			}
			
		}
		
		double media = total/(qtdAlunos * qtdNotas);
		System.out.println("M?dia da turma ?: " + media);
		
		for (double[] notasDoAluno: notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
		
		entrada.close();
		
	}

}
