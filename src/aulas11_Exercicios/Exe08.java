package aulas11_Exercicios;

import java.util.Scanner;

public class Exe08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto voc� ganha por hora: ");		
		double valor = scan.nextDouble();
		
		System.out.println("Quanto horas de trabalho por m�s: ");
		int horas = scan.nextInt();

		System.out.println("Sal�rio: " + (horas * valor));
		
	}

}
