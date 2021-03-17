package aulas14_05;

import java.util.Scanner;

public class CarrosColecao {

	public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
		
		System.out.println("Nome do motorista: ");
		String nomeMotorista = scan.nextLine();
		
		System.out.println("Modelo do carro: ");
		String modeloCarro	= scan.nextLine();	
		
		System.out.println("Ano de fabricação: ");
		int anoCarro = scan.nextInt();			
		
		System.out.println("Preço de venda: ");
		Double precoVenda	= scan.nextDouble();
		
		
		// dados motorista
		AdicionaCarroColecao javaColecao = new AdicionaCarroColecao(nomeMotorista, precoVenda);
		// dados carro
		javaColecao.adiciona(new AdicionaMotoristaColecao(modeloCarro, anoCarro));
		
		// imprime motorista e preço 
		System.out.println(javaColecao);
		// imprime modelo e ano
		System.out.println(javaColecao.getCarro());
		
	}

}
