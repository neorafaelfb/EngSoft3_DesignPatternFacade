package Facade;

public class Combo {
	
	Bebida bebida;
	Burguer burguer;
	Sobremesa sobremesa;
	
	Combo(){
		this.bebida = new Bebida();
		this.burguer = new Burguer();
		this.sobremesa = new Sobremesa();
	}
	
	public void CriarCombo(int tipo) {
		
		switch (tipo) {
		
			case 1:
				
				bebida.setDescricao("Coca-Cola");
				bebida.setPreco(5.90);
				bebida.setMl(350);
				
				burguer.setDescricao("Big Mac");
				burguer.setPreco(22.90);
				burguer.setGramas(204);
				
				sobremesa.setDescricao("Torta de Maçã");
				sobremesa.setPreco(8.50);
				sobremesa.setTamanho("Médio");
				
				break;
			
			case 2:
				
				bebida.setDescricao("Pepsi");
				bebida.setPreco(4.90);
				bebida.setMl(350);
				
				burguer.setDescricao("Big Mac");
				burguer.setPreco(26.90);
				burguer.setGramas(361);
				
				sobremesa.setDescricao("Balde de Brownie");
				sobremesa.setPreco(12.50);
				sobremesa.setTamanho("Grande");
				
				break;
			
			default:
				System.out.println("Combo desconhecido.");
				break;
			
		}
		
	}
	
	 @Override
	 public String toString() {
		 return "Combo:\n" +
	                "Bebida: " + bebida.getDescricao() + ", " + bebida.getMl() + "ml, Preço: R$ " + bebida.getPreco() + "\n" +
	                "Burguer: " + burguer.getDescricao() + ", " + burguer.getGramas() + "g, Preço: R$ " + burguer.getPreco() + "\n" +
	                "Sobremesa: " + sobremesa.getDescricao() + ", Tamanho: " + sobremesa.getTamanho() + ", Preço: R$ " + sobremesa.getPreco();
	 }
	 
}
