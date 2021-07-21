package fundamentos;

public class DesafioAritmetica {

	public static void main(String[] args) {
		
		double eq1 = (Math.pow((6*(3+2)), 2))/(3*2);
		double eq2 = Math.pow(((1-5)*(2-7))/2, 2);
		System.out.println(eq1);
		System.out.println(eq2);
		double eq3 = Math.pow((eq1-eq2), 3);
		System.out.println(eq3);
		double eq4 = eq3/(Math.pow(10, 3));
		System.out.println(eq4);
		System.out.println((int)eq4);
		
	}

}
