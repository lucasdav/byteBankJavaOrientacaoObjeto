package byteBankApp;

public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta(1234, 12345);
		primeiraConta.getSaldo();
		System.out.println(primeiraConta.getSaldo());
		
		Conta segundaConta = new Conta(1234, 12345);
		
		System.out.println("primeira conta tem " + primeiraConta.getSaldo());
		System.out.println("segunda conta tem " + segundaConta.getSaldo());
		
		System.out.println(primeiraConta.getAgencia());
		System.out.println(primeiraConta.getNumero());
		
		System.out.println(segundaConta.getTitular());
		
		segundaConta.setAgencia(146);
		System.out.println("agora a segunda conta esta"
				+ " na agencia " + segundaConta.getAgencia());
		
	}
}
