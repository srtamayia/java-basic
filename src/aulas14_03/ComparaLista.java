package aulas14_03;

public class ComparaLista implements Comparable<ComparaLista> {

		private String modelo;
		private int anoModelo;

		// acessa dados
		public ComparaLista(String modelo, int anoModelo) {
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
			return "" +  this.modelo + " (" + this.anoModelo + ")";
		}
	
		// compara os dados
		public int compareTo(ComparaLista novoModelo) {
			return this.modelo.compareTo(novoModelo.modelo);
		}
}
