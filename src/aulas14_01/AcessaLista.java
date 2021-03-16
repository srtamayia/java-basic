package aulas14_01;

import java.util.ArrayList;

public class AcessaLista {

	public static void main(String[] args) {
		String carro01 = "BMW";
		String carro02 = "Ferrari";
		String carro03 = "Honda";

		ArrayList<String> carros = new ArrayList<>();
		carros.add(carro01);
		carros.add(carro02);
		carros.add(carro03);		
		System.out.println(carros);
		
		// busca um item
		String acessandoLista = carros.get(0);
		System.out.println(acessandoLista);
		
		// tamanho do array list
		int a = carros.size();
		System.out.println(a);
		
		// tamanho da string
		int b = carro02.length();
		System.out.println(b);

	}

}
