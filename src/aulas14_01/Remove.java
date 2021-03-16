package aulas14_01;

import java.util.ArrayList;

public class Remove {

	public static void main(String[] args) {

		String carro01 = "BMW";
		String carro02 = "Ferrari";
		String carro03 = "Honda";

		ArrayList<String> carros = new ArrayList<>();
		carros.add(carro01);
		carros.add(carro02);
		carros.add(carro03);		
		System.out.println(carros);

		// remove um item
		carros.remove(0);
		System.out.println(carros);
		
		// remove tudo
		carros.clear();;
		System.out.println(carros);
		
	}

}
