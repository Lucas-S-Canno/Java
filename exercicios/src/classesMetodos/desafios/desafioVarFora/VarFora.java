package classesMetodos.desafios.desafioVarFora;

public class VarFora {
	
	int a = 3;//metodo static não acessa diretamente um componente não static
	static int b = 5; // static acessa diretamente outro static

	public static void main(String[] args) {
		
		VarFora p = new VarFora();
		
		System.out.println(p.a);
		System.out.println(b);

	}

}
