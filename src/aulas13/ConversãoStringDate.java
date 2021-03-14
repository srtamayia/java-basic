package aulas13;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ConversãoStringDate {

	public static void main(String[] args) throws ParseException{
		
		Calendar c = Calendar.getInstance();
		Date data = c.getTime();
		
		SimpleDateFormat formatoSimplesData = new SimpleDateFormat();
		DateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
		
		Date dataFormatada = formato.parse("12-01-2019");
		System.out.println("Data formatada: " + dataFormatada);		

	}

}
