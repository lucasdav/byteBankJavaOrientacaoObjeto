package byteBankApp;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente lucas = new Cliente();
		lucas.setNome("Lucas Davanso");
		lucas.setCpf("222.222.222-22");
		lucas.setProfissao("engenheiro");
		
		Conta contaDoLucas = new Conta(1234, 12345);
		contaDoLucas.deposita(100);
		
		contaDoLucas.setTitular(lucas);
		System.out.println(contaDoLucas.getTitular());
	};
}
