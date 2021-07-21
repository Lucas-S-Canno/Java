package classesMetodos.produto;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4999.99); //craido a partir do no construtor de Produto
		
		var p2 = new Produto(); // feito com o construtor padrão
		p2.nome = "Caneta";
		p2.preco = 5.90;
		
		System.out.printf("Produto: %s %nPreço: %.2f %nDesconto: %.2f %nPreço Final: %.2f%n%n", p1.nome, p1.preco, Produto.desconto, p1.PrecoFinal());
		System.out.printf("Produto: %s %nPreço: %.2f %nDesconto: %.2f %nPreço Final: %.2f%n%n", p2.nome, p2.preco, Produto.desconto = 0.5, p2.PrecoFinal());
		System.out.printf("Produto: %s %nPreço: %.2f %nDesconto: %.2f %nPreço Final: %.2f%n%n", p1.nome, p1.preco, Produto.desconto, p1.PrecoFinal());

	}

}
