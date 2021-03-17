package aulas14_05;

public class AdicionaMotoristaColecao {
		
		private String modelo;
		private int anoModelo;
		
		public AdicionaMotoristaColecao(String modelo, int anoModelo) {
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
