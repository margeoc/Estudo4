package exercicios;

public class Funcionario {
	 String nome;
	 String RG;
	 String departamento;
	 Data dataEntrada;
	 double salario;
	
	/*
	public Funcionario(String nome, String rG, String departamento,
		String dataEntrada, double salario) {
		
		this.nome = nome;
		RG = rG;
		this.departamento = departamento;
		this.dataEntrada = dataEntrada;
		this.salario = salario;
	}
	*/
	
	public double bonifica(double aumento){
		return salario * aumento/100; 
	}
	
	public double calculaGanhoAnual(){
		return salario*12;
	}
	
	public void mostra(){
		System.out.println("Nome: " + nome);
		System.out.println("Setor: " + departamento);
		System.out.println("Salário: " + salario);
		System.out.println("Ganho anual: " + calculaGanhoAnual());
	}	
}

 
//Classe Data usada para atribuir datas
class Data{
	int dia;
	int mes;
	int ano;
	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
}
