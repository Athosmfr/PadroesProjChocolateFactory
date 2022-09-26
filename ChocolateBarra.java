package ExMaquinaChocolate;

public class ChocolateBarra extends Chocolate {

	public int qnt;
	public String tipo = "Barra";
	
	public ChocolateBarra(double preco, int qnt) {
		this.qnt = qnt;
		this.preco = preco;
	}

	public double calculaPreco() {
		return preco * qnt;
	}
}
