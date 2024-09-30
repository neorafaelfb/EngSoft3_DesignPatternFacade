package Facade;

public class Burguer extends Produto{
	
	private int Gramas;
	
	Burguer(){
		super();
	}
	
	public void setGramas(int Gramas) {
		
		this.Gramas = Gramas;
		
	}
	
	public int getGramas() {
		
		return Gramas;
		
	}
	
}
