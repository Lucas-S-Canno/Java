package fundamentos;

public class AreaDaCircunferencia {

	public static void main(String[] args) {
		
		int raio = 3;
		final double PI = 3.1415; //final antes da variavel indica que o valor da variavel n�o pode er alterada, variavel com letra maiuscula � uma conven��o para n�o alterar o valora da variavel
		
		double area = PI*raio*raio;
		
		System.out.println("area do circulo de raio" + raio + "� igual a " + area);

	}

}
