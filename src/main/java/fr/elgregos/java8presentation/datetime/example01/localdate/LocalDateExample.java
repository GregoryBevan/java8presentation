package fr.elgregos.java8presentation.datetime.example01.localdate;

import java.time.LocalDate;

public class LocalDateExample {

	public static void main(String[] args) {
		System.out.println("La date du jour est : " + LocalDate.now());
		System.out.println("Jour de la première conférence Java 8 : " + LocalDate.of(2017, 06, 19));
		System.out.println("Jour de la seconde conférence Java 8 : " + LocalDate.parse("2017-06-20"));
 
		System.out.println("La date de demain sera : " + LocalDate.now().plusDays(1));
		System.out.println("Le jour de la semaine est : " + LocalDate.now().getDayOfWeek());
		System.out.println("L'année 2017 est-elle bisextile : " + LocalDate.now().isLeapYear());
		System.out.println("La date de la première conférence est-elle avant aujourd'hui : "
				+ LocalDate.of(2017, 06, 19).isBefore(LocalDate.now()));

	}

}
