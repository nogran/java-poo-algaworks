
public class Principal2 {
	
	public static void main(String[] args) {
		
		Proprietario dono1 = new Proprietario();
		dono1.nome = "João Pedro";
		dono1.cpf = "000.000.000-00";
		dono1.idade = 26;
		dono1.logradouro = "Rua João Pinheiro, 10";
		dono1.bairro = "Centro";
		dono1.cidade = "Uberlandia";
		
		Carro meuCarro = new Carro();
		meuCarro.fabricante = "Fiat";
		meuCarro.modelo = "Palio";
		meuCarro.cor = "Prata";
		meuCarro.anoDeFabricacao = 2012;
		meuCarro.dono = dono1;
		
		System.out.println("-----Meu carro-----");
		System.out.println("Dono: " + meuCarro.dono.nome);
		System.out.println("Fabricante: " + meuCarro.fabricante);
		System.out.println("Modelo: " + meuCarro.modelo);
		System.out.println("Cor: " + meuCarro.cor);
		System.out.println("Ano: " + meuCarro.anoDeFabricacao);
		
	}

}
