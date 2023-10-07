package byteBankApp;

public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24436);
		System.out.println(conta.getSaldo());
		
		Cliente contadaMarcela = new Cliente();
		
		//contaDaMarcela.titular = new Cliente();
		
		// exemplo de exception abaixo pois nao existe o titular acima em comentario a solucao criando a referencia
		conta.setTitular(contadaMarcela);
		System.out.println(conta.getTitular());
	}
}
