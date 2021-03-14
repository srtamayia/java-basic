package aulas10;

public class Operadores {

	public static void main(String[] args) {

		// operadores aritmeticos
		int valor = 2 + 3;
		System.out.println(valor);
		
		valor = valor - 1;
		System.out.println(valor);
		
		String primeiroNome = "Coco Verde";
		String segundoNome = " é bom";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);
		
		System.out.println(valor++);
		System.out.println(++valor);
		
		// operadores relacionais
		int num1 = 1;
		int num2 = 2;
		System.out.println("Resultado: " + (num1 == num2));
		
		
		// operadores logicos
		int num3 = 1;
		int num4 = 2;
		
		boolean resultado = (num3 == 1) && (num4 == 2); 
		System.out.println("Resultado: " + resultado);
		
	}

}
