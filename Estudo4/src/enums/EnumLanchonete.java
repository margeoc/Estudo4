package enums;

import java.util.Scanner;

public class EnumLanchonete {
	public enum Bebida{
		CocaCola("Coca-Cola", 2.00),
		Suco("Suco", 2.50),
		Agua("Agua", 1.50);
		
		private double preco;
		private String nome;
		
		private Bebida(String nome, double preco){
			this.nome = nome;
			this.preco = preco;
		}
		
		public String getNome(){
			return this.nome;
		}
		public double getPreco(){
			return this.preco;
		}
	}
	public enum Comida{
		Sanduiche("Sanduiche", 4.0),
        HotDog("HotDog", 3.0),
        Xburger("X-Burger", 3.5);
		
		private double preco;
		private String nome;
		
		private Comida(String nome, double preco){
			this.nome = nome;
			this.preco = preco;
		}
		
		public String getNome(){
			return this.nome;
		}
		public double getPreco(){
			return this.preco;
		}
		
	}

	
	public static void menu(){
		System.out.println("Escolha a sua opção no menu: ");
		System.out.println("0. SAIR");
		System.out.println("=====================");
		System.out.println("\tBEBIDAS");
		System.out.println("=====================");
		System.out.println("1. " + Bebida.CocaCola.getNome() + "R$ "+Bebida.CocaCola.getPreco());
		System.out.println("2. " + Bebida.Agua.getNome() + "R$ " + Bebida.Agua.getPreco());
		System.out.println("3. " + Bebida.Suco.getNome() + "R$ "+Bebida.Suco.getPreco());
		System.out.println("=====================");
    	System.out.println("\tCOMIDAS");
		System.out.println("=====================");
		System.out.println("4. " + Comida.HotDog.getNome() + "R$ " + Comida.HotDog.getPreco());
		System.out.println("5. " + Comida.Sanduiche.getNome() + "R$ " + Comida.Sanduiche.getPreco() );
		System.out.println("6. " + Comida.Xburger.getNome() + "R$ " + Comida.Xburger.getPreco());		
		System.out.println("=====================");
	}
	
	public static double soma(int opcao){
		double total=0;
		
		switch(opcao){
			case 1:
				return Bebida.CocaCola.getPreco();
			case 2:
				return Bebida.Agua.getPreco();
			case 3:
				return Bebida.Suco.getPreco();
			case 4:
				return Comida.HotDog.getPreco();
			case 5:
				return Comida.Sanduiche.getPreco();
			case 6:
				return Comida.Xburger.getPreco();
			default: 
				return 0.0;
		}
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double total = 0.0;
		int opcao;
		do{
			menu();
			opcao = entrada.nextInt();
			total+=soma(opcao);
			System.out.println("Valor de sua conta: " + total + "\n");
		} while(opcao!=0);
		
	}
	

}
