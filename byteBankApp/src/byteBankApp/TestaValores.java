package byteBankApp;

public class TestaValores {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(1234, 12345);
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1234, 4444444);
		Conta conta3 = new Conta(1334, 234444);
		
		System.out.println(Conta.getTotal());
	}
}
