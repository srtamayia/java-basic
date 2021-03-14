package aulas11;

import java.util.Scanner;

public class Exe07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor da base: ");		
		double base = scan.nextDouble();

		System.out.println("Digite o valor da altura: ");		
		double altura = scan.nextDouble();
		
		double areaQuadrado = base * altura;
		double dobroArea = areaQuadrado * areaQuadrado;
		
		System.out.println("Area do quadrado: " + areaQuadrado);
		System.out.println("Dobro da area: " + dobroArea);
		
	}

}
