package classesMetodos.produto;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto(String nomeIn, double precoIn){ //construtor de Produto
		nome = nomeIn;
		preco = precoIn;
	}
	
	Produto(){ //construtor padr�o
		
	}
	
	double PrecoFinal(){
		double precoFinal = preco-(preco*desconto);
		return precoFinal;
	}

}
