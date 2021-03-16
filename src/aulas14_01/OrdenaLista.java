package aulas14_01;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenaLista {

	public static void main(String[] args) {

		String carro01 = "Ferrari";
		String carro02 = "BMW";
		String carro03 = "Honda";

		ArrayList<String> carros = new ArrayList<>();
		carros.add(carro01);
		carros.add(carro02);
		carros.add(carro03);		
		System.out.println(carros);
		
		// ordena crescente
		Collections.sort(carros);
		System.out.println(carros);

		// ordena decrescente
		Collections.reverse(carros);
		System.out.println(carros);

	}

}
