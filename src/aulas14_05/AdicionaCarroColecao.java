package aulas14_05;

import java.util.LinkedList;
import java.util.List;

public class AdicionaCarroColecao {

		private String motorista;
		private double valorCarro;
		private List<AdicionaMotoristaColecao> carros = new LinkedList<>();
		
		public AdicionaCarroColecao(String motorista, double valorCarro) {
			this.motorista = motorista;
			this.valorCarro= valorCarro;
		}
		
		public String getModelo() {
			return motorista;
		}
		
		public double getAnoModelo() {
			return valorCarro;
		}

		public List<AdicionaMotoristaColecao> getCarro() {
			return  carros;
		}
		
		public String toString() {
			return  "[Motorista: " + this.motorista + "]\n[Valor: R$ " + this.valorCarro + "]" ;
		}
		
		public void adiciona(AdicionaMotoristaColecao novoCarro) {
			this.carros.add(novoCarro);
		}
}
