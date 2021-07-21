package classesMetodos.desafios.desafioData;
//sem necessidade de importar por estar no mesmo pacote.

public class DataTeste {

	public static void main(String[] args) {

		Data d1 = new Data();
		d1.dia = 16;
		d1.mes = 07;
		d1.ano = 2021;
		
		System.out.printf(d1.formatData());

		Data d2 = new Data();
		d2.dia = 06;
		d2.mes = 9;
		d2.ano = 1547;
		System.out.printf(d2.formatData());
		
		Data d3 = new Data();
		System.out.printf(d3.formatData());
		
	}

}
