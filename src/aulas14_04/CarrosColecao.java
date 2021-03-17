package aulas14_04;

import java.util.List;
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
		
		MotoristaColecao motorista = new MotoristaColecao(nomeMotorista, precoVenda);
		List<ListaColecao> carro = motorista.getCarro();
		System.out.println(motorista);
	
		motorista.getCarro().add(new ListaColecao(modeloCarro, anoCarro));
		System.out.println(carro);
		
	}

}
