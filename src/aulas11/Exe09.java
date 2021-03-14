package aulas11;

import java.util.Scanner;

public class Exe09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Farenheit:");
		
		double far = scan.nextDouble();
		double celsius = 5 *(far - 32) / 9;
		
		System.out.println("Celsius: " + celsius);
		

	}

}
