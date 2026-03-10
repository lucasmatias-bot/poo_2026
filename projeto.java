

public class projeto {
	
	public static void main(String[] args) {
		
		conta contaCorrente = new conta();
		contaCorrente.dono = "Alexandre";
		contaCorrente.limite = 20000.0;
		contaCorrente.numero = 1234;
		contaCorrente.saldo = 4000.0;
		
		System.out.println("e a conta do(a) " + contaCorrente.dono);
		System.out.println("meu saldo e " + contaCorrente.saldo);
		
		contaCorrente.sacar(1500.0);
		
		System.out.println("meu saldo apos o saque e de " + contaCorrente.saldo);

		
		
		
	}
}
