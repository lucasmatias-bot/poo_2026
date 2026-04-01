package inicio;

import java.util.Scanner;

public class minhaLoja {

	public static void main(String[] args) {
		
		carro meucarro = new carro();
		Drone meuDrone = new Drone();
		Caminhao meeCaminhao = new Caminhao();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o medelo do seu carro: ");
		meucarro.setMarca(sc.nextLine());
		
		System.out.println("Digite a marca do seu carro: " );
		meucarro.setMarca(sc.nextLine());
	
		System.out.println("seu carro e da marca " + meucarro.getMarca() + "e do modelo"
				+ meucarro.getModelo());
		sc.close();
	}
	

}
