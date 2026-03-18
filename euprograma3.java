package inicio;

public class euprograma3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		conta contaCorrente = new conta();
		contaCorrente.dono = "lucas";
		contaCorrente.limite = 20000;
		contaCorrente.saldo = 4000.0;
		
		System.out.println("É a conta do(a) " + contaCorrente.dono);
		System.out.println("meu saldo é " + contaCorrente.saldo);
		
		contaCorrente.sacar(1500.0);
		
		System.out.println("meu saldo após saque é de " + contaCorrente.saldo);
	}

}
