package fundamentos;

public class TemperatureTransform {

	public static void main(String[] args) {
		
		//(F - 32) x (5/9) = C
		
		final double CONST1 = 32;
		final double CONST2 = 5d/9.0; //necessario o .0 por se tratar de uma dizima periódica o resultado e o java interpretar como 0. d minusculo tbm funcio e se for float pode ser f
		double tf =	 86;
		double tc = (tf - CONST1)*CONST2;
		
		System.out.println("A temperatura em Celsius de 100F é: " + tc + " Celcius");

	}

}