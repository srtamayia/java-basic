package aulas11_Exercicios;

import java.util.Scanner;

public class Exe05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor: ");

		double metro = scan.nextDouble();
		double centimetro = metro / 100;

		System.out.println("Centimetros: "+ centimetro);

	}

}
