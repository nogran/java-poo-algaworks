
public class Principal {
	
	public static void main(String[] args) {
		
		Carro meuCarro; // declarar a variavel. Carro tipo variavel e carro nome da variavel
		meuCarro = new Carro(); // instanciar a variavel carro com um objetio do tipo Carro
		meuCarro.fabricante = "Fiat";
		meuCarro.modelo = "Palio";
		meuCarro.anoDeFabricacao = 2011;
		meuCarro.cor = "Prata";
		
		Carro seuCarro = new Carro(); // em apenas 1 linha
		seuCarro.fabricante = "Honda";
		seuCarro.modelo = "Civic";
		seuCarro.anoDeFabricacao = 2012;
		seuCarro.cor = "Preto";
		
		System.out.println("-----Meu carro-----");
		System.out.println("Fabricante: " + meuCarro.fabricante);
		System.out.println("Modelo: " + meuCarro.modelo);
		System.out.println("Cor: " + meuCarro.cor);
		System.out.println("Ano: " + meuCarro.anoDeFabricacao);
		
		System.out.println();
		System.out.println("-----Seu carro-----");
		System.out.println("Fabricante: " + seuCarro.fabricante);
		System.out.println("Modelo: " + seuCarro.modelo);
		System.out.println("Cor: " + seuCarro.cor);
		System.out.println("Ano: " + seuCarro.anoDeFabricacao);
		
	}

}
