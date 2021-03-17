package aulas11_Exercicios;

import java.util.Scanner;

public class Exe04 {

		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Digite 1ª media :");
			double nota1 = scan.nextDouble();
			
			System.out.println("Digite 2ª media :");
			double nota2 = scan.nextDouble();
			
			System.out.println("Digite3ª media :");
			double nota3 = scan.nextDouble();
			
			System.out.println("Digite 1ª media :");
			double nota4 = scan.nextDouble();
			
			double media = (nota1 + nota2 + nota3 + nota4) / 4;
			
			System.out.println("\n A média é: " + media);
			
		}
		
}
