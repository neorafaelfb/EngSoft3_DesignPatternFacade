package Facade;

public class Produto {
	
	private String Descricao;
	private double Preco;
	
	public void setDescricao(String Descricao) {
		
		this.Descricao = Descricao;
		
	}
	
	public void setPreco(double Preco) {
		
		this.Preco = Preco;
		
	}
	
	public String getDescricao() {
		
		return Descricao;
		
	}
	
	public double getPreco() {
		
		return Preco;
		
	}
}
