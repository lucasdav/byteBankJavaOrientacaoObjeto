package byteBankApp;

public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1223, 12345);
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		
		paulo.setNome("Paulo");
		
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
	}
}
