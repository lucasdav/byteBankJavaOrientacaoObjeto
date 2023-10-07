package byteBankApp;

public class TesteSacaNegativo {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1234, 12345);
		conta.deposita(100);
		System.out.println(conta.saque(101));
		System.out.println(conta.getSaldo());
	}
}
