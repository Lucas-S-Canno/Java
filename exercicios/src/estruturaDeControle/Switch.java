package estruturaDeControle;

public class Switch {

	public static void main(String[] args) {
		
		String faixa = "vermelha";
		
		switch(faixa.toLowerCase()) { //Sem o break; ele executa todos os proximos cases
		case "preta":
			System.out.println("Sei o Bassai-Dai");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");
			break;
		default:
			System.out.println("N?o sei nada");
		}
		System.out.println("Fim.");

	}

}
