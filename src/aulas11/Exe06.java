package aulas11;

import java.util.Scanner;

public class Exe06 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio: ");
		
		double raio = scan.nextDouble();
		double pi = Math.PI;
		double resultRaio = Math.pow(raio, 2);
		double area = pi * resultRaio;
		
		System.out.println("Area do circulo: " + area);
		
		
	}

}
