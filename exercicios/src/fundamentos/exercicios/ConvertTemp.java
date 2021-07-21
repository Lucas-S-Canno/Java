package fundamentos.exercicios;

import java.util.Scanner;

//Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.

//Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.

public class ConvertTemp {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite F se você quer Celsius para Farenheit.");
		System.out.println("ou digite C se você quer Farenheit para Celsius.");
		String tempIn = entrada.next().toUpperCase();
		
		System.out.println("Digite a temperatura: ");
		String temp = entrada.next().replace(",", ".");
		Double tempNum = Double.parseDouble(temp);
		
		
		double calc = "F".equals(tempIn) ? (tempNum*1.8+32) : ((tempNum-32)/1.8);
		
		String resp = "F".equals(tempIn) ? "graus Farenheit" : "graus Celsius";
		
		System.out.printf("%.2f %s arredondado para duas casas decimais", calc, resp);
		
		entrada.close();

	}

}
