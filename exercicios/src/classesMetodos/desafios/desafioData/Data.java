package classesMetodos.desafios.desafioData;

public class Data {

//	int dia = 1;
//	int mes = 1;
//	int ano = 1970;
	int dia;
	int mes;
	int ano;

	//construtores
	//Padrão
	Data(){
		this(1, 1, 1970);
	}
	
	Data(int dia, int mes, int ano){
		this.dia = dia; //metodo static não é possivel usar o this.
		this.mes = mes;
		this.ano = ano;
	}
	
	String formatData(){
		return String.format("%d/%d/%d%n%n",dia,mes,ano);
	}
	
	//1/1/1970 data padrão
	
}
