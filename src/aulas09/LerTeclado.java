package aulas09;

import java.util.Scanner;

public class LerTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// ler linha inteira
		System.out.println("Escreva uma frase: ");
		String frase = scan.nextLine();	
		System.out.println("A frase é: " + frase);


		// ler um tipo especifico
		System.out.println("Qual seu nome, sua idade, sua altura e se gosta de sorvete: ");

		String nome = scan.next();
		int idade = scan.nextInt();
		double altura = scan.nextDouble();		
		boolean sorvete = scan.nextBoolean();
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("Gosta de sorvete: " + sorvete);
		
	}
	
}
