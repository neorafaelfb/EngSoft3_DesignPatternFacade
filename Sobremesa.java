package Facade;

public class Sobremesa extends Produto{
	
	private String Tamanho;
	
	Sobremesa() {
		super();
	}
	
	public void setTamanho(String Tamanho) {
		
		this.Tamanho = Tamanho;
		
	}
	
	public String getTamanho() {
		
		return Tamanho;
		
	}

}
