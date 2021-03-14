package aulas07;

public class VariaveisDecHexOctBin {

	public static void main(String[] args) {

		int dec = 26;
		int hex = 0x1a;
		int oct = 032;
		int bin = 0b11010;
		
		System.out.println("" + dec);
		System.out.println("" + hex);
		System.out.println("" + oct);
		System.out.println("" + bin);	

		/*
		
		//não pode colocar underscore ao lado do ponto.
		float pi1 = 3_.1415F;
		float pi2 = 3._1415F;
		
		// não pode colocar underscore perto de sufixo.
		float pi3 = 3.1415_F;
		
		// identificador, não é literal
		int x1 = _52;
		
		// ok. decimal literal
		int x2 = 5_2;
		
		// não pode colocar underscore no final de um literal
		int x3 = 52_;

		// não pode colocar underscore perto de prefixo
		int x4 = 0x_52;
		int x5 = 0_x52;
		
		// ok. hexadecimal literal
		int x6 = 0x5_2;
		
		// não pode colocar underscore no final de um literal
		int x7 = 0x52_;

		*/
				
		int hex31 = 031;
		int dec25 = 25;
		
		System.out.println(hex31 == dec25);
	
	}

}
