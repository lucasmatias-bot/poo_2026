package inicio;

public class meucarroteste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		carro carro01 = new carro();
		carro carro02 = new carro();
		carro carro03 = new carro();

		carro01.setMarca ("Ford");
		carro01.setModelo ("fusion");
		carro01.setCor ("preto");
		carro01.setPlaca("OXE2G66");
		carro01.setCombustivel ("flex");
		
		carro02.setMarca  ("Mercedes");
		carro02.setModelo ("Classe c sedan");
		carro02.setCor ("prata");
		carro02.setPlaca ("OXE3G44");
		carro02.setCombustivel( "flex");
		
		carro03.setMarca( "toyota");
		carro03.setModelo("Corolla");
		carro03.setCor ( "Branco");
		carro03.setPlaca ("FXF4G77");
		carro03.setCombustivel ("flex");
		
		System.out. println("Carros do meu estoque:" +
							carro01.getPlaca() + ", " +
							carro02.getPlaca() + ", " +
							carro03.getPlaca()
		);
							
	}

}
