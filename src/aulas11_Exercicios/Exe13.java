package aulas11_Exercicios;

import java.util.Scanner;

public class Exe13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Quanto ganhas por hora:");
		double valor = scan.nextDouble();
		
		System.out.println("Quanto horas trabalhadas no mes:");
		int horas = scan.nextInt();
		
		double salarioMes = valor * horas;
		double impostoRenda = salarioMes * 11 / 100;
		double INSS = salarioMes * 8 / 100;
		double sindicato = salarioMes * 5/100;
		double descontoTotal = impostoRenda + INSS + sindicato;
		
		double SalarioLiquido = salarioMes - descontoTotal;
		
		System.out.println("Salário bruto: " + salarioMes);
		System.out.println("Pago ao INSS: " + INSS);
		System.out.println("Pago ao sindicato: " + sindicato);
		System.out.println("Total de descontos: " + descontoTotal);
		System.out.println("Salário liquido: " + SalarioLiquido);
		
	}

}
