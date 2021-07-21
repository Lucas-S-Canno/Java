package classesMetodos.areaCalc;

public class AreaCirc {

	double raio;
	final static double PI = 3.14;
	
	AreaCirc(double raioIn) {
		raio = raioIn;
	}
	
	double areaCirc() {
		return PI*Math.pow(raio, 2);
	}
	
}
