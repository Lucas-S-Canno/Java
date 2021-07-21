package estruturaDeControle.desafios;

public class DesafioFor {

	public static void main(String[] args) {
		
		String valor = "#";
		for(int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor+="#";
		}
		
		//Desafio for: 5 repeti��es do codigo acima, mas sem usar valor num�rico para controlar o la�o
		
		for (String i = "#"; !i.equals("######"); i+="#") {
			System.out.println(i);
		}

		//outra maneira de se resolver utilizando caracteres � essa, mas utiliza valor num�rico para comparar o tamanho da string
		for (String i = "#"; i.length() < 6; i+="#") {
			System.out.println(i);
		}

	}

}
