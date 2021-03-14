package aulas11;

import java.util.Scanner;

public class Exe11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro:");		
		int num1 = scan.nextInt();
		
		System.out.println("Digite outro numero inteiro:");		
		int num2 = scan.nextInt();

		System.out.println("Digite um numero real:");		
		double num3 = scan.nextDouble();
		
		double resultA = (num1 * 2) * (num2 / 2);
		double resultB = (num1 * 3) + num3;
		double resultC = Math.pow(num3, 3);
				
		System.out.println("a) Resposta: " + resultA);
		System.out.println("b) Resposta: " + resultB);
		System.out.println("c) Resposta: " + resultC);
		

	}

}
