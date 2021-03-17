package aulas14_04;

import java.util.LinkedList;
import java.util.List;

public class MotoristaColecao {
	private String motorista;
	private double valorCarro;
	private List<ListaColecao> carros = new LinkedList<>();
	
	public MotoristaColecao(String motorista, double valorCarro) {
		this.motorista = motorista;
		this.valorCarro= valorCarro;
	}
	
	public String getModelo() {
		return motorista;
	}
	
	public double getAnoModelo() {
		return valorCarro;
	}

	public List<ListaColecao> getCarro() {
		return  carros;
	}
	
	public String toString() {
		return  "[Motorista: " + this.motorista + "]\n[Valor: R$ " + this.valorCarro + "]" ;
	}
}
