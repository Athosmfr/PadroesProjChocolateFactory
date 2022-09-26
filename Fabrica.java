package ExMaquinaChocolate;

public class Fabrica {

	public Chocolate cadastraChocolate(String tipo, double preco, double peso, int qnt) {
		
		
		if(tipo == "Barra") {
			return new ChocolateBarra(preco, qnt);
		} else if (tipo == "AGranel") {
			return new ChocolateAGranel(preco, peso);
		}
		return null; // test
		
	}
	
}
