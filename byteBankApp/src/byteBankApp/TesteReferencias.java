package byteBankApp;

public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(1234, 12345);
		
		System.out.println("saldo da primeira: " + primeiraConta.getSaldo());
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("saldo da segunda conta: " + segundaConta.getSaldo());
		

		System.out.println("saldo da segunda conta: " + segundaConta.getSaldo());
		
		if(primeiraConta == segundaConta) {
			System.out.println("mesma contas");
		} else {
			System.out.println("contas diferentes");
		}
		
	}
}
