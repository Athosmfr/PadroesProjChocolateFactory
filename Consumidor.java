package ExMaquinaChocolate;

public class Consumidor {

	public static void main(String[] args) {
		
		Fabrica f = new Fabrica();
		Chocolate choco = f.cadastraChocolate("Barra", 150, 10, 3);
		choco.nome = "Chocolate Barra";
		
		Fabrica test = new Fabrica();
		Chocolate chocotest = test.cadastraChocolate("Barra", 10, 20, 10);
		chocotest.nome = "Chocolate A Granel";
		
		System.out.println(choco.nome + " - " +  choco.calculaPreco());
		System.out.println(chocotest.nome + " - " + chocotest.calculaPreco());
		
	}
	
	
}
