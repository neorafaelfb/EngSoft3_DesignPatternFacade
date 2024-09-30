package Facade;

public class Bebida extends Produto{
	
	private int Ml;
	
	Bebida(){
		super();
	}
	
	public void setMl(int Ml) {
	
		this.Ml = Ml;
		
	}
	
	public int getMl() {
		
		return Ml;
		
	}

}
