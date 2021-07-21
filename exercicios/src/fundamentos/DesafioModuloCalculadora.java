package fundamentos;

import java.util.Scanner;

public class DesafioModuloCalculadora {

	public static void main(String[] args) {
		//ler num1
		//ler num2
		//perguntar opera��o (+ - * / %)
			
			Scanner entrada = new Scanner(System.in);
			System.out.println("Digite o primeiro n�mero: ");
			String num1 = entrada.next().replace(",", ".");
			double valor1 = Double.parseDouble(num1);
			
			System.out.println("Digite a opera��o a ser executada: ");
			String op = entrada.next();
			
			System.out.println("Digite o segundo n�mero: ");
			String num2 = entrada.next().replace(",", ".");
			double valor2 = Double.parseDouble(num2);
			
			
			double calc = "+".equals(op) ? valor1 + valor2 : 0;
			calc = "-".equals(op) ? valor1 - valor2 : calc;
			calc = "*".equals(op) ? valor1 * valor2 : calc;
			calc = "/".equals(op) ? valor1 / valor2 : calc;
			calc = "%".equals(op) ? valor1 % valor2 : calc;
			
			System.out.printf("%.2f %s %.2f = %.2f",valor1, op, valor2, calc);
			System.out.println("\n");
			
			entrada.close();
				
	}

}
