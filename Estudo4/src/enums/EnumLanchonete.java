package enums;

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
}
