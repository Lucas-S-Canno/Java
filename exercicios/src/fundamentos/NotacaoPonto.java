package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String b = "string";
		
		System.out.println(b);
		System.out.println(b.toUpperCase());
		System.out.println(b.length());
		System.out.println(b.getClass());
		System.out.println(b.getBytes());
		System.out.println(b.replace("s", "P").toUpperCase().concat("!!!"));//como todas as saidas são string, é possivel usar uma em seguida da outra, mas caso tivesse um .length() por exemplo que tem uma saida int não seria possivel colocar mais um .algo() pois mudaria a saida final

	}

}
