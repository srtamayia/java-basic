package aulas11_Exercicios;

import java.util.Scanner;

public class Exe14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual tamanho do arquivo:");
		double tamArquivo = scan.nextDouble();
		
		System.out.println("Qual velocidade da internet:");
		double velInternet = scan.nextDouble();

		double tempo = tamArquivo / velInternet;
		
		System.out.println("Tempo de download: " + tempo);

	}

}
