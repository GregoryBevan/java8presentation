package fr.elgregos.java8presentation.datetime.example08.datetimeformatter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println("La date du jour : " + DateTimeFormatter.ISO_DATE.format(now));
		System.out.println("Il est : " + DateTimeFormatter.ofPattern("hh:mm").format(now));
		
		
		String talkDate = "lundi 19 juin 2017";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy");
		LocalDate parsedDate = LocalDate.parse(talkDate, formatter);
		System.out.println("La date de la conférence : " + parsedDate);

	}

}
