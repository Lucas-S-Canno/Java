package fundamentos;

public class ComparacaoString {

	public static void main(String[] args) {
		
		System.out.println("2" == "2"); //true

		String s = new String("2");
		String ss = new String("2");
		
		System.out.println(s == ss); //false
		System.out.println("2" == s); //false
		System.out.println("2".equals(s)); //true
		System.out.println(s.equals(ss)); //true
		

	}

}
