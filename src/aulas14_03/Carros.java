package aulas14_03;

import java.util.ArrayList;

public class Carros {

	public static void main(String[] args) {

		ComparaLista carro01 = new ComparaLista("Ferrari", 2012);
		ComparaLista carro02 = new ComparaLista("BMW", 2000);
		ComparaLista carro03 = new ComparaLista("Honda", 2005);

		ArrayList<ComparaLista> carros = new ArrayList<>();
		carros.add(carro01);
		carros.add(carro02);
		carros.add(carro03);		
		System.out.println(carros);
				
		// comparando string
		int comparando = carro01.compareTo(carro02);
		System.out.println(comparando);
		
		// negativo
		if ( comparando < 0 ) {
			System.out.println("O modelo " + carro01 + " tem palavra menor que o modelo " + carro02);
		} 
		// igual 0
		else  if (comparando == 0) {
			System.out.println("O modelo " + carro01 + " tem palavra igual ao modelo " + carro02);			
		} 
		// positivo
		else {
			System.out.println("O modelo " + carro01 + " tem palavra maior que o modelo " + carro02);						
		}

	}

}
