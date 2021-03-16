package aulas14_02;

public class ListaObjetos {

	private String modelo;
	private int anoModelo;

	// acessa dados
	public ListaObjetos(String modelo, int anoModelo) {
		this.modelo = modelo;
		this.anoModelo = anoModelo;
	}
	
	// obtem o modelo
	public String getModelo() {
		return modelo;
	}

	// obtem o ano do modelo
	public int getAnoModelo() {
		return anoModelo;
	}

	// imprime os dados
	public String toString() {
		return "\n[Modelo: "+ this.modelo + " - " + this.anoModelo + "]";
	}


}
