package exercicios;

public class FuncionarioApp {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.nome = "João";
		f1.RG = "12345";
		f1.departamento = "TI";
		f1.salario = 1000;
		f1.dataEntrada.setDia(4);
		f1.dataEntrada.setMes(8);
		f1.dataEntrada.setAno(2004);
		double bonus = f1.bonifica(30);
		double salario = f1.salario;
		System.out.println("Salario mais bonus: " + (bonus + salario));
		System.out.println();
		f1.mostra();
		
		Funcionario f2 = new Funcionario();
		f2.nome = "Carlos";
		
		f2.departamento = "RH";
		f2.RG = "23423";
		f2.salario = 2000;
		
		System.out.println("Antes");
		f2.mostra();
		f2 = f1;
		System.out.println("Depois");
		f2.mostra();
		
		
	}
}
