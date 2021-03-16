package aulas14_01;

import java.util.ArrayList;

public class PercorreLista {

	public static void main(String[] args) {
		
		String carro01 = "BMW";
		String carro02 = "Ferrari";
		String carro03 = "Honda";

		ArrayList<String> carros = new ArrayList<>();
		carros.add(carro01);
		carros.add(carro02);
		carros.add(carro03);		
		System.out.println(carros);

		// percorrendo lista
		for(String carro : carros) {
			System.out.println(carro);
		}
		
		// percorrendo lista		
		carros.forEach(carro -> {
			System.out.println(carro);
		});
		
	}

}
