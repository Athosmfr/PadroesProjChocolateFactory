package ExMaquinaChocolate;

public class ChocolateAGranel extends Chocolate {

	public double peso;
	public String tipo = "AGranel";
	
	public ChocolateAGranel(double preco, double peso) {
		this.preco = preco;
		this.peso = peso;
	}

	@Override
	public double calculaPreco() {
		return preco * peso;
	}
	
	
	
	
}
