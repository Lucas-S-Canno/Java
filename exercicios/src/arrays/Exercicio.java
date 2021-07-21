package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {

		double[] notasAlunoA = new double[4];
		
		notasAlunoA[0] = 7.5;
		notasAlunoA[1] = 5.5;
		notasAlunoA[2] = 9.8;
		notasAlunoA[3] = 10;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double totalA = 0;
		for(int i = 0; i<=3; i++) {
			totalA += notasAlunoA[i];
		}
		
		System.out.println("A média do aluno A é: " + (totalA/notasAlunoA.length));
		
		double[] notasAlunoB = {10, 8.6, 7.4, 5.3};
		
		double totalB = 0;
		for(int i = 0; i<=3; i++) {
			totalB += notasAlunoB[i];
		}
		
		System.out.println("A média do aluno B é: " + (totalB/notasAlunoA.length));
		
	}

}
