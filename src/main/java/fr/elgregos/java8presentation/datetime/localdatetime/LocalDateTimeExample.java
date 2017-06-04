package fr.elgregos.java8presentation.datetime.localdatetime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		System.out.println("Maintenant : " + LocalDateTime.now());
		System.out.println("Date de début de la présentation : " + LocalDateTime.of(2017, Month.JUNE, 19, 9, 30));
		System.out.println("Date de fin de la présentation : " + LocalDateTime.parse("2017-06-19T11:00"));

		System.out.println("Prochaine session " + LocalDateTime.of(2017, 06, 19, 9, 30).plusDays(1).plusMinutes(30));
		System.out.println("Premier jour du mois prochain " + LocalDateTime.now().with(TemporalAdjusters.firstDayOfNextMonth()));
		System.out.println("Date minimum possible : " + LocalDateTime.MIN);
		System.out.println("Date maximum possible  : " + LocalDateTime.MAX);
	}
}
