package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoTipoPrimitivo {

	public static void main(String[] args) {
	
		double a = 1.123456789; //conversão implicita
		System.out.println(a);
		
		float b = (float)1.123456789; //conversão explicita (CAST), dizendo que o valor pode ser convertido para float, o java entende que eu sei que pode haver perda de dados
		System.out.println(b);
		
		int c = 4;
		byte d = (byte)c;
		System.out.println(c);
		System.out.println(d);
		
		double e = 1.65;
		int f = (int) e; //ele simplesmente ignora o valor depois da virgula, não arredonda
		System.out.println(f); 
		
		//converter numero para string
		Integer num1 = 1234;
		System.out.println(num1.toString()); //necessário usar o Integer para o toString()
		
		int num2 = 12345;
		System.out.println(Integer.toString(num2));
		
		//converte string para numero
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro valor: ");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo valor: ");
		
		System.out.println(valor1 + valor2);
		
		double valorN1 = Double.parseDouble(valor1);
		double valorN2 = Double.parseDouble(valor2);
		
		System.out.println(valorN1 + valorN2);

	}

}
