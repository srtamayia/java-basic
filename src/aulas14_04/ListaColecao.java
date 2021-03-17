package aulas14_04;

public class ListaColecao {
	
	private String modelo;
	private int anoModelo;
	
	public ListaColecao(String modelo, int anoModelo) {
		this.modelo = modelo;
		this.anoModelo = anoModelo;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public int getAnoModelo() {
		return anoModelo;
	}

	public String toString() {
		return "Modelo: " + this.modelo + "]\n[Ano: " + this.anoModelo;
	}
	
}
