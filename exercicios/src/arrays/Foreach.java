package arrays;

import java.util.Arrays;

public class Foreach {

	public static void main(String[] args) {

//		double[] notasA = {10, 8.6, 7.4, 5.3};
//		
//		for(double nota: notasA) {
//			System.out.println(nota);
//		}

		double[] notasA = new double[4];

		notasA[0] = 7.5;
		notasA[1] = 5.5;
		notasA[2] = 9.8;
		notasA[3] = 10;

		System.out.println(Arrays.toString(notasA));

		double totalA = 0;
		for (double notas: notasA) {
			totalA += notas;
		}

		System.out.println("A média do aluno A é: " + (totalA / notasA.length));

		double[] notasB = { 10, 8.6, 7.4, 5.3 };

		double totalB = 0;
		for (double notas: notasB) {
			totalB += notas;
		}

		System.out.println("A média do aluno B é: " + (totalB / notasB.length));

	}

}
