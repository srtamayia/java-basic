package aulas11;

import java.util.Scanner;

public class Exe10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius:");
		
		double celsius = scan.nextDouble();
		
		double far = 9 * celsius / 5 + 32;
		
		System.out.println("Farenheit: " + far);		
		
	}

}
