package inicio;

public class carro {

	String cor;
	String marca;
	String modelo;
	String placa;
	String combustivel;
	boolean movimento;
	boolean ligado;
	
	
	void acelerar() {
		if (this.ligado) {
		this.movimento = true;
		}else { 
			this.movimento = false;
		}
	}
	
	void freiar() {
		this.movimento = false;
	}
	
	void ligar() {
		this.movimento = true;
	}
	
	void desligar() {
		this.movimento = false;
	}
	
	
	
}
