package byteBankApp;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoLucas = new Conta(1234, 123245);
		contaDoLucas.deposita(50);
		
		System.out.println(contaDoLucas.getSaldo());
		
		boolean conseguiuRetirar = contaDoLucas.saque(20);
		System.out.println(contaDoLucas.getSaldo());
		
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta(1234, 12345);
		contaDaMarcela.deposita(1000);
		
		boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoLucas);
		
		if(sucessoTransferencia) {
			System.out.println("transferencia com sucesso");
		} else {
			System.out.println("saldo insuficiente");
		}
		System.out.println(contaDaMarcela.getSaldo());
		System.out.println(contaDoLucas.getSaldo());
		
		Cliente contaLucas = new Cliente();
		
		contaDoLucas.setTitular(contaLucas);
		System.out.println(contaDoLucas.getTitular());
	}
}
