package inicio;

public class meucarroteste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		carro carro01 = new carro();
		carro carro02 = new carro();
		carro carro03 = new carro();

		carro01.marca = "Ford";
		carro01.modelo ="fusion";
		carro01.cor = "preto";
		carro01.placa= "OXE2G66";
		carro01.combustivel = "flex";
		
		carro02.marca = "Mercedes";
		carro02.modelo ="Classe c sedan";
		carro02.cor = "prata";
		carro02.placa= "OXE3G44";
		carro02.combustivel = "flex";
		
		carro03.marca = "toyota";
		carro03.modelo ="Corolla";
		carro03.cor = "Branco";
		carro03.placa= "FXF4G77";
		carro03.combustivel = "flex";
		
		System.out. println("Carros do meu estoque:" +
							carro01.modelo + ", " +
							carro02.modelo + ", " +
							carro03.modelo
		);
							
	}

}
