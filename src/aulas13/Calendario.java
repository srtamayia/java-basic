package aulas13;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Calendario {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Calendario Instanciado
		Calendar c = Calendar.getInstance();
		
		Date data = c.getTime();
		
		Locale brasil = new Locale("pt","BR");
		Locale eua = Locale.US;
		Locale alemanha = Locale.GERMAN;
		
		// LOCALIDADE (DIA DA SEMANA e DATA)
		
		// Localidade Brasil: terça-feira, 9 de março de 2021
		DateFormat formatoDataSemanaBrasil = DateFormat.getDateInstance(DateFormat.FULL, brasil);
		System.out.println("Data Brasil: " + formatoDataSemanaBrasil.format(data));		
		
		// Localidade Estados Unidos: Tuesday, March 9, 2021
		DateFormat formatoDataSemanaEUA = DateFormat.getDateInstance(DateFormat.FULL, eua);
		System.out.println("Data EUA: " + formatoDataSemanaEUA.format(data));		
		
		// Localidade Alemanha: Dienstag, 9. März 2021
		DateFormat formatoDataSemanaAlemanha = DateFormat.getDateInstance(DateFormat.FULL, alemanha);
		System.out.println("Data Alemanha: " + formatoDataSemanaAlemanha.format(data));		
		
		// DIA DA SEMANA, DATA e HORA
		
		// formato de data: Tue Mar 09 20:11:01 BRT 2021
		System.out.println("Dia da Semana, data e hora: " + c.getTime());				
		
		// formato de data: Tue Mar 09 20:11:01 BRT 2021
		System.out.println("Dia da Semana, data e hora: " + data);		
		
		// DATA
		
		// formato de data: 9 de mar. de 2021
		DateFormat formatoData = DateFormat.getDateInstance();
		System.out.println("Data: " + formatoData.format(data));		
		
		// formato da data: 9 de março de 2021
		DateFormat formatoDataLong = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("Data: " + formatoDataLong.format(data));		

		// formato da data: 9 de mar. de 2021
		DateFormat formatoDataMedium = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("Data: " + formatoDataMedium.format(data));			
		
		// formato da data: 09/03/2021
		DateFormat formatoDataShort = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("Data: " + formatoDataShort.format(data));			

		// HORA	
		
		// formato da hora: 20:11:01
		DateFormat formatoHora = DateFormat.getTimeInstance();
		System.out.println("Hora: " + formatoHora.format(data));		
		
		// formato da hora full: 20:19:04 Horário Padrão de Brasília
		DateFormat formatoHoraFull = DateFormat.getTimeInstance(DateFormat.FULL);
		System.out.println("Hora: " + formatoHoraFull.format(data));		

		// formato da hora: 20:23:50 BRT
		DateFormat formatoHoraLong = DateFormat.getTimeInstance(DateFormat.LONG);
		System.out.println("Hora: " + formatoHoraLong.format(data));		
		
		// formato da data: 20:37:33
		DateFormat formatoTimeMedium = DateFormat.getTimeInstance(DateFormat.MEDIUM);
		System.out.println("Data: " + formatoTimeMedium.format(data));			
		
		// formato da data: 20:37
		DateFormat formatoTimeShort = DateFormat.getTimeInstance(DateFormat.SHORT);
		System.out.println("Data: " + formatoTimeShort.format(data));			

		// DATA e HORA
		
		// formato da date e hora: 9 de mar. de 2021 20:11:01
		DateFormat formatoDataHora = DateFormat.getDateTimeInstance();
		System.out.println("Data e hora: " + formatoDataHora.format(data));		
								
		// DATA e DIA DA SEMANA
		
		// formato da date e dia da semana: terça-feira, 9 de março de 2021
		DateFormat formatoSemanaData = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("Data e dia da semana: " + formatoSemanaData.format(data));		
		
	}

}
