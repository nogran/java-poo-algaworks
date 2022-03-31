
public class Principal3 {
	
	public static void main(String[] args) {
		
		Proprietario dono1 = new Proprietario();
		dono1.nome = "Joao da Silva";
		
		Carro meuCarro = new Carro();
		meuCarro.modelo = "Palio";
		
		meuCarro.dono = dono1;
		
		System.out.println("meuCarro.dono.nome: " + meuCarro.dono.nome);
		System.out.println("dono1.nome: " + dono1.nome);
		
	}
}
