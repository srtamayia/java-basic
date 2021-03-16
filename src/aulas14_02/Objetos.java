package aulas14_02;

import java.util.ArrayList;

public class Objetos {

	public static void main(String[] args) {
		
		ListaObjetos carro01 = new ListaObjetos("Ferrari", 2012);
		ListaObjetos carro02 = new ListaObjetos("BMW", 2000);
		ListaObjetos carro03 = new ListaObjetos("Honda", 2005);

		ArrayList<ListaObjetos> carros = new ArrayList<>();
		carros.add(carro01);
		carros.add(carro02);
		carros.add(carro03);		
		System.out.println(carros);

	}

}
